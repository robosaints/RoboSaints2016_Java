package org.usfirst.frc.team4762.robosaints16.commands;

import org.usfirst.frc.team4762.robosaints16.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Fire extends Command {
	
	protected void setMotors(double r, double l) {
		Robot.firing.getRight().set(r);
		Robot.firing.getLeft().set(l);
	}

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
    	this.setMotors(-.85d, .85d);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	this.setMotors(0d, 0d);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
//    	Robot.firing.getRight().set(1);
//    	Robot.firing.getLeft().set(1);
    	this.setMotors(0d, 0d);
    }
}
