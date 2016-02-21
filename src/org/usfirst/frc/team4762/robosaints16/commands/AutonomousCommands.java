package org.usfirst.frc.team4762.robosaints16.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousCommands extends CommandGroup {
    
    public  AutonomousCommands() {
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
    	
    	
    	// ball can now be fed into the loader
    	Command load = new Load();
    	addParallel(load);
    	
    	// drives forward for 5000 milliseconds at 20% power
    	addSequential(new DriveForward(5000, 0.2));
    	
    	// does the exact same thing as DriveForward
    	//addParallel(new AutoDrive(1, 0, 5000, 0.2));
    	
    	// stops the load command from running
    	// not load.cancel() because then it may not run after the addSequential
    	addParallel(new StopCommand(load));
    	
    	// TODO: FireQuick
    	// addSequential(new FireQuick());
    	
    	
    }
}
