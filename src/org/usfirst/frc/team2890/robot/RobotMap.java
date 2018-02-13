/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot;

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
	public static final int FRONT_RIGHT_TALON_ID = 1;
	public static final int REAR_RIGHT_TALON_ID = 2;
	public static final int FRONT_LEFT_TALON_ID = 3;
	public static final int REAR_LEFT_TALON_ID = 4;
	public static final int DRIVER_CONTROLLER_PORT = 0;

	public static final int X_INVERTED = -1;
	public static final int RAMP_TIMEOUT = 1;
	public static final double RAMP_TIME = 0.5;
	public static final double X_AXIS_LOWER_DEADBAND = -0.01;
	public static final double X_AXIS_UPPER_DEADBAND = 0.01;
	public static final double ROTATION_SENSITIVTY = 0.65;
	public static final double FORWARDS_BACKWARDS_SENSITIVITY = 0.8;
	public static final double AUTONOMOUS_FORWARD_SPEED = 1.0;
	public static final double AUTONOMOUS_BACKWARD_SPEED = -1.0;
	public static final double AUTONOMOUS_KILL_SWITCH = 0;
	
	public static Thread m_visionThread;
	public static GripPipeline gripPipeline;
	public static HambyRoomGripPipelineLongRange hambyRoomGripPipelineLongRange;
	public static HambyRoomGripPipelineShortRange hambyRoomGripPipelineShortRange;	
	public static XboxController driverController;
	public static WPI_TalonSRX frontRightTalon;
	public static WPI_TalonSRX rearRightTalon;
	public static WPI_TalonSRX frontLeftTalon;
	public static WPI_TalonSRX rearLeftTalon;
	public static SpeedControllerGroup rightTalonGroup;
	public static SpeedControllerGroup leftTalonGroup;
	public static DifferentialDrive tankDrive;
	public static DriveTrainSubsystem driveTrainSubsystem;
	public static ExampleSubsystem kExampleSubsystem;
	public static OI m_oi;
	public static Command m_autonomousCommand;
	public static Command exampleCommand;
	public static Command xboxDriveCommand;
	public static Command talonRampOnCommand;
	public static Command talonRampOffCommand;

	public static double centerX;
	public static double distanceFromTargetUsingTargeting;
	public static double angleFromTarget;
	
	public static void init()
	{
		m_oi = new OI();
		
		driverController = new XboxController(DRIVER_CONTROLLER_PORT);
		
		frontRightTalon = new WPI_TalonSRX(FRONT_RIGHT_TALON_ID);
		rearRightTalon = new WPI_TalonSRX(REAR_RIGHT_TALON_ID);
		frontLeftTalon = new WPI_TalonSRX(FRONT_LEFT_TALON_ID);
		rearLeftTalon = new WPI_TalonSRX(REAR_LEFT_TALON_ID);
		
		rightTalonGroup = new SpeedControllerGroup(frontRightTalon, rearRightTalon);
		leftTalonGroup = new SpeedControllerGroup(frontLeftTalon, rearLeftTalon);
		
		//DriveTrainSubsystem.talonRampOn(); // This is for testing, a command should be called instead
		
		rightTalonGroup.setInverted(true);
		leftTalonGroup.setInverted(true);
		
		tankDrive = new DifferentialDrive(leftTalonGroup, rightTalonGroup);
		
		kExampleSubsystem = new ExampleSubsystem();
		driveTrainSubsystem = new DriveTrainSubsystem();
		
		exampleCommand = new ExampleCommand();
		xboxDriveCommand = new XboxDriveCommand();
		talonRampOnCommand = new TalonRampOnCommand();
		talonRampOffCommand = new TalonRampOffCommand();
	}

	public static void startThread()
	{
		gripPipeline = new GripPipeline();
		hambyRoomGripPipelineLongRange = new HambyRoomGripPipelineLongRange();
		hambyRoomGripPipelineShortRange = new HambyRoomGripPipelineShortRange();
		
		centerX = -1;
		distanceFromTargetUsingTargeting = -1;
		angleFromTarget = -1;
		
		m_visionThread = new Thread(() -> 
		{
			System.out.println("In vision thread");
			// Get the UsbCamera from CameraServer
			UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
			// Set the resolution
			camera.setResolution(640, 480);

			// Get a CvSink. This will capture Mats from the camera
			CvSink cvSink = CameraServer.getInstance().getVideo();
			// Setup a CvSource. This will send images back to the Dashboard
			CvSource outputStream
					= CameraServer.getInstance().putVideo("Rectangle", 640, 480);

			// Mats are very memory expensive. Lets reuse this Mat.
			Mat mat = new Mat();
			System.out.println(Thread.interrupted());

			// This cannot be 'true'. The program will never exit if it is. This
			// lets the robot stop this thread when restarting robot code or
			// deploying.
			
			while (!Thread.interrupted()) {
				System.out.println("In infinite thread loop.");
				// Tell the CvSink to grab a frame from the camera and put it
				// in the source mat.  If there is an error notify the output.
				if (cvSink.grabFrame(mat) == 0) {
					// Send the output the error.
					outputStream.notifyError(cvSink.getError());
					// skip the rest of the current iteration
					continue;
				}
				// Put a rectangle on the image
				Imgproc.rectangle(mat, new Point(100, 100), new Point(400, 400),
						new Scalar(255, 255, 255), 5);
				// Give the output stream a new image to display
				outputStream.putFrame(mat);
				hambyRoomGripPipelineShortRange.process(mat);
				
				centerX = Processing.returnCenterX(hambyRoomGripPipelineShortRange.filterContoursOutput);
				distanceFromTargetUsingTargeting = Processing.distanceFromTarget(hambyRoomGripPipelineShortRange.filterContoursOutput);
				angleFromTarget = Processing.getAngle(hambyRoomGripPipelineShortRange.filterContoursOutput);
			}
		});
		m_visionThread.setDaemon(true);
		m_visionThread.start();
	}

}
