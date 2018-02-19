package frc.team4019.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Gyro {
	ADXRS450_Gyro gyro;

	public Gyro() {
		this.gyro = new ADXRS450_Gyro();
		this.gyro.reset();
	}

	public void reset() {
		this.gyro.reset();
	}

	public double getRawAngle() {
		return this.gyro.getAngle();
	}

	public double getAngle() {
		double current = this.gyro.getAngle();
		return (Math.signum(current) == -1) ? 360 + current : current;
	}

	public double getAlignment(double target) {
		target = (target == -1) ? 0.0 : target;
		double current = this.getAngle();
		double difference = current - target;
		double rotation = 0;
		double temp = SmartDashboard.getNumber("DB/Slider 0", 5) * 18;
		difference %= 360;
		difference = (Math.signum(difference) == -1) ? 360 + difference : difference;
		if ((current < target && target - current <= 180) || (current > target && current - target > 180)) {
			rotation = Math.min(((difference >= 180) ? 360 - difference : difference) / temp, .5);
		} else if ((current < target && target - current > 180) || (current > target && current - target <= 180)) {
			rotation = -Math.min(((difference >= 180) ? 360 - difference : difference) / temp, .5);
		}
		return rotation;
	}
}
