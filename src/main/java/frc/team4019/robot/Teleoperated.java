package frc.team4019.robot;

public class Teleoperated {
	public static void init() {

	}

	public static void periodic() {
		// Driver stick
		Robot.drive.arcadeDrive(-Robot.stickDrive.getY(), Robot.stickDrive.getX(), Robot.stickDrive.getThrottle() / -2 + 0.5);
		if (Robot.stickDrive.getRawButton(Constants.climber.control.buttonUp)) {
			Robot.climber.climb(Robot.stickDrive.getRawAxis(Constants.climber.control.axisThrottle) / -2 + 0.5);
		} else if (Robot.stickDrive.getRawButton(Constants.climber.control.buttonDown)) {
			Robot.climber.climb(-(Robot.stickDrive.getRawAxis(Constants.climber.control.axisThrottle) / -2 + 0.5));
		} else {
			Robot.climber.climb(0);
		}

		// Operator stick
		Robot.grabber.grab((Robot.stickOperate.getPOV() + 90) / 90);
		Robot.elevator.lift(-Robot.stickOperate.getY());
	}
}
