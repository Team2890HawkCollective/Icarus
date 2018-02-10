/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot.subsystems;

import org.usfirst.frc.team2890.robot.RobotMap;
import org.usfirst.frc.team2890.robot.commands.*;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrainSubsystem extends Subsystem 
{
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	//requires.RobotMap.driveTrainSubsystem;

	public void initDefaultCommand() 
	{
		setDefaultCommand(new XboxDriveCommand());
	}
	
	public void arcadeDrive()
	{
		RobotMap.tankDrive.arcadeDrive(RobotMap.driverController.getY(Hand.kLeft) * RobotMap.FORWARDS_BACKWARDS_SENSITIVITY, 
				RobotMap.driverController.getX(Hand.kRight) * RobotMap.X_INVERTED * RobotMap.ROTATION_SENSITIVTY);
	}
	
	/*public void talonRampOn()
	{
		if (RobotMap.x_AxisLowerDeadband >= RobotMap.driverController.getX(Hand.kRight) && RobotMap.x_AxisUpperDeadband <= RobotMap.driverController.getX(Hand.kRight))
		{
			RobotMap.frontLeftTalon.configOpenloopRamp(0.5, 1);
			RobotMap.rearLeftTalon.configOpenloopRamp(0.5, 1);
			RobotMap.frontRightTalon.configOpenloopRamp(0.5, 1);
			RobotMap.rearRightTalon.configOpenloopRamp(0.5, 1);
		}
	}
	
	public void toggleTalonRampOn()
	{
		//RobotMap.leftTalonGroup.set(0);
		//RobotMap.rightTalonGroup.set(0);
		RobotMap.frontLeftTalon.configOpenloopRamp(0.5, 1);
		RobotMap.rearLeftTalon.configOpenloopRamp(0.5, 1);
		RobotMap.frontRightTalon.configOpenloopRamp(0.5, 1);
		RobotMap.rearRightTalon.configOpenloopRamp(0.5, 1);
	}
	
	public void talonRampOff()
	{
		if (RobotMap.x_AxisLowerDeadband >= RobotMap.driverController.getX(Hand.kRight) && RobotMap.x_AxisUpperDeadband <= RobotMap.driverController.getX(Hand.kRight))
		{
			RobotMap.frontLeftTalon.configOpenloopRamp(0, 1);
			RobotMap.rearLeftTalon.configOpenloopRamp(0, 1);
			RobotMap.frontRightTalon.configOpenloopRamp(0, 1);
			RobotMap.rearRightTalon.configOpenloopRamp(0, 1);
		}
		else
		{
			RobotMap.frontLeftTalon.configOpenloopRamp(0.5, 1);
			RobotMap.rearLeftTalon.configOpenloopRamp(0.5, 1);
			RobotMap.frontRightTalon.configOpenloopRamp(0.5, 1);
			RobotMap.rearRightTalon.configOpenloopRamp(0.5, 1);
		}
			
	}
	
	public void toggleTalonRampOff()
	{
		//RobotMap.leftTalonGroup.set(0);
		//RobotMap.rightTalonGroup.set(0);
		RobotMap.frontLeftTalon.configOpenloopRamp(0, 1);
		RobotMap.rearLeftTalon.configOpenloopRamp(0, 1);
		RobotMap.frontRightTalon.configOpenloopRamp(0, 1);
		RobotMap.rearRightTalon.configOpenloopRamp(0, 1);
	}*/
	
	public void tankDrive()
	{
		RobotMap.tankDrive.tankDrive(RobotMap.driverController.getY(Hand.kLeft), RobotMap.driverController.getY(Hand.kRight));
	}
	
	public void driveForward()
	{
		RobotMap.leftTalonGroup.set(RobotMap.AUTONOMOUS_FORWARD_SPEED);
		RobotMap.rightTalonGroup.set(RobotMap.AUTONOMOUS_FORWARD_SPEED);
	}
	
	public void driveBackward()
	{
		RobotMap.leftTalonGroup.set(RobotMap.AUTONOMOUS_BACKWARD_SPEED);
		RobotMap.rightTalonGroup.set(RobotMap.AUTONOMOUS_BACKWARD_SPEED);
	}
	
	public void turnLeft()
	{
		RobotMap.leftTalonGroup.set(RobotMap.AUTONOMOUS_BACKWARD_SPEED);
		RobotMap.rightTalonGroup.set(RobotMap.AUTONOMOUS_FORWARD_SPEED);
	}
	
	public void turnRight()
	{
		RobotMap.leftTalonGroup.set(RobotMap.AUTONOMOUS_FORWARD_SPEED);
		RobotMap.rightTalonGroup.set(RobotMap.AUTONOMOUS_BACKWARD_SPEED);
	}
	    
	public void stopMoving()
	{
		RobotMap.leftTalonGroup.set(RobotMap.AUTONOMOUS_KILL_SWITCH);
		RobotMap.rightTalonGroup.set(RobotMap.AUTONOMOUS_KILL_SWITCH);
	}
}
