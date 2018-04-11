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
 * @deprecated
 * Turns ramp present on the Talon on
 */
public class TalonRampOnCommand extends Command 
{
	public TalonRampOnCommand() 
	{
		// Use requires() here to declare subsystem dependencies
		requires(RobotMap.driveTrainSubsystem);
	}

	/**
	 * Called just before this Command runs the first time
	 */
	@Override
	protected void initialize() 
	{
	}

	/**
	 * Called repeatedly when this Command is scheduled to run
	 */
	@Override
	protected void execute() 
	{
		RobotMap.driveTrainSubsystem.talonRampOn();
	}

	/**
	 * Make this return true when this Command no longer needs to run execute()
	 */
	@Override
	protected boolean isFinished() {
		return false;
	}

	/**
	 * Called once after isFinished returns true
	 */
	@Override
	protected void end() {
	}

	/**
	 * Called when another command which requires one or more of the same subsystems is scheduled to run
	 */
	@Override
	protected void interrupted() {
	}
}
