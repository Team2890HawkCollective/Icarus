package org.usfirst.frc.team2890.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 * Delays the robot for a set amount of time.
 */
public class AutonomousDelayCommand extends TimedCommand 
{

    public AutonomousDelayCommand(double timeout) 
    {
    	super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    /**
     * Called just before this Command runs the first time
     */
    protected void initialize() 
    {
    	
    }

    /**
     * Called repeatedly when this Command is scheduled to run
     */
    protected void execute() 
    {
    	
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
