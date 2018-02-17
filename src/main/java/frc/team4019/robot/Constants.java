package frc.team4019.robot;

public class Constants {
	// IDs of the Joysticks on the Driver station
	static abstract class sticks {
		static final int leftStick = 0;
		static final int rightStick = 0;
	}

	// Drive configuration
	static abstract class drive {
		static abstract class left {
			static final int[] driveID = {0, 1};
			static final boolean invert = false;
			static final double throttle = 1;
		}
		static abstract class right {
			static final int[] driveID = {2, 3};
			static final boolean invert = true;
			static final double throttle = 1;
		}
		static final double throttle = 1;
		static final String dashboard = "DB/String 0";
	}

	// Climber configuration
	static abstract class climber {
		static abstract class left {
			static final int[] talonID = {5};
			static final boolean invert = false;
			static final double throttle = 1;
		}
		static abstract class right {
			static final int[] talonID = {7};
			static final boolean invert = false;
			static final double throttle = 1;
		}
		static final double throttle = 1;
		static final String dashboard = "DB/String 1";
	}
}
