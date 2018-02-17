package frc.team4019.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {

	Joystick stickDrive = new Joystick(Constants.sticks.leftStick);
	Drive drive = new Drive();
	Climber climber = new Climber();

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
    	if (!stickDrive.getRawButton(1)) {
		    this.drive.arcadeDrive(-stickDrive.getY(), stickDrive.getX(), stickDrive.getThrottle() / -2 + 0.5);
		    this.climber.climb(0);
	    } else {
    		this.drive.arcadeDrive(0, 0, 0);
    		this.climber.climb(-stickDrive.getY());
	    }
    }

    @Override
    public void testPeriodic() { }
}
