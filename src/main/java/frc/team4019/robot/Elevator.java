package frc.team4019.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Elevator {
	TalonGroup talons;

	public Elevator() {
		this.talons = new TalonGroup(Constants.elevator.right.throttle * Constants.elevator.throttle, Constants.elevator.right.talonID);
		this.talons.setInverted(Constants.elevator.right.invert);
	}

	public void lift(double speed) {
		this.talons.set(speed);
		SmartDashboard.putString(Constants.elevator.dashboard, "LIFT: SPEED: " + Math.round(speed * 100));
	}
}
