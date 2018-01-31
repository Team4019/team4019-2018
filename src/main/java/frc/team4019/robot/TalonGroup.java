package frc.team4019.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import java.util.ArrayList;

public class TalonGroup {
	ArrayList<TalonSRX> talons;
	double throttle;

	TalonGroup(double throttle, int... args) {
		this.throttle = throttle;
		this.talons = new ArrayList<>();
		for (int arg : args) {
			talons.add(new TalonSRX(arg));
		}
	}

	public void set(double value) {
		for (TalonSRX talon : this.talons) {
			talon.set(ControlMode.Current, value * this.throttle);
		}
	}

	public void setInverted(boolean value) {
		for (TalonSRX talon : this.talons) {
			talon.setInverted(value);
		}
	}
}
