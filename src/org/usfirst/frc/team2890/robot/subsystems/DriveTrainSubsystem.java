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
	
	public void xboxArcadeDrive()
	{
		RobotMap.driveTrain.arcadeDrive(RobotMap.driverController.getY(Hand.kLeft) * RobotMap.FORWARDS_BACKWARDS_SENSITIVITY, 
				RobotMap.driverController.getX(Hand.kRight) * RobotMap.X_INVERTED * RobotMap.ROTATION_SENSITIVTY);
	}
	
	public void tankDrive()
	{
		RobotMap.driveTrain.tankDrive(RobotMap.driverController.getY(Hand.kLeft), RobotMap.driverController.getY(Hand.kRight));
	}
	
	public void driveForward()
	{
		RobotMap.driveTrain.arcadeDrive(RobotMap.AUTONOMOUS_FORWARD_SPEED, 0);
	}
	
	
	public void driveBackward()
	{
		RobotMap.driveTrain.arcadeDrive(RobotMap.AUTONOMOUS_BACKWARD_SPEED, 0);
	}
	
	public void turnLeft()
	{

		RobotMap.driveTrain.arcadeDrive(0, RobotMap.AUTONOMOUS_ROTATE_LEFT_SPEED);
	}
	
	public void turnRight()
	{
		RobotMap.driveTrain.arcadeDrive(0, RobotMap.AUTONOMOUS_ROTATE_RIGHT_SPEED);
	}
	    
	public void stopMoving()
	{
		RobotMap.driveTrain.stopMotor();
	}
	
	public void autonomousRotateWithCamera()
	{
		double turnValue = 0; //PLEASE REPLACE ZERO WITH CAMERA THREAD INPUT!!!
								//PLEASE REPLACE THIS!!!
		double currentAngle = RobotMap.gyro.getAngle();
		double goalAngle = currentAngle + turnValue;
		
		/*if(Math.abs(currentAngle)<Math.abs(goalAngle))
		{
			if(turnValue > 0) turnRight();
			if(turnValue < 0) turnLeft();
			//if(RobotMap.gyro.getAngle()-turnValue <= 1 || RobotMap.gyro.getAngle()-turnValue >= -1) stopMoving();
		} */
		
		if(turnValue > 0) 
			{
				turnLeft();
				goalAngle = currentAngle + turnValue;
				if(currentAngle <= goalAngle+1 || currentAngle >= goalAngle-1) stopMoving();
			}
		if(turnValue < 0) 
			{
				turnRight();
				goalAngle = currentAngle + turnValue;
				if(currentAngle <= goalAngle+1 || currentAngle >= goalAngle-1) stopMoving();
			}
	}
	
	public void turnDegrees()
	{
		//double initialGyro = firstGyroValue;
		double currentGyro = RobotMap.gyro.getAngle();
		//double turnValue = RobotMap.autonomousAngle;
		double goalAngle = RobotMap.initialGyro + RobotMap.AUTONOMOUS_CONSTANT_ANGLE;
		
		System.out.println("Initial Gyro: " + RobotMap.initialGyro);
		System.out.println("Gyro Angle: " + RobotMap.gyro.getAngle());
		System.out.println("Turn Value: " + RobotMap.autonomousAngle);
		System.out.println("Goal Angle: " + goalAngle + "\n    ");
		System.out.println();
		
		if(RobotMap.autonomousAngle > 3) 
		{	
			turnRight();
			//RobotMap.autonomousAngle = currentGyro - goalAngle; 
			RobotMap.autonomousAngle = goalAngle - currentGyro;
			System.out.println("Turn Right Activated!\n");
		}
		else if(RobotMap.autonomousAngle < -3) 
		{
			turnLeft();
			//RobotMap.autonomousAngle = currentGyro - goalAngle; 
			RobotMap.autonomousAngle = goalAngle + Math.abs(currentGyro);
			System.out.println("Turn Left Activated!\n");
		}
		else 
		{
			stopMoving();
			System.out.println("We have stopped moving\n");
		}
	}
	
	public void rangedDriveForward()
	{
		if(RobotMap.rangeFinder.getRangeInches() >= RobotMap.RANGE_TARGET)
		{
			driveForward();
			System.out.println("Have Not Reached Target Range");
		}
		else
		{
			stopMoving();
			System.out.println("Reached Target Range");
		}
	}
	
}
