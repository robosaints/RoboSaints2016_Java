package org.usfirst.frc.team4762.robosaints16.commands;

import org.usfirst.frc.team4762.robosaints16.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDrive extends Command {
	
	protected double driveX;
	protected double driveY;
	protected int driveTime;
	protected double drivePower;

    public AutoDrive(double x, double y, int time, double power) {
    	// x moves the vehicle forward or backwards, from a range of -1.0 to 1.0.
    	// y moves the vehicle left or right, from a range of -1.0 to 1.0.
    	// time is how long the vehicle should drive for, in milliseconds.
    	// power is how much power the robot should use, spanning from 0 to 1.
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	driveX = x;
    	driveY = y;
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
