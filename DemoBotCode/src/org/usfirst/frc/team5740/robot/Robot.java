
package org.usfirst.frc.team5740.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
public class Robot extends IterativeRobot {
	TalonSRX t0 = new TalonSRX(0);
	TalonSRX t1 = new TalonSRX(1);
	TalonSRX t2 = new TalonSRX(2);
	TalonSRX t3 = new TalonSRX(3);
	Joystick jsL = new Joystick(0);
	Joystick jsR = new Joystick(1);
	RobotDrive drive = new RobotDrive(t0, t1, t2, t3);
	@Override
	public void robotInit() {

	}


	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {

	}

	@Override
	public void autonomousInit() {

	}

	@Override
	public void autonomousPeriodic() {

	}

	@Override
	public void teleopInit() {

	}


	@Override
	public void teleopPeriodic() {
		drive.tankDrive(-jsL.getY(), -jsR.getY());
	}


	@Override
	public void testPeriodic() {

	}
}
