package frc.team4019.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import java.util.ArrayList;

public class TalonGroup {
	ArrayList<TalonSRX> talons;
	TalonSRX encoder;
	double throttle;

	TalonGroup(double throttle, int... args) {
		this.throttle = throttle;
		this.talons = new ArrayList<>();
		for (int arg : args) {
			TalonSRX talon = new TalonSRX(arg);
			talons.add(new TalonSRX(arg));
		}
	}

	TalonGroup(double throttle, int encoderID, int... args) {
		this.throttle = throttle;
		this.talons = new ArrayList<>();
		for (int arg : args) {
			TalonSRX talon = new TalonSRX(arg);
			talons.add(new TalonSRX(arg));
			if (arg == encoderID) {
				this.encoder = talon;
			}
		}
	}

	public void set(double value) {
		for (TalonSRX talon : this.talons) {
			talon.set(ControlMode.PercentOutput, value * this.throttle);
		}
	}

	public void setInverted(boolean value) {
		for (TalonSRX talon : this.talons) {
			talon.setInverted(value);
		}
	}

	public int getPosition() {
		return this.encoder.getSensorCollection().getPulseWidthPosition();
	}
}
