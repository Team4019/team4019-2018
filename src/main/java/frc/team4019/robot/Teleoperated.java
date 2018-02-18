package frc.team4019.robot;

public class Teleoperated {
	public static void init() {

	}

	public static void periodic() {
		// Driver stick
		if (!Robot.stickDrive.getRawButton(1)) {
			Robot.drive.arcadeDrive(-Robot.stickDrive.getY(), Robot.stickDrive.getX(), Robot.stickDrive.getThrottle() / -2 + 0.5);
			Robot.climber.climb(0);
		} else {
			Robot.drive.arcadeDrive(0, 0, 0);
			Robot.climber.climb(-Robot.stickDrive.getY());
		}

		// Operator stick
		Robot.grabber.grab((Robot.stickOperate.getPOV() + 90) / 90);
		Robot.elevator.lift(-Robot.stickOperate.getY());
	}
}
