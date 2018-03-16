package frc.team4019.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {

	static Joystick stickDrive = new Joystick(Constants.sticks.leftStick);
	static Joystick stickOperate = new Joystick(Constants.sticks.rightStick);
	static Drive drive = new Drive();
	static Climber climber = new Climber();
	static Grabber grabber = new Grabber();
	static Elevator elevator = new Elevator();
	static Gyro gyro = new Gyro();

    @Override
    public void robotInit() { }

    @Override
    public void autonomousInit() {
    	Autonomous.init();
    }

    @Override
    public void teleopInit() {
    	Teleoperated.init();
    }

    @Override
    public void testInit() { }


    @Override
    public void autonomousPeriodic() {
    	Autonomous.periodic();;
    }

    @Override
    public void teleopPeriodic() {
    	Teleoperated.periodic();
    }

    @Override
    public void testPeriodic() { }
}
