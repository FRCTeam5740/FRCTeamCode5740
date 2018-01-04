
package org.usfirst.frc.team5740.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team5740.robot.XBDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
public class Robot extends IterativeRobot {
	TalonSRX right = new TalonSRX(0); //right side motors
	TalonSRX left = new TalonSRX(1); //left side motors
	RobotDrive drive = new RobotDrive(right, left); //define robot drive
	Joystick controller = new Joystick(1); //controller on port 1
	Button trigger = new JoystickButton(controller, 1);
	Spark s1 = new Spark(2);
	Spark s2 = new Spark(3);
	Spark s3 = new Spark(4);
	Spark s4 = new Spark(5);
	RobotDrive shooterDrive = new RobotDrive(s1, s2, s3, s4);
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
		//trigger.whenPressed(new EnableSolenoid(1)); //<---------FIND VALUE FOR THIS [1: port for the solenoid]
	}


	@Override
	public void teleopPeriodic() {
		//drive.arcadeDrive(controller);
	drive.tankDrive(controller.getRawAxis(2), controller.getRawAxis(4));
	if(controller.getRawAxis(3) != 0) {
		shooterDrive.drive(controller.getRawAxis(3), 0);
	}
	}


	@Override
	public void testPeriodic() {

	}
}
