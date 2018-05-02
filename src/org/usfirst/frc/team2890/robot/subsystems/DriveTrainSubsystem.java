/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot.subsystems;

import org.usfirst.frc.team2890.robot.RobotMap;
import org.usfirst.frc.team2890.robot.commands.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Controls all aspects of the drivetrain<br>
 * Used during teleop with the xboxArcadeDrive and tankDrive methods<br>
 * Used during autonomous with everything else from line:54 to line:214
 */
public class DriveTrainSubsystem extends Subsystem 
{
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	//requires.RobotMap.driveTrainSubsystem;

	/**
	 * Sets the xbox drive command as the default command for this subsystem
	 */
	public void initDefaultCommand() 
	{
		setDefaultCommand(new XboxDriveCommand());
	}
	
	/**
	 * Maps the values of the joysticks to the talons<br>
	 * <img src="arcade_drive.png" alt="Arcade Drive">
	 */
	public void xboxArcadeDrive()
	{
		RobotMap.driveTrain.arcadeDrive(RobotMap.driverController.getY(Hand.kLeft) * RobotMap.FORWARDS_BACKWARDS_SENSITIVITY, 
				RobotMap.driverController.getX(Hand.kRight) * RobotMap.X_INVERTED * RobotMap.ROTATION_SENSITIVTY);
	}
	
	/**
	 * Maps the values of the joysticks to the talons<br>
	 * <img src="tank_drive.gif" alt="Tank Drive">
	 */
	public void tankDrive()
	{
		//RobotMap.driveTrain.tankDrive(RobotMap.driverController.getY(Hand.kLeft), RobotMap.driverController.getY(Hand.kRight));
		if (RobotMap.driverController.getY(Hand.kLeft) < -0.1)
		{
			RobotMap.frontLeftTalon.set(ControlMode.PercentOutput, Math.pow(RobotMap.driverController.getY(Hand.kLeft), 2));
		}
		else
		{
			RobotMap.frontLeftTalon.set(ControlMode.PercentOutput, -(Math.pow(RobotMap.driverController.getY(Hand.kLeft), 2)));
		}
		
		if (RobotMap.driverController.getY(Hand.kRight) < -0.1)
		{
			RobotMap.frontRightTalon.set(ControlMode.PercentOutput, -(Math.pow(RobotMap.driverController.getY(Hand.kRight), 2)));
		}
		else
		{
			RobotMap.frontRightTalon.set(ControlMode.PercentOutput, Math.pow(RobotMap.driverController.getY(Hand.kRight), 2));
		}
	}
	
	/**
	 * Moves the robot forward by manually setting the arcadeDrive method values
	 */
	public void driveForward()
	{
		RobotMap.driveTrain.arcadeDrive(RobotMap.AUTONOMOUS_FORWARD_SPEED, 0);
	}
	
	/**
	 * Moves the robot backward by manually setting the arcadeDrive method values
	 */
	public void driveBackward()
	{
		RobotMap.driveTrain.arcadeDrive(RobotMap.AUTONOMOUS_BACKWARD_SPEED, 0);
	}
	
	/**
	 * Rotates the robot left by manually setting the arcadeDrive method values
	 */
	public void turnLeft()
	{

		RobotMap.driveTrain.arcadeDrive(0, RobotMap.AUTONOMOUS_ROTATE_LEFT_SPEED);
	}
	
	/**
	 * Rotates the robot right by manually setting the arcadeDrive medthod values
	 */
	public void turnRight()
	{
		RobotMap.driveTrain.arcadeDrive(0, RobotMap.AUTONOMOUS_ROTATE_RIGHT_SPEED);
	}
	
	/**
	 * Stops the robot moving by calling the driveTrain.stopMotor() method
	 */
	public void stopMoving()
	{
		RobotMap.driveTrain.stopMotor();
	}
	
	/**
	 * @deprecated
	 * Turns off the ramp on the talons
	 */
	public void talonRampOff()
	{
		RobotMap.frontLeftTalon.configOpenloopRamp(RobotMap.RAMP_OFF_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.frontRightTalon.configOpenloopRamp(RobotMap.RAMP_OFF_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearLeftTalon.configOpenloopRamp(RobotMap.RAMP_OFF_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearRightTalon.configOpenloopRamp(RobotMap.RAMP_OFF_TIME, RobotMap.RAMP_TIMEOUT);
	}
	
	/**
	 * @deprecated
	 * Turns on the ramp on the talons
	 */
	public void talonRampOn()
	{
		RobotMap.frontLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.frontRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
	}
	
	/**
	 * @deprecated
	 * SUPPOSEDLY Rotates the robot by using the gyro and camera<br>
	 * NOT WORKING
	 */
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
			if(currentAngle <= goalAngle+1 || currentAngle >= goalAngle-1) 
			{
				stopMoving();
			}
		}
		
		if(turnValue < 0) 
		{
			turnRight();
			goalAngle = currentAngle + turnValue;
			if(currentAngle <= goalAngle+1 || currentAngle >= goalAngle-1)
			{
				stopMoving();
			}
		}
	}
	
	/**
	 * Rotates the robot a provided amount of degrees
	 * @param goalAngle
	 * @param turnDegrees
	 */
	public void turnDegrees(double goalAngle, double turnDegrees)
	{
		if(turnDegrees > 0)
		{
			if(RobotMap.gyro.getAngle() < goalAngle)
			{
				turnRight();
			}
			else
			{
				System.out.println("Stopped Moving");
				stopMoving();
				RobotMap.stopRotating = true;
			}
		}
		else
		{
			if(RobotMap.gyro.getAngle() > goalAngle)
			{
				turnLeft();
			}
			else
			{
				stopMoving();
				RobotMap.stopRotating = true;
			}
		}
	}
	
	/**
	 * @deprecated
	 * SUPPOSEDLY moves the robot forward until a distance is reached
	 * NOT WORKING
	 */
	public void rangedDriveForward()
	{
		if(RobotMap.rangeFinder.getRangeInches() >= RobotMap.RANGE_TARGET)
		{
			driveBackward();
			System.out.println("Have Not Reached Target Range");
		}
		else
		{
			stopMoving();
			RobotMap.rangeFinderExitFlag = true;
			System.out.println("Reached Target Range");
		}
	}
	
}
