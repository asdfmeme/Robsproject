
package org.usfirst.frc.team4576.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4576.robot.Robot;

/**
 *
 */
public class DriveWithJoysticks extends Command {

    public DriveWithJoysticks() {
        // Use requires()here to declare subsystem dependencies
        requires(Robot.chassis);
        requires(Robot.accel);
        requires(Robot.pneumatics);
        Robot.chassis.initTeleop();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.normalDrive();
    	Robot.accel.refresh();

    	SmartDashboard.putNumber("accelX: ",Robot.accel.getX());
    	SmartDashboard.putNumber("accelY: ",Robot.accel.getY());
    	SmartDashboard.putNumber("accelZ: ",Robot.accel.getZ());
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
   
}