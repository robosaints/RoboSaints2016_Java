package org.usfirst.frc.team4762.robosaints16.subsystems;

import org.usfirst.frc.team4762.robosaints16.RobotMap;
import org.usfirst.frc.team4762.robosaints16.commands.*;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Flipper extends Subsystem {
	
	public SpeedController flipper = RobotMap.flipper;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new FlipperControl());
    }
    
    public SpeedController flipper() {
    	
    	return flipper;
    }
}

