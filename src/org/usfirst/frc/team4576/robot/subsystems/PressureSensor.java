package org.usfirst.frc.team4576.robot.subsystems;

import org.usfirst.frc.team4576.robot.Robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;




public class PressureSensor extends Pneumatics {

	AnalogInput channel;

	private final double inputVoltage;
    private final int c;
   
    public PressureSensor(int c, double inputVoltage){
    	
            this.inputVoltage = inputVoltage;
           this.c = c;
           channel = new AnalogInput(0);
    }
    
    double GetVoltage() {
        return channel.getVoltage();
    }
    public double getPsi()
    {
    	return (250 * (channel.getVoltage()/inputVoltage));
    }
    public AnalogInput getInputChannel()
    {
    	return channel;
    }
    public int getChannelNumber()
    {
    	return c;
    }
    public void refresh()	{
    Robot.sensor0.getPsi();
	SmartDashboard.putNumber("psi: ", Robot.sensor0.getPsi());
	SmartDashboard.putNumber("voltage: ", Robot.sensor0.GetVoltage());
    
    }
}