package frc.team4019.robot;

import java.util.ArrayList;

public class Autonomous {
	private static Queue queue;

	static class Task {
		static class Wait extends Task {
			double duration;
			Wait(double duration) {
				this.duration = duration;
			}

			@Override
			boolean procedure() {
				return true;
			}
		}

		static class Move extends Task {
			double distance;
			Move(double distance) {
				this.distance = distance;
			}

			@Override
			boolean procedure() {
				return true;
			}
		}

		static class Rotate extends Task {
			double angle;
			Rotate(double angle) {
				this.angle = angle;
			}

			@Override
			boolean procedure() {
				return true;
			}
		}

		boolean update() {
			return this.procedure();
		}

		boolean procedure() {
			return true;
		}
	}

	static class Queue {
		ArrayList<Task> tasks;
		Queue(ArrayList<Task> tasks) {
			this.tasks = tasks;
		}

		boolean update() {
			if (this.tasks.get(0).update()) {
				this.tasks.remove(0);
			}
			return tasks.size() == 0;
		}
	}

	public static void init() {
		ArrayList<Task> tasks = new ArrayList<>();
		queue = new Queue(tasks);
	}

	public static void periodic() {
		Robot.drive.arcadeDrive(0.15, 0);
	}
}
