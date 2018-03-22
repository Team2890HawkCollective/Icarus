/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot.subsystems;

import org.usfirst.frc.team2890.robot.RobotMap;
import org.usfirst.frc.team2890.robot.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class SensorSubsystem extends Subsystem 
{
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() 
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		// setDefaultCommand(new XboxDriveCommand());
		RobotMap.rangeFinder.setAutomaticMode(true);
	}
	
	public void gyroSetting()
	{
		RobotMap.gyro.reset();
		RobotMap.gyro.calibrate();
	}
	
	public void getRangeInInches()
	{
		RobotMap.rangeFinderDistanceInches = RobotMap.rangeFinder.getRangeInches();
		//System.out.println(RobotMap.rangeFinder.getRangeInches());
	}
	
	public Boolean isLowerLimitSwitchPressed()
	{
		 return RobotMap.lowerElevatorLimitSwitch.get();
	}
	
	public Boolean isUpperLimitSwitchPressed()
	{
		 return RobotMap.upperElevatorLimitSwitch.get();
	}
}
