package org.usfirst.frc.team4576.robot.subsystems;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Pneumatics extends Subsystem {
	private Compressor c;
	private Solenoid s0 = new Solenoid(0);
	public static PressureSensor sensor0;
	
	@Override
	protected void initDefaultCommand() {
		c  = new Compressor();
		sensor0  = new PressureSensor(0,5);
	}

	public void setAutoEnabled() {
	
		c.setClosedLoopControl(true);
	}

	public void setShift(boolean closed) {
		s0.set(closed);
	}

	public void shift() {
		s0.set(!s0.get());

	}
	
	public double pressureVoltage() {
		
		return sensor0.GetVoltage();
	}
	public double getPsi()
	{
		return sensor0.getPsi();
	}
	
	
}
	
