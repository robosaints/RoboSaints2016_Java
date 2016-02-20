

/*
   __    ____________________________________
    /   /                                   /
   /   /  RRRRRRRRRR   SSSSSSSSSS          /
  /   /   RR      RR   SS                 /
 /   /    RR    RRR    SS                /
    /     RRRRRR       SSSSSSSSSS       /
   /      RR    RR             SS      /  /
  /       RR     RR            SS     /  /_______
 /        RR      RR   SSSSSSSSSS    /  /       /
/___________________________________/  /_______/


RoboSaints Source Code - 2016

*/


package org.usfirst.frc.team4762.robosaints16;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team4762.robosaints16.commands.*;
import org.usfirst.frc.team4762.robosaints16.subsystems.*;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static DriveSystem driveSystem;
	public static Loader loader;
	public static Firing firing;
	
	public static AutonomousCommands autoCmds;
	public static TeleoperatedCommands teleopCmds;
	//public static XboxEasterEgg xboxEasterEgg;


    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	System.out.println("Robot init");
    	   	
    	// This line MUST be here, otherwise you will get
    	// various NullPointerExceptions. DO NOT MOVE THIS!
    	RobotMap.init();
    	
	    // instantiate the command used for the autonomous period
		driveSystem = new DriveSystem();
		loader = new Loader();
		firing = new Firing();
        //autonomousCommand = new ExampleCommand();
        
        // This was documented by RobotBuilder last year, stating to
        // NOT MOVE THIS, or else there WILL be null pointers. Make
        // sure that this is always the LAST class that is initialized.
		oi = new OI();
		
		// Sidenote: The RobotState class can be used to check for certain
		//  states of the Robot (ex. RobotState.isAutonomous() can be used
		//  to determine if the Robot is running in autonomous mode). If
		//  you are using it, make sure to import it in the Java file you
		//  are using.
		
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        
        autoCmds = new AutonomousCommands();
        autoCmds.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.

        teleopCmds = new TeleoperatedCommands();
        teleopCmds.start();
        
//        if (oi.getDriveJoy().getIsXbox()) {
//        	xboxEasterEgg = new XboxEasterEgg();
//        	xboxEasterEgg.start();
//        }
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	// This is not needed. JoyDrive is already started from teleopInit().
    	//RobotMap.drive.arcadeDrive(Robot.oi.driveJoystick, true);
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
