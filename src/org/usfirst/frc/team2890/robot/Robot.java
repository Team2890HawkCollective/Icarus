/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.*;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2890.robot.commands.*;

import org.usfirst.frc.team2890.robot.subsystems.*;

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
		SmartDashboard.putNumber("Time Drive Forward: ", 0);
		SmartDashboard.putNumber("Rotate number: ", 0);
		
		RobotMap.init();
		RobotMap.m_oi = new OI();
		
		RobotMap.gyro.reset();
		
		// chooser.addObject("My Auto", new MyAutoCommand());
		
		//Have to have .addDefault() or else will not show up.
		m_chooser.addDefault("Autonomous from the Middle Right: ", RobotMap.autonomousTargetingRightCommandGroup);
		m_chooser.addObject("Autonomous from the Middle Left: ", RobotMap.autonomousTargetingLeftCommandGroup);
		m_chooser.addObject("Autonomous from the Left: ", RobotMap.autonomousLeftCommandGroup);
		m_chooser.addObject("Autonomous from the Right: ", RobotMap.autonomousRightCommandGroup);
		SmartDashboard.putData("Auto mode", m_chooser);
		
		//RobotMap.gyro.calibrate();
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() 
	{

	}

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
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */
		
		RobotMap.gyro.reset();
		
		RobotMap.autonomousCommandGroupChooser = (CommandGroup) m_chooser.getSelected();
		
		//Scheduler.getInstance().add(RobotMap.rotationAutonomous);
		
		/*RobotMap.autonomousCommandGroupChooser.start();
		
		
		while((DriverStation.getInstance().getGameSpecificMessage()) == null)
		{
			
		}	 
		
		RobotMap.gameData = DriverStation.getInstance().getGameSpecificMessage();
		RobotMap.gameDataLetter = RobotMap.gameData.substring(0, 1);
		
		if(RobotMap.gameDataLetter.equalsIgnoreCase("R"))
		{
			if(m_chooser.getSelected().getName() == "Autonomous from the Right: ")
			{
				RobotMap.autonomousCommandGroupChooser.start();
				
			}
			else if(m_chooser.getSelected().getName() == "Autonomous from the Left: ")
			{
				Scheduler.getInstance().add(RobotMap.timedDriveForwardAutonomousCommand);
			}
			else if(m_chooser.getSelected().getName() == "Autonomous from the Middle Right: ")
			{
				RobotMap.autonomousCommandGroupChooser.start();
			}
		}
		else if(RobotMap.gameDataLetter.equalsIgnoreCase("L"));
		{
			if(m_chooser.getSelected().getName() == "Autonomous from the Right: ")
			{
				Scheduler.getInstance().add(RobotMap.timedDriveForwardAutonomousCommand);
			}
			else if(m_chooser.getSelected().getName() == "Autonomous from the Left: ")
			{
				RobotMap.autonomousCommandGroupChooser.start();
			}
			else if(m_chooser.getSelected().getName() == "Autonomous from the Middle Left: ")
			{
				RobotMap.autonomousCommandGroupChooser.start();
			}
		}
		*/
		
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() 
	{
		SmartDashboard.putNumber("Gyro:", RobotMap.gyro.getAngle());
		RobotMap.AUTONOMOUS_DRIVE_FORWARD_TIME = SmartDashboard.getNumber("Time Drive Forward: ", -1);
		
		
		RobotMap.turnDegrees = SmartDashboard.getNumber("Rotate number: ", -20);
		
		// Done this way so we can use the SmartDashboard number
		if(RobotMap.firstTimeThrough)
		{
			RobotMap.timedDriveForwardAutonomousCommand = new AutonomousTimedDriveForward(RobotMap.AUTONOMOUS_DRIVE_FORWARD_TIME);
			RobotMap.rotationAutonomous = new AutonomousRotateIntCommand(RobotMap.turnDegrees);
			
			Scheduler.getInstance().add(RobotMap.rotationAutonomous);
			RobotMap.firstTimeThrough = false;
		}
		
		Scheduler.getInstance().run();
	}

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
		
		RobotMap.frontLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.frontRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		
		Scheduler.getInstance().add(RobotMap.xboxDriveCommand);
		RobotMap.compressor.setClosedLoopControl(true);
		
		
		//RobotMap.gyro.reset();
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() 
	{
		Scheduler.getInstance().run();
		
		//test to tell if we are able to send data using the buttons by displaying it on SmartDashboard
		SmartDashboard.putBoolean("Y",RobotMap.driverController.getYButton());
		SmartDashboard.putBoolean("X",RobotMap.driverController.getXButton());
		SmartDashboard.putBoolean("B",RobotMap.driverController.getBButton());
		SmartDashboard.putBoolean("A",RobotMap.driverController.getAButton());
		SmartDashboard.putNumber("Gyro:", RobotMap.gyro.getAngle());
		SmartDashboard.putNumber("Gyro Rate:", RobotMap.gyro.getRate());
		
		if(RobotMap.driverController.getBButton())
		{
			RobotMap.driveTrainSubsystem.stopMoving();
			Scheduler.getInstance().removeAll();
			Scheduler.getInstance().add(RobotMap.xboxDriveCommand);
		}
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() 
	{
		if(RobotMap.flag)
		{ 
			RobotMap.compressor.setClosedLoopControl(true);
			RobotMap.flag = false;
		}
		//if(RobotMap.driverController.getBButton())
		//{
			//RobotMap.testTalon.set(1);
		//}
		//RobotMap.compressor.setClosedLoopControl(true);
	}
}
