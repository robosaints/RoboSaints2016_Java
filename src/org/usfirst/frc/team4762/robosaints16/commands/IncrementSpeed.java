package org.usfirst.frc.team4762.robosaints16.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IncrementSpeed extends Command {
	
	protected String speedName = "asdasd"; // TODO: move to debug Subsystem
	protected double speedValue = 0.5d;
	
    public IncrementSpeed() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    // right now this is sort of a debug tool

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
