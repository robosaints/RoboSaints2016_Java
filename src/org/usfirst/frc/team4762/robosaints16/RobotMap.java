package org.usfirst.frc.team4762.robosaints16;

// import com.subclasses.many.so.be.to.have.there.does.why
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
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
	
	
	// DriveSystem
	public static RobotDrive drive;
	public static SpeedController driveLeft;
	public static SpeedController driveRight;
	
	public static Encoder driveLeftEncoder;
	public static Encoder driveRightEncoder;
	
	// TODO: add sensor to detect ball
	
	// Firing
	public static SpeedController firingAdvance;
	public static SpeedController firingThrowBottom;
	public static SpeedController firingThrowTop;
	public static Encoder firingAdvanceEncoder;
	public static Encoder firingThrowBottomEncoder;
	public static Encoder firingThrowTopEncoder;
	
	public static Ultrasonic firingUltrasonic;
	public static CameraServer firingCamera;
	
	// Flipper
	public static SpeedController flipper;
	public static Encoder flipperEncoder;
	public static DigitalInput fliperLimitLeft;
	public static DigitalInput fliperLimitRight;
	
	
	
	public static void init() {
		
		
		
		// SYSTEM 1
		// DriveSystem
		
		driveLeft = new Talon(1);
		driveRight = new Talon(2);
		
		drive = new RobotDrive(driveLeft, driveRight);
		drive.setSensitivity(1);
		
		LiveWindow.addActuator("Drive System", "Left Motor", (Talon) driveLeft);
		LiveWindow.addActuator("Drive System", "Right Motor", (Talon) driveRight);
		
		LiveWindow.setEnabled(true);
		
		// TODO: setInvertedMotor if necessary / possible
		
			System.err.println("attempting motor setup");
			//drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
			//drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
			//.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
			//drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
			System.err.println("IT WORKS\n");
			//System.err.println("Failed to invert motors. Motors will not be inverted.");
		
		drive.setSafetyEnabled(true);
		drive.setSensitivity(1);
		drive.setExpiration(0.1);
		drive.setMaxOutput(-0.5); // half power
		
		
		
		// SYSTEM 2
		// Firing
		
		// (presumably Talon motors)
		
		System.out.println("TESTING OUTPUT");
		System.out.println("TESTING TESTING 1...2...3...");
		
		try {
			//firingAdvance = new Talon(3); // pin-out 3 for now

		
		}
		catch (Exception ex) {
			
		}
		
		// SYSTEM 3
		// Flipper
	}
}
