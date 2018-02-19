package frc.team4019.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Grabber {
	TalonGroup talonsLeft;
	TalonGroup talonsRight;
	TalonGroup talonsArm;

	public Grabber() {
		this.talonsLeft = new TalonGroup(Constants.grabber.left.throttle * Constants.grabber.throttle, Constants.grabber.left.talonID);
		this.talonsRight = new TalonGroup(Constants.grabber.right.throttle * Constants.grabber.throttle, Constants.grabber.right.talonID);
		this.talonsArm = new TalonGroup(Constants.grabber.arm.throttle * Constants.grabber.throttle, Constants.grabber.arm.talonID);
		this.talonsLeft.setInverted(Constants.grabber.left.invert);
		this.talonsLeft.setInverted(Constants.grabber.right.invert);
		this.talonsArm.setInverted(Constants.grabber.arm.invert);
	}

	public void grab(int direction) {
		String state = "DISABLED";
		if (direction == 1) {
			this.talonsLeft.set(1);
			this.talonsRight.set(1);
			state = "DELIVER";
		} else if (direction == 2) {
			this.talonsLeft.set(1);
			this.talonsRight.set(-1);
			state = "RIGHT";
		} else if (direction == 3) {
			this.talonsLeft.set(-1);
			this.talonsRight.set(-1);
			state = "INTAKE";
		} else if (direction == 4) {
			this.talonsLeft.set(-1);
			this.talonsRight.set(1);
			state = "LEFT";
		} else {
			this.talonsLeft.set(0);
			this.talonsRight.set(0);
		}
		SmartDashboard.putString(Constants.grabber.dashboard, "GRABBER: " + state);
	}

	public void arm(int speed) {
		this.talonsArm.set(speed);
	}
}
