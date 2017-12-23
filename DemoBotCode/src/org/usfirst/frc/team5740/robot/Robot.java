
package org.usfirst.frc.team5740.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.XboxController;
public class Robot extends IterativeRobot {
	TalonSRX right = new TalonSRX(0); //right side motors
	TalonSRX left = new TalonSRX(1); //left side motors

	//Joystick jsL = new Joystick(0); //left joystick
	//Joystick jsR = new Joystick(1); //right joystick
	RobotDrive drive = new RobotDrive(right, left); //define robot drive
	Joystick controller = new Joystick(1);
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
		drive.tankDrive(-controller.getY(), -controller.getX()); //drive
		double LeftX = controller.getRawAxis(1);
		double LeftY = controller.getRawAxis(2);
		double RightX = controller.getRawAxis(4);
		double RightY = controller.getRawAxis(1);
		if(LeftY != 0) {
			drive.drive(LeftX, 0);
		}
		if(RightX != 0) {
			if(RightX < 0) {
				drive.drive(RightX, RightX);
			} else {
				drive.drive(RightX, -RightX);
			}
		}
	}


	@Override
	public void testPeriodic() {

	}
}
