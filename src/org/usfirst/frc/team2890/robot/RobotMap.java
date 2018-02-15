/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot;

import org.usfirst.frc.team2890.robot.commands.*;
import org.usfirst.frc.team2890.robot.subsystems.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//===============================================
	//PORT IDS
	//===============================================
	public static final int FRONT_RIGHT_TALON_ID = 1;
	public static final int REAR_RIGHT_TALON_ID = 4;
	public static final int FRONT_LEFT_TALON_ID = 3;
	public static final int REAR_LEFT_TALON_ID = 2;
	public static final int DRIVER_CONTROLLER_PORT = 0;
	
	//===============================================
	//VARIABLES
	//===============================================
	public static final int X_INVERTED = -1;
	public static final int RAMP_TIMEOUT = 1;
	public static final double RAMP_TIME = 0.25;
	public static final double X_AXIS_LOWER_DEADBAND = -0.01;
	public static final double X_AXIS_UPPER_DEADBAND = 0.01;
	public static final double ROTATION_SENSITIVTY = 0.7; //from 0.65
	public static final double FORWARDS_BACKWARDS_SENSITIVITY = 1.0; //from 0.8
	public static final double AUTONOMOUS_FORWARD_SPEED = -0.65;
	public static final double AUTONOMOUS_BACKWARD_SPEED = 0.65;
	public static final double AUTONOMOUS_ROTATE_LEFT_SPEED = 0.60; // from 0.65
	public static final double AUTONOMOUS_ROTATE_RIGHT_SPEED = -0.60; // from -0.65
	public static final double AUTONOMOUS_KILL_SWITCH = 0;
	
	public static final double AUTONOMOUS_DRIVE_FORWARD_TIME = 4; //time in seconds 
																  //use Driver Station Timer!
	public static final double AUTONOMOUS_CONSTANT_ANGLE = 15;
	public static double autonomousAngle = 15;
	public static double initialGyro;
	/* TESTING VARIABLES
	 * public static boolean flag = true;
	*/
	
	//===============================================
	//TALONS, CONTROLLERS & OTHER OBJECTS
	//===============================================
	public static XboxController driverController;
	public static WPI_TalonSRX frontRightTalon;
	public static WPI_TalonSRX rearRightTalon;
	public static WPI_TalonSRX frontLeftTalon;
	public static WPI_TalonSRX rearLeftTalon;
	public static SpeedControllerGroup rightTalonGroup;
	public static SpeedControllerGroup leftTalonGroup;
	public static DifferentialDrive driveTrain;
	public static DriveTrainSubsystem driveTrainSubsystem;
	public static SensorSubsystem sensorSubsystem;
	public static ExampleSubsystem kExampleSubsystem;
	public static OI m_oi;
	public static ADXRS450_Gyro gyro;

	//===============================================
	//COMMANDS
	//===============================================
	public static Command exampleCommand;
	public static Command xboxDriveCommand;
	public static Command talonRampOnCommand;
	public static Command talonRampOffCommand;
	public static Command stopMovingCommand;
	
	//===============================================
	//AUTONOMOUS COMMANDS
	//===============================================
	public static Command m_autonomousCommand;
	public static Command driveForwardAutonomousCommand;
	public static Command driveBackwardAutonomousCommand;
	public static Command turnLeftAutonomousCommand;
	public static Command turnRightAutonomousCommand;
	public static Command timedDriveForwardAutonomousCommand;
	public static Command rotationAutonomous; 
	
	
	
	public static void init()
	{
		m_oi = new OI();
		
		driverController = new XboxController(DRIVER_CONTROLLER_PORT);
		
		gyro = new ADXRS450_Gyro();
		
		frontRightTalon = new WPI_TalonSRX(FRONT_RIGHT_TALON_ID);
		rearRightTalon = new WPI_TalonSRX(REAR_RIGHT_TALON_ID);
		frontLeftTalon = new WPI_TalonSRX(FRONT_LEFT_TALON_ID);
		rearLeftTalon = new WPI_TalonSRX(REAR_LEFT_TALON_ID);
		
		rightTalonGroup = new SpeedControllerGroup(frontRightTalon, rearRightTalon);
		leftTalonGroup = new SpeedControllerGroup(frontLeftTalon, rearLeftTalon);
		
		rightTalonGroup.setInverted(true);
		leftTalonGroup.setInverted(true);
		
		driveTrain = new DifferentialDrive(leftTalonGroup, rightTalonGroup);
		
		kExampleSubsystem = new ExampleSubsystem();
		driveTrainSubsystem = new DriveTrainSubsystem();
		sensorSubsystem = new SensorSubsystem();
		
		exampleCommand = new ExampleCommand();
		xboxDriveCommand = new XboxDriveCommand();
		talonRampOnCommand = new TalonRampOnCommand();
		talonRampOffCommand = new TalonRampOffCommand();
		driveForwardAutonomousCommand = new AutonomousDriveForwardCommand();
		stopMovingCommand = new StopMovingCommand();
		driveBackwardAutonomousCommand = new AutonomousDriveBackwardCommand();
		turnLeftAutonomousCommand = new AutonomousTurnLeftCommand();
		turnRightAutonomousCommand = new AutonomousTurnRightCommand();
		timedDriveForwardAutonomousCommand = new AutonomousTimedDriveForward(AUTONOMOUS_DRIVE_FORWARD_TIME);
		rotationAutonomous = new AutonomousRotateIntCommand();
		
		initialGyro = RobotMap.gyro.getAngle();
		
	}

}
