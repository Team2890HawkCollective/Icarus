package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @deprecated
 * Puts the value of the rangefinder on the smartdashboard
 */
public class RangeFinderFindDistanceInInchesCommand extends Command 
{

	/**
	 * @deprecated
	 */
    public RangeFinderFindDistanceInInchesCommand() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(RobotMap.sensorSubsystem);
    }

    /**
     * @deprecated
     * Called just before this Command runs the first time
     */
    protected void initialize() 
    {
    }

    /**
     * @deprecated
     * Called repeatedly when this Command is scheduled to run
     */
    protected void execute() 
    {
    	RobotMap.sensorSubsystem.getRangeInInches();
    	SmartDashboard.putNumber("RangeFinder Distance: ", RobotMap.rangeFinderDistanceInches);
    }

    /**
     * @deprecated
     * Make this return true when this Command no longer needs to run execute()
     */
    protected boolean isFinished() 
    {
        return false;
    }

    /**
     * @deprecated
     * Called once after isFinished returns true
     */
    protected void end() 
    {
    }

    /**
     * @deprecated
     * Called when another command which requires one or more of the same subsystems is scheduled to run
     */
    protected void interrupted() 
    {
    }
}
