package org.usfirst.frc.team4762.robosaints16.commands;

import org.usfirst.frc.team4762.robosaints16.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Load extends Command {

    public Load() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.loader);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.loader.backMotor().set(-.25d);
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
    	Robot.loader.backMotor().set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.loader.backMotor().set(0);
    }
}
