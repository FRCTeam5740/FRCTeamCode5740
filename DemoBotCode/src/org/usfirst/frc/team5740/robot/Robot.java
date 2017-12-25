
package org.usfirst.frc.team5740.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team5740.robot.XBDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
public class Robot extends IterativeRobot {
	//TalonSRX right = new TalonSRX(0); //right side motors
	//TalonSRX left = new TalonSRX(1); //left side motors
	//RobotDrive drive = new RobotDrive(right, left); //define robot drive
	Joystick controller = new Joystick(1); //controller on port 1
	Button trigger = new JoystickButton(controller, 1);
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
		trigger.whenPressed(new EnableSolenoid(1)); //<---------FIND VALUE FOR THIS
	}


	@Override
	public void teleopPeriodic() {
		//double LeftX = controller.getRawAxis(1); //x-axis on left stick
		//double LeftY = controller.getRawAxis(2); //y-axis on left stick
		//double RightX = controller.getRawAxis(4); //x-axis on right stick
		//double RightY = controller.getRawAxis(1); //y-axis on right stick
		//if(LeftY != 0) {
		//	drive.drive(LeftY, 0);
		//} else {
		//	drive.drive(0, 0);
		//}
		//if(RightX != 0) {
		//	if(RightX < 0) {
		//		drive.drive(RightX, RightX);
		//	} else if(RightX > 0) {
		//		drive.drive(RightX, -RightX);
		//	} else {
		//		drive.drive(0, 0);
		//	}
		//}
		XBDrive xbdrive = new XBDrive(0, 1, 1); //declares new XBDrive [0: 1st talon port, 1: 2nd talon port, 1: Joystick port]
		xbdrive.Drive(); //makes it drive (see drive() in XBDrive.java)
	}


	@Override
	public void testPeriodic() {

	}
}
