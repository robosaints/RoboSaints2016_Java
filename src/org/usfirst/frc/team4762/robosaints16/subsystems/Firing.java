package org.usfirst.frc.team4762.robosaints16.subsystems;

import org.usfirst.frc.team4762.robosaints16.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Firing extends Subsystem {
	
	public SpeedController fireLeft = RobotMap.firingThrowLeft;
	public SpeedController fireRight = RobotMap.firingThrowRight;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public SpeedController getLeft() {
    	return fireLeft;
    }
    
    public SpeedController getRight() {
    	return fireRight;
    }
    
}

