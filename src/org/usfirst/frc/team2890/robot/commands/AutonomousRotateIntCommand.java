/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2890.robot.*;

/**
 * Rotates the bot a set amount of degrees
 */
public class AutonomousRotateIntCommand extends Command 
{
	private double turnDegrees;
	
	public AutonomousRotateIntCommand(double turnDegrees) 
	{
		// Use requires() here to declare subsystem dependencies
		requires(RobotMap.driveTrainSubsystem);
		this.turnDegrees = turnDegrees;
	}

	/**
	 * Called just before this Command runs the first time
	 */
	@Override
	protected void initialize() 
	{
		RobotMap.stopRotating = false;
		RobotMap.goalAngle = RobotMap.gyro.getAngle() + turnDegrees;
	}

	/**
	 * Called repeatedly when this Command is scheduled to run
	 */
	@Override
	protected void execute() 
	{
		RobotMap.driveTrainSubsystem.turnDegrees(RobotMap.goalAngle, turnDegrees);
	}

	/**
	 * Make this return true when this Command no longer needs to run execute()
	 */
	@Override
	protected boolean isFinished() 
	{
		return RobotMap.stopRotating;
	}

	/**
	 * Called once after isFinished returns true
	 */
	@Override
	protected void end() 
	{
	}

	/**
	 * Called when another command which requires one or more of the same subsystems is scheduled to run
	 */
	@Override
	protected void interrupted() 
	{
	}
}
