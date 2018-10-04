package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 * Lifts up the left for a set amount of time
 */
public class LiftUpCommand extends TimedCommand 
{

    public LiftUpCommand(double timeout) 
    {
    	super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(RobotMap.manipulatorSubsystem);
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
    	RobotMap.rightTowerTalon.set(RobotMap.TOWER_UP_VARIABLE * RobotMap.TOWER_UP_DIRECTION);
		RobotMap.leftTowerTalon.set(RobotMap.TOWER_UP_VARIABLE * RobotMap.TOWER_UP_DIRECTION);
		
		System.out.println("In Lift Tower Command. ");
    }

    /**
     * Called once after timeout
     */
    protected void end() 
    {
    	RobotMap.rightTowerTalon.stopMotor();
    	RobotMap.leftTowerTalon.stopMotor();
    }

    /**
     * Called when another command which requires one or more of the same subsystems is scheduled to run
     */
    protected void interrupted() 
    {
    }
}
