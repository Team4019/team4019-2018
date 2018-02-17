package frc.team4019.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drive {
	TalonGroup talonsLeft;
	TalonGroup talonsRight;

	public Drive() {
		this.talonsLeft = new TalonGroup(Constants.drive.left.throttle, Constants.drive.left.driveID);
		this.talonsRight = new TalonGroup(Constants.drive.right.throttle, Constants.drive.right.driveID);
		this.talonsLeft.setInverted(Constants.drive.left.invert);
		this.talonsRight.setInverted(Constants.drive.right.invert);
	}

	public void arcadeDrive(double forward, double rotation, double throttle) {
		this.talonsLeft.set((forward + rotation) * throttle * Constants.drive.throttle);
		this.talonsRight.set((forward - rotation) * throttle * Constants.drive.throttle);
		SmartDashboard.putString(Constants.drive.dashboard, "DRIVE: ARCADE; " + Math.round(throttle * 100) + "%");
	}

	public void arcadeDrive(double forward, double rotation) {
		this.arcadeDrive(forward, rotation, 1);
	}

	public void tankDrive(double left, double right, double throttle) {
		this.talonsLeft.set(left * throttle * Constants.drive.throttle);
		this.talonsRight.set(right * throttle * Constants.drive.throttle);
	}

	public void tankDrive(double left, double right) {
		this.tankDrive(left, right, 1);
	}
}
