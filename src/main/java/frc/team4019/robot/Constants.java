package frc.team4019.robot;

public class Constants {
	// IDs of the Joysticks on the Driver station
	static abstract class sticks {
		static final int leftStick = 0;
		static final int rightStick = 1;
	}

	// Drive configuration
	static abstract class drive {
		static abstract class left {
			static final int[] talonID = {0, 1};
			static final boolean invert = false;
			static final double throttle = 1;
		}
		static abstract class right {
			static final int[] talonID = {2, 3};
			static final boolean invert = true;
			static final double throttle = 1;
		}
		static abstract  class control {
			static final int axisForward = 1;
			static final int axisRotation = 0;
			static final int axisThrottle = 3;
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
		static abstract class control {
			static final int buttonUp = 5;
			static final int buttonDown = 3;
			static final int axisThrottle = 3;
		}
		static final double throttle = 1;
		static final String dashboard = "DB/String 1";
	}

	// Climber configuration
	static abstract class grabber {
		static abstract class left {
			static final int[] talonID = {8};
			static final boolean invert = false;
			static final double throttle = 0.5;
		}
		static abstract class right {
			static final int[] talonID = {9};
			static final boolean invert = false;
			static final double throttle = 0.5;
		}
		static abstract class arm {
			static final int[] talonID = {4};
			static final boolean invert = false;
			static final double throttle = 0.375;
		}
		static abstract class control {
			static final int buttonUp = 5;
			static final int buttonDown = 3;
		}
		static final double throttle = 0.5;
		static final String dashboard = "DB/String 2";
	}

	static abstract class elevator {
		static abstract class right {
			static final int[] talonID = {6};
			static final boolean invert = false;
			static final double throttle = 1;
		}
		static abstract  class control {
			static final int axisSpeed = 1;
		}
		static final double throttle = 0.5;
		static final String dashboard = "DB/String 3";
	}

	static abstract class gyro {
		static abstract class control {
			static final int buttonAlign = 1;
			static final int buttonReset = 2;
			static final int axisSin = 1;
			static final int axisCos = 0;
		}
		static final String dashboard = "DB/String 4";
	}
}
