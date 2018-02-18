package frc.team4019.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {

	static ADXRS450_Gyro gyro = new ADXRS450_Gyro();

	static Joystick stickDrive = new Joystick(Constants.sticks.leftStick);
	static Joystick stickOperate = new Joystick(Constants.sticks.rightStick);
	static Drive drive = new Drive();
	static Climber climber = new Climber();
	static Grabber grabber = new Grabber();

    @Override
    public void robotInit() {
    	this.gyro.reset();
    }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() {
    	Teleoperated.init();
    }

    @Override
    public void testInit() { }


    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
    	Teleoperated.periodic();
    }

    @Override
    public void testPeriodic() { }
}
