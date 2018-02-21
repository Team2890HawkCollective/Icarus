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
 * An example command.  You can replace me with your own command.
 */
public class AngleDegreesFromCamera extends Command 
{

	private double turnDegrees;
	public AngleDegreesFromCamera(double turnDegrees) 
	{
		// Use requires() here to declare subsystem dependencies
		//rotationAngle = degrees;
		requires(RobotMap.driveTrainSubsystem);
		this.turnDegrees = turnDegrees;
		
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		RobotMap.stopRotating = false;
		RobotMap.goalAngle = RobotMap.gyro.getAngle() + turnDegrees;	
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() 
	{
		if(RobotMap.hambyRoomGripPipelineLongRange.filterContoursOutput.size() > 2)
		{
			if(RobotMap.angleFromTarget <= 20 && RobotMap.angleFromTarget >= -20)
				//INSTEAD OF THIS, ASSIGN THE VALUE OF ANGLEFROMTARGET TO A STATIC VARIABLE IN ROBOTMAP
				RobotMap.driveTrainSubsystem.turnDegrees(RobotMap.goalAngle, turnDegrees);
			else
				//ASSIGN VALUE OF 0 TO VALUE IN ROBOTMAP
				RobotMap.stopRotating = true;
		}
		else
			//ASSIGN VALUE OF 0 IN ROBOTMAP
			RobotMap.stopRotating = true;
		
		//SET STOP ROTATING = TRUE NO MATTER WHAT SO IT ONLY RUNS ONCE
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() 
	{
		return RobotMap.stopRotating;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
