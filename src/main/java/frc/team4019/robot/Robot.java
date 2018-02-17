package frc.team4019.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {

	Joystick stickDrive = new Joystick(Constants.sticks.leftStick);
	Drive drive = new Drive();

    @Override
    public void robotInit() { }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }

    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
    	this.drive.arcadeDrive(-stickDrive.getY(), stickDrive.getX(), stickDrive.getThrottle() / -2 + 1);
    }

    @Override
    public void testPeriodic() { }
}
