package org.usfirst.frc.team4762.robosaints16.commands;

import org.usfirst.frc.team4762.robosaints16.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class XboxEasterEgg extends Command {
	
	// BRINGING BACK THE EASTER EGG

    public XboxEasterEgg() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.driveSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// WARNING: this is more than likely going to be the source of problems
    	Joystick joy = Robot.oi.getDriveJoy();
    	
    	SpeedController left = Robot.driveSystem.getLeft();
    	SpeedController right = Robot.driveSystem.getRight();
    	
    	if (joy.getIsXbox()) { // Xbox only.
    		joy.setRumble(Joystick.RumbleType.kLeftRumble, (float) Math.abs(left.get()));
    		joy.setRumble(Joystick.RumbleType.kRightRumble, (float) Math.abs(right.get()));
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	// this should never run
    	Joystick joy = Robot.oi.getDriveJoy();
    	
    	joy.setRumble(Joystick.RumbleType.kLeftRumble, 0f);
    	joy.setRumble(Joystick.RumbleType.kRightRumble, 0f);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	// this also should never run
    	Joystick joy = Robot.oi.getDriveJoy();
    	
    	joy.setRumble(Joystick.RumbleType.kLeftRumble, 0f);
    	joy.setRumble(Joystick.RumbleType.kRightRumble, 0f);
    }
}
