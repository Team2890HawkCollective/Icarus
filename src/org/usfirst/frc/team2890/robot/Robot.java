/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.*;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2890.robot.commands.*;
import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.paths.*;
import org.usfirst.frc.team319.robot.commands.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot 
{
	SendableChooser<Command> m_chooser = new SendableChooser<>();
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() 
	{
		SmartDashboard.putNumber("Time Drive Forward For the Middle (RIGHT SIDE): ", 1.0);
		SmartDashboard.putNumber("Time Drive Forward For the Middle (LEFT SIDE): ", 1.0);
		
		//For when we're on the opposite side of the field that our target is on.
		SmartDashboard.putNumber("Straight Time Drive Forward: ", 5.0);
		SmartDashboard.putNumber("Left OR Right Side Time Drive: ", 3.0);
		
		SmartDashboard.putNumber("Rotate Right Degrees: ", 90);
		SmartDashboard.putNumber("Rotate Left Degrees: ", -90);
		
		RobotMap.init();
		RobotMap.m_oi = new OI();
		
		//Have to have .addDefault() or else will not show up.
		m_chooser.addDefault("Autonomous from the Right: ", new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive));
		
		//This Command is middle
		m_chooser.addObject("Autonomous from the Middle: ", new TestCommandDontHateMeTaylor());
		
		//This Command is Left
		m_chooser.addObject("Autonomous from the Left: ", new LLAutonomousLeftCommandGroup());
		
		//This Command is Right
		m_chooser.addObject("Autonomous from the Right: ", new RRAutonomousRightCommandGroup());
		
		SmartDashboard.putData("Auto mode", m_chooser);

		RobotMap.frontLeftTalon.setSelectedSensorPosition(0, 0, 0);
		RobotMap.frontRightTalon.setSelectedSensorPosition(0, 0, 0);
		
		//RobotMap.frontLeftTalon.setInverted(true);
		//RobotMap.rearLeftTalon.setInverted(true);
	}
	
	/**
	 * This function is run periodically while the robot is on
	 */
	@Override
	public void robotPeriodic()
	{
		//RobotMap.rearLeftTalon.follow(RobotMap.frontLeftTalon);
		//RobotMap.rearRightTalon.follow(RobotMap.frontRightTalon);
		
		SmartDashboard.putData("Gyro", RobotMap.gyro);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() 
	{
		RobotMap.firstTimeThrough = true;
	}
	
	/**
	 * This function is called periodically while the robot is disabled
	 */
	@Override
	public void disabledPeriodic() 
	{
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() 
	{
		RobotMap.m_autonomousCommand = m_chooser.getSelected();
		
		RobotMap.rangeFinderDistanceInches = RobotMap.rangeFinder.getRangeInches();
		
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */
		SmartDashboard.putString("In R If Statement: ", "");
		SmartDashboard.putString("In 1st if: ", "");
		SmartDashboard.putString("In 2nd if: ", "");
		SmartDashboard.putString("In 3rd if: ", "");
		SmartDashboard.putString("In L If Statement: ", "");
		SmartDashboard.putString("In 4th if: ", "");
		SmartDashboard.putString("In 5th if: ", "");
		SmartDashboard.putString("In 6rd if: ", "");
		
		RobotMap.gyro.reset();
		
		RobotMap.autonomousCommandGroupChooser = (CommandGroup) m_chooser.getSelected();
		
		while((DriverStation.getInstance().getGameSpecificMessage()) == null)
		{
			
		}	
		
		RobotMap.gameData = DriverStation.getInstance().getGameSpecificMessage();
		RobotMap.gameDataLetter = RobotMap.gameData.substring(0, 1);
		System.out.println(RobotMap.gameDataLetter);
		
		SmartDashboard.putString("Game Data Letter", RobotMap.gameDataLetter);
		
		if(RobotMap.gameDataLetter.equalsIgnoreCase("R"))
		{
			RobotMap.isRight = true;
		}
		else if(RobotMap.gameDataLetter.equalsIgnoreCase("L"))
		{
			RobotMap.isRight = false;
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() 
	{
		
		RobotMap.rangeFinderDistanceInches = RobotMap.rangeFinder.getRangeInches();
		//System.out.println(RobotMap.rangeFinderDistanceInches);
		//System.out.println(RobotMap.RANGE_TARGET);
		
		RobotMap.rightAutonomousMiddleTimeDrive = SmartDashboard.getNumber("Time Drive Forward For the Middle (RIGHT SIDE): ", -1);
		RobotMap.leftAutonomousMiddleTimeDrive = SmartDashboard.getNumber("Time Drive Forward For the Middle (LEFT SIDE): ", -1);
		RobotMap.autonomousLeftOrRightTimeDrive = SmartDashboard.getNumber("Left OR Right Side Time Drive: ", -19);
		RobotMap.driveStraightTimeDrive = SmartDashboard.getNumber("Straight Time Drive Forward: ", -1);
	
		RobotMap.rightTurnDegrees = SmartDashboard.getNumber("Rotate Right Degrees: ", 360);
		RobotMap.leftTurnDegrees = SmartDashboard.getNumber("Rotate Left Degrees: ", -360);
			
		if(RobotMap.firstTimeThrough)
		{
			RobotMap.rotationAutonomous = new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees);
			RobotMap.autonomousTargetingRightCommandGroup = new AutonomousTargetingRightCommandGroup();
			RobotMap.autonomousTargetingLeftCommandGroup = new AutonomousTargetingLeftCommandGroup();
			RobotMap.autonomousLeftCommandGroup = new LLAutonomousLeftCommandGroup();
			RobotMap.autonomousRightCommandGroup = new RRAutonomousRightCommandGroup();
			RobotMap.autonomousCommandGroupChooser = new CommandGroup();
			RobotMap.timedDriveForwardAutonomousCommand = new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive);
			scheduleCommands();
			RobotMap.firstTimeThrough = false;
		}
		
		Scheduler.getInstance().run();
	}
	
	/**
	 * This function is called once when the robot is enabled in teleop mode.
	 */
	@Override
	public void teleopInit() 
	{
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (RobotMap.m_autonomousCommand != null) 
		{
			RobotMap.m_autonomousCommand.cancel();
		}
		
		RobotMap.startThread();

		RobotMap.frontLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.frontRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);

		Scheduler.getInstance().add(RobotMap.controlManipulatorCommand);
		Scheduler.getInstance().add(RobotMap.xboxDriveCommand);
		//Scheduler.getInstance().add(RobotMap.autoTuneVelocity);
		
		RobotMap.compressor.setClosedLoopControl(true);
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() 
	{
		Scheduler.getInstance().run();

		/*SmartDashboard.putNumber("Rectangle", RobotMap.hambyRoomGripPipelineShortRange.filterContoursOutput.size());
		SmartDashboard.putNumber("Center X: ", RobotMap.centerX);
		SmartDashboard.putNumber("Distance From Target: ", RobotMap.distanceFromTargetUsingTargeting);
		SmartDashboard.putNumber("Angle: ", RobotMap.angleFromTarget);
		
		
		SmartDashboard.putBoolean("Upper Limit Switch (false if pressed): ", RobotMap.sensorSubsystem.isUpperLimitSwitchPressed());
		SmartDashboard.putBoolean("Lower Limit Switch (true if pressed): ", RobotMap.sensorSubsystem.isLowerLimitSwitchPressed());
		
		SmartDashboard.putBoolean("Ratchet Engaged(true) or Disengaged(false): ", RobotMap.ratchetEngaged);
		SmartDashboard.putBoolean("High Gear(true): ", RobotMap.highGear);
		SmartDashboard.putBoolean("Low Gear(true): ", RobotMap.lowGear);
		SmartDashboard.putBoolean("Elbow is down(true): ", RobotMap.elbowIsDown);
		
		//test to tell if we are able to send data using the buttons by displaying it on SmartDashboard
		SmartDashboard.putBoolean("Y",RobotMap.driverController.getYButton());
		SmartDashboard.putBoolean("X",RobotMap.driverController.getXButton());
		SmartDashboard.putBoolean("B",RobotMap.driverController.getBButton());
		SmartDashboard.putBoolean("A",RobotMap.driverController.getAButton());
		
		SmartDashboard.putNumber("Gyro:", RobotMap.gyro.getAngle());
		SmartDashboard.putNumber("Gyro Rate:", RobotMap.gyro.getRate());
		System.out.println("Amps: " + RobotMap.leftTowerTalon.getOutputCurrent());
		System.out.println("Volts: " + RobotMap.rightTowerTalon.getMotorOutputVoltage());*/
		
		SmartDashboard.putNumber("Left Side Encoder Position", RobotMap.frontLeftTalon.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Left Side Encoder Velocity", RobotMap.frontLeftTalon.getSelectedSensorVelocity(0));
		SmartDashboard.putNumber("Right Side Encoder Position", RobotMap.frontRightTalon.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Right Side Encoder Velocity", RobotMap.frontRightTalon.getSelectedSensorVelocity(0));
		
		//SmartDashboard.putData("AutoTuneVelocity", new AutoTuneVelocity(RobotMap.driveTrainSubsystem, new BobTalonSRX(2), 1, 4000, 0));
	
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() 
	{
		//SmartDashboard.putData("AutoTuneVelocity", new AutoTuneVelocity(RobotMap.driveTrainSubsystem, new BobTalonSRX(2), 1, 4000, 0));
		
	}
	
	/**
	 * Calls the commands when the buttons are pressed in the smartdashboard<br>
	 * Commands MUST be added here in order to work in autonomous
	 */
	public void scheduleCommands()
	{
		if(RobotMap.isRight)
        {
            SmartDashboard.putString("In R If Statement: ", "R");
            if(m_chooser.getSelected().getName().equals("RRAutonomousRightCommandGroup"))
            {
                SmartDashboard.putString("In 1st if: ", "In");
                System.out.println("1st: ");
                
                Scheduler.getInstance().add(new SameSideSwitchCommandGroup(RobotMap.isRight));
                
                return;
            }
            else if(m_chooser.getSelected().getName().equals("LLAutonomousLeftCommandGroup"))
            {
                System.out.println("2nd: ");
                SmartDashboard.putString("In 2nd if: ", "In");
                
                Scheduler.getInstance().add(new FollowTrajectory(new OppositeSideSwitch(RobotMap.isRight)));
                
                return;
            }
            //In middle
            else if(m_chooser.getSelected().getName().equals("TestCommandDontHateMeTaylor"))
            {
                System.out.println("3rd: ");
                SmartDashboard.putString("In 3rd if: ", "In");
                
                Scheduler.getInstance().add(new FollowTrajectory(new CenterSwitch(RobotMap.isRight)));
                
                return;
            }
        }
		else
        {
            SmartDashboard.putString("In L If Statement: ", "L");
            
            if(m_chooser.getSelected().getName().equals("RRAutonomousRightCommandGroup"))
            {
                System.out.println("4th: ");
                SmartDashboard.putString("In 4th if: ", "In");
                
                Scheduler.getInstance().add(new FollowTrajectory(new OppositeSideSwitch(RobotMap.isRight)));
                
                return;
            }
            else if(m_chooser.getSelected().getName().equals("LLAutonomousLeftCommandGroup"))
            {
                System.out.println("5th ");
                SmartDashboard.putString("In 5th if: ", "In");
                
                Scheduler.getInstance().add(new FollowTrajectory(new SameSideSwitch(RobotMap.isRight)));
                
                return;
            }
            //In middle
            else if(m_chooser.getSelected().getName().equals("TestCommandDontHateMeTaylor"))
            {
                System.out.println("6th: ");
                SmartDashboard.putString("In 6th if: ", "In");
                
                Scheduler.getInstance().add(new FollowTrajectory(new CenterSwitch(RobotMap.isRight)));
                
                return;
            }
        }
	}
	
	@Override
	public boolean isDisabled() 
	{
		// TODO Auto-generated method stub
		 RobotMap.keepThreadRunning = false;
		return super.isDisabled();
	}

}
