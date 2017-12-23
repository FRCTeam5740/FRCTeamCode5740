
package org.usfirst.frc.team5740.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5740.robot.commands.ExampleCommand;
import org.usfirst.frc.team5740.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TalonSRX;
public class Robot extends IterativeRobot {
	TalonSRX t0 = new TalonSRX(0);
	TalonSRX t1 = new TalonSRX(1);
	TalonSRX t2 = new TalonSRX(2);
	TalonSRX t3 = new TalonSRX(3);
	Joystick joystick = new Joystick(0);


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
		this.drive.arcadeDrive(joystick);
	}


	@Override
	public void testPeriodic() {

	}
}
