package org.usfirst.frc.team4762.robosaints16.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4762.robosaints16.Robot;
import org.usfirst.frc.team4762.robosaints16.RobotMap;
import org.usfirst.frc.team4762.robosaints16.subsystems.DriveSystem;

/**
 *
 */
public class JoyDrive extends Command {

    public JoyDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.driveSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveSystem.TakeJoystickInputs(Robot.oi.getDriveJoy());
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
