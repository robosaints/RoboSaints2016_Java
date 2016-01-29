package org.usfirst.frc.team4762.robosaints16;

// import com.subclasses.many.so.be.to.have.there.does.why
import edu.wpi.first.wpilibj.*;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static SpeedController driveLeft;
	public static SpeedController driveRight;
	
	public static RobotDrive drive;
	
	public static void init() {
		driveLeft = new Talon(1);
		driveRight = new Talon(2);
		
		drive = new RobotDrive(driveLeft, driveRight);
		
		drive.setSafetyEnabled(true);
		drive.setSensitivity(0.5);
		drive.setExpiration(0.1);
		drive.setMaxOutput(1.0); // .0 to keep type
	}
}
