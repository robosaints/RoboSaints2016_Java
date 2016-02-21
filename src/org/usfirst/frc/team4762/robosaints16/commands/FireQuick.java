package org.usfirst.frc.team4762.robosaints16.commands;

import org.usfirst.frc.team4762.robosaints16.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class FireQuick extends CommandGroup {
    
    public  FireQuick() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	requires(Robot.loader);
    	requires(Robot.firing);
    	
    	// spin up the motors...
    	addSequential(new PrepareFire());
    	// ... and fire!
    	addSequential(new AutoLoadExit());
    	// stop motors
    	addSequential(new StopFire());
    }
}
