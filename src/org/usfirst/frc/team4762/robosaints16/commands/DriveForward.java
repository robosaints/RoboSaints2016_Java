package org.usfirst.frc.team4762.robosaints16.commands;

import org.usfirst.frc.team4762.robosaints16.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForward extends Command {
	
	protected int driveTime;
	protected double drivePower;

    public DriveForward(int time, double power) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	driveTime = time;
    	drivePower = power;
    	
    	requires(Robot.driveSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveSystem.robotDrive.setMaxOutput(drivePower);
    	Robot.driveSystem.robotDrive.drive(1, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	try {
			this.wait(driveTime);
		} catch (InterruptedException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveSystem.robotDrive.drive(0, 0);
    	
    	// return power back to default
    	Robot.driveSystem.robotDrive.setMaxOutput(1);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveSystem.robotDrive.drive(0, 0);
    	
    	// return power back to default
    	Robot.driveSystem.robotDrive.setMaxOutput(1);
    }
}
