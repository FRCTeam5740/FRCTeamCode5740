package org.usfirst.frc.team5740.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;

public class EnableSolenoid extends Command {
	Solenoid solenoid;
	public EnableSolenoid(Integer port) {
		solenoid = new Solenoid(port);
	}
	protected void initialize() {
		solenoid.set(true);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		solenoid.set(false);
		return false;
	}
}
