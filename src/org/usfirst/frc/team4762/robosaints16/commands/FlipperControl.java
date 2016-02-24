package org.usfirst.frc.team4762.robosaints16.commands;

import org.usfirst.frc.team4762.robosaints16.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FlipperControl extends Command {
	
	private double axis;

    public FlipperControl() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.flipper);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		axis = Robot.oi.driveJoystick.getRawAxis(5);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.flipper.flipper.set(axis);
    //	Robot.flipper.flipper().set(axis);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.flipper.flipper().set(0d);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.flipper.flipper().set(0d);
    }
}
