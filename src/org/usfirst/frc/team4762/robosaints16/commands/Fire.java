package org.usfirst.frc.team4762.robosaints16.commands;

import org.usfirst.frc.team4762.robosaints16.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Fire extends Command {

    public Fire() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.firing);
//    	Robot.firing.getRight().set(1);
//    	Robot.firing.getLeft().set(1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	// Start the motors!
//    	Robot.firing.getRight().set(-1);
//    	Robot.firing.getLeft().set(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.firing.getRight().set(-1);
//    	Robot.firing.getLeft().set(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.firing.getRight().set(0);
//    	Robot.firing.getLeft().set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
//    	Robot.firing.getRight().set(1);
//    	Robot.firing.getLeft().set(1);
    }
}
