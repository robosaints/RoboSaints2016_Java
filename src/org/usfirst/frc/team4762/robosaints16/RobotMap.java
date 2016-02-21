package org.usfirst.frc.team4762.robosaints16;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
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
	
	
	
	
	// SETTINGS
	
	
	
	
	// Speeds
	
	// The speeds are used for certain commands at how fast to move the motor.
	public static double driveSpeed = 1;
	public static double feedSpeed = 0.25; // might consider renaming this
	public static double spitSpeed = 0.5;
	public static double loaderAdvanceSpeed = 0.7;
	public static double loaderReturnSpeed = 0.2;
	public static double fireSpeed = 0.55;
	
	
	
	
	// COMPONENTS
	
	
	
	
	// DriveSystem
	public static RobotDrive drive;
	public static SpeedController driveLeft;
	public static SpeedController driveRight;
	
	public static Encoder driveLeftEncoder;
	public static Encoder driveRightEncoder;
	
	
	// TODO: Add a sensor to detect the ball. (With a camera?)
	
	// Loader
	public static SpeedController loaderFront;
	public static SpeedController loaderBack;
	
	
	// TODO: Add encoders?
	
	// Firing
	public static RobotDrive fire;
	public static SpeedController firingAdvance; // TODO: Not sure if firingAdvance is actually used.
	public static SpeedController firingThrowLeft;
	public static SpeedController firingThrowRight;
	public static Encoder firingAdvanceEncoder;
	public static Encoder firingThrowLeftEncoder;
	public static Encoder firingThrowRightEncoder;
	
	public static Ultrasonic firingUltrasonic;
	public static CameraServer firingCamera;
	
	// Flipper
	public static SpeedController flipper;
	public static Encoder flipperEncoder;
	public static DigitalInput fliperLimitLeft;
	public static DigitalInput fliperLimitRight;
	
	// Miscellaneous
	public static NetworkTable table;
	
	
	
	public static void init() {
		
		//table = new NetworkTable();
		
		
		// SYSTEM 1
		// DriveSystem
		
		driveLeft = new Talon(2);
		driveRight = new Talon(1);
		
		loaderFront = new Talon(6);
		loaderBack = new Talon(7);

		firingThrowLeft = new Jaguar(8);
		firingThrowRight = new Jaguar(9);
		
		flipper = new Talon(5);
		
		drive = new RobotDrive(driveLeft, driveRight);
		drive.setSensitivity(1);
		
		// TODO: Is type casting ACTUALLY necessary?
		
		// Trying negative setMaxOutput.
		
		// NOTE: SpeedController.setInverted(boolean inverted) is NEW this year, so
		//       setInvertedMotor may no longer exist.
		
			// had a try-catch statement here
			//System.err.println("attempting motor setup");
			//drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
			//drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
			//drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
			//drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
			//System.err.println("IT WORKS");
			//System.err.println("Failed to invert motors. Motors will not be inverted.");
		
		drive.setSafetyEnabled(true);
		drive.setSensitivity(1);
		drive.setExpiration(0.1);
		drive.setMaxOutput(driveSpeed); // full power
		
		
		
		// SYSTEM 2
		// Loader
		
		//try {
			 //may have to switch pinouts
//			
//		}
//		catch (Exception ex) {
//			System.out.println("The loader talon motors were not found, so they will be ignored.");
//		}
		
		
		
		// SYSTEM 3
		// Firing
		
//		fire = new RobotDrive(firingThrowLeft, firingThrowRight);
//		fire.setSensitivity(1);
//		fire.setSafetyEnabled(true);
//		fire.setSensitivity(1);
//		fire.setExpiration(0.1);
//		fire.setMaxOutput(1); // full power
//		try {
//			// Adding talon motors
//			// (assuming 8 and 9 for now)
//			firingThrowLeft = new Talon(8);
//			firingThrowRight = new Talon(9);
//			
//			LiveWindow.addActuator("Firing", "Left Motor", (Talon) firingThrowLeft);
//			LiveWindow.addActuator("Firing", "Right Motor", (Talon) firingThrowRight);
//		}
//		catch (Exception ex) {
//			System.out.println("The firing talon motors were not found, so they will be ignored.");
//		}
		
		// SYSTEM 4
		// Flipper
		
		// LiveWindow items MUST BE done LAST, or else there will be nullpointerexceptions regarding
		// the PWM!!
		LiveWindow.addActuator("Driving", "Left Motor", (Talon) driveLeft);
		LiveWindow.addActuator("Driving", "Right Motor", (Talon) driveRight);
		
		LiveWindow.addActuator("Loading", "Front Motor", (Talon) loaderFront);
		LiveWindow.addActuator("Loading", "Back Motor", (Talon) loaderBack);

		LiveWindow.addActuator("Throwing", "Throw Left", (Jaguar) firingThrowLeft);
		LiveWindow.addActuator("Throwing", "Throw Right", (Jaguar) firingThrowRight);
		
		LiveWindow.addActuator("Flipper", "Flipper", (Talon) flipper);

		
		LiveWindow.setEnabled(true);
	}
}
