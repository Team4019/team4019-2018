package frc.team4019.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Climber {
	TalonGroup talonsLeft;
	TalonGroup talonsRight;

	public Climber() {
		this.talonsLeft = new TalonGroup(Constants.climber.left.throttle, Constants.climber.left.talonID);
		this.talonsRight = new TalonGroup(Constants.climber.right.throttle, Constants.climber.right.talonID);
		this.talonsLeft.setInverted(Constants.climber.left.invert);
		this.talonsLeft.setInverted(Constants.climber.right.invert);
	}

	public void climb(double speed) {
		this.talonsLeft.set(speed * Constants.climber.throttle);
		this.talonsRight.set(speed * Constants.climber.throttle);
		SmartDashboard.putString(Constants.climber.dashboard, "CLIMB: SPEED: " + Math.round(speed * 100) + "%");
	}
}
