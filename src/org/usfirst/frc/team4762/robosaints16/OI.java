package org.usfirst.frc.team4762.robosaints16;
import org.usfirst.frc.team4762.robosaints16.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	public Joystick driveJoystick;
	
	public JoystickButton fireBtn;
	public JoystickButton fireRevBtn;
	public JoystickButton loadBtn;
	public JoystickButton loadExitBtn;
	public JoystickButton incSpeedBtn;
	public JoystickButton decSpeedBtn;
	public JoystickButton unloadBtn;
	public JoystickButton loadReturnBtn;
	public JoystickButton DriveInvBtn;
	
	public OI() {
		// Hoping this is literally all I have to do (last year there was a
		// seemingly pointless method that returned the Joystick)...
		driveJoystick = new Joystick(0);
		
		fireBtn = new JoystickButton(driveJoystick, 6); // 6 = right button
		fireBtn.whileHeld(new Fire());

		fireRevBtn = new JoystickButton(driveJoystick, 5); // 5 = left button
		fireRevBtn.whileHeld(new FireRev());
		
		DriveInvBtn = new JoystickButton(driveJoystick, 9); // 5 = left button
		DriveInvBtn.whenPressed(new DriveRev());
		
		loadBtn = new JoystickButton(driveJoystick, 1); // 1=A
		loadBtn.whileHeld(new Load());
		
		loadExitBtn = new JoystickButton(driveJoystick, 2); // 2=B
		loadExitBtn.whileHeld(new LoadExit());
		
		unloadBtn = new JoystickButton(driveJoystick, 3); // 3=X
		unloadBtn.whileHeld(new Unload());
		
		loadReturnBtn = new JoystickButton(driveJoystick, 4); // 4=Y
		loadReturnBtn.whileHeld(new LoadReturn());
		
		
		
		/*
		try {
			// I don't trust this...
			incSpeedBtn = new JoystickButton(driveJoystick, 5); // 5=LB
			incSpeedBtn.whenPressed(new IncrementSpeed());
	
			decSpeedBtn = new JoystickButton(driveJoystick, 6); // 6=RB
			decSpeedBtn.whenPressed(new DecrementSpeed());
		}
		catch (Exception ex) {
			System.out.println("Why don't you actually code something right, Levi?");
		}
		*/
	}
	
	public Joystick getDriveJoy() {
		return driveJoystick;
	}
}

