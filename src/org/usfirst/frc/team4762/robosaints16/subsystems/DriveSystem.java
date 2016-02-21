package org.usfirst.frc.team4762.robosaints16.subsystems;

//import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4762.robosaints16.Robot;
import org.usfirst.frc.team4762.robosaints16.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSystem extends Subsystem {
	
	public RobotDrive robotDrive = RobotMap.drive;
	
	double speed = RobotMap.driveSpeed;
	
	SpeedController left = RobotMap.driveLeft;
	SpeedController right = RobotMap.driveRight;
	
	
	public void initDefaultCommand() {
	}

    //public DriveSystem() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    //}
	
	public SpeedController getLeft() {
		return left;
	}
	
	public SpeedController getRight() {
		return right;
	}
    
    public void TakeJoystickInputs(GenericHID joystick) {
    	robotDrive.arcadeDrive(joystick, true);
    }
/*
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
    */
}
