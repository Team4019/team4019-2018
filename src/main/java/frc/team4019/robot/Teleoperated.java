package frc.team4019.robot;

public class Teleoperated {
	public static void init() {

	}

	public static void periodic() {
		if (!Robot.stickDrive.getRawButton(1)) {
			Robot.drive.arcadeDrive(-Robot.stickDrive.getY(), Robot.stickDrive.getX(), Robot.stickDrive.getThrottle() / -2 + 0.5);
			Robot.climber.climb(0);
		} else {
			Robot.drive.arcadeDrive(0, 0, 0);
			Robot.climber.climb(-Robot.stickDrive.getY());
		}
	}
}
