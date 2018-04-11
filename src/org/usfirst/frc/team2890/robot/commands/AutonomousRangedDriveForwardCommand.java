package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives the bot forward until a specified range is met
 */
public class AutonomousRangedDriveForwardCommand extends Command 
{

    public AutonomousRangedDriveForwardCommand() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(RobotMap.driveTrainSubsystem);
    }

    /**
     * Called just before this Command runs the first time
     */
    protected void initialize() 
    {
    	RobotMap.rangeFinderExitFlag = false;
    }

    /**
     * Called repeatedly when this Command is scheduled to run
     */
    protected void execute() 
    {
    	RobotMap.driveTrainSubsystem.rangedDriveForward();
    }

    /**
     * Make this return true when this Command no longer needs to run execute()
     */
    protected boolean isFinished() 
    {
        return RobotMap.rangeFinderExitFlag;
    }

    /**
     * Called once after isFinished returns true
     */
    protected void end() 
    {
    	
    }

    /**
     * Called when another command which requires one or more of the same subsystems is scheduled to run
     */
    protected void interrupted() 
    {
    	
    }
}
