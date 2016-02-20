package org.usfirst.frc.team4762.robosaints16.subsystems;

import org.usfirst.frc.team4762.robosaints16.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Loader extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public SpeedController back = RobotMap.loaderBack;
	public SpeedController front = RobotMap.loaderFront;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public SpeedController backMotor() {
    	return back;
    }
    
    public SpeedController frontMotor() {
    	return front;
    }
}

