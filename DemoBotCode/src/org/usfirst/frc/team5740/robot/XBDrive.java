package org.usfirst.frc.team5740.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
public class XBDrive {
	TalonSRX t1, t2;
	RobotDrive drive;
	Joystick joystick;
	double LeftY, RightX;
	public XBDrive(Integer talonPort1, Integer talonPort2, Integer joystickPort) {
		t1 = new TalonSRX(talonPort1);
		t2 = new TalonSRX(talonPort2);
		drive = new RobotDrive(t1, t2);
		joystick = new Joystick(joystickPort);
		LeftY = joystick.getRawAxis(2); //y-axis on left stick
		RightX = joystick.getRawAxis(4); //x-axis on right stick
	}
	public void Drive() {
		if(LeftY != 0) {
			drive.drive(LeftY, 0);
		} else {
			drive.drive(0, 0);
		}
		if(RightX != 0) {
			if(RightX < 0) {
				drive.drive(RightX, RightX);
			} else if(RightX > 0) {
				drive.drive(RightX, -RightX);
			} else {
				drive.drive(0, 0);
			}
		}
	}
}
