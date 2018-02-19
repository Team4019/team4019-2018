package frc.team4019.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Teleoperated {
	public static void init() {

	}

	public static void periodic() {
		// Driver stick
		double forward = -Robot.stickDrive.getRawAxis(Constants.drive.control.axisForward);
		double rotation = Robot.stickDrive.getRawAxis(Constants.drive.control.axisRotation);
		double throttle = Robot.stickDrive.getRawAxis(Constants.drive.control.axisThrottle) / -2 + 0.5;
		if (Robot.stickDrive.getRawButton(Constants.climber.control.buttonUp)) {
			Robot.climber.climb(Robot.stickDrive.getRawAxis(Constants.climber.control.axisThrottle) / -2 + 0.5);
		} else if (Robot.stickDrive.getRawButton(Constants.climber.control.buttonDown)) {
			Robot.climber.climb(-(Robot.stickDrive.getRawAxis(Constants.climber.control.axisThrottle) / -2 + 0.5));
		} else {
			Robot.climber.climb(0);
		}
		if (Robot.stickDrive.getRawButton(Constants.gyro.control.buttonReset)) {
			Robot.gyro.reset();
		}
		if (Robot.stickDrive.getRawButton(Constants.gyro.control.buttonAlign)) {
			rotation = Robot.gyro.getAlignment(Robot.stickDrive.getPOV());
			SmartDashboard.putString("DB/String 4", String.valueOf(rotation));

		}

		// Operator stick
		Robot.grabber.grab((Robot.stickOperate.getPOV() + 90) / 90);
		Robot.elevator.lift(-Robot.stickOperate.getRawAxis(Constants.elevator.control.axisSpeed));
		if (Robot.stickOperate.getRawButton(Constants.grabber.control.buttonUp)) {
			Robot.grabber.arm(1);
		} else if (Robot.stickOperate.getRawButton(Constants.grabber.control.buttonDown)) {
			Robot.grabber.arm(-1);
		} else {
			Robot.grabber.arm(0);
		}
		if (Robot.stickOperate.getRawButton(Constants.gyro.control.buttonReset)) {
			Robot.gyro.reset();
		}
		if (Robot.stickOperate.getRawButton(Constants.gyro.control.buttonAlign)) {
			double theta = Math.toDegrees(Math.atan2(Robot.stickOperate.getRawAxis(Constants.gyro.control.axisCos), -Robot.stickOperate.getRawAxis(Constants.gyro.control.axisSin)));
			SmartDashboard.putString("DB/String 4", String.valueOf(theta));
			rotation = Robot.gyro.getAlignment(theta);
		}

		// Execute driving
		Robot.drive.arcadeDrive(forward, rotation, throttle);
	}
}
