package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class LiftUpCommand extends TimedCommand {

    public LiftUpCommand(double timeout) {
    	super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//RobotMap.liftUpFlag = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//RobotMap.manipulatorSubsystem.liftUp();
    	RobotMap.rightTowerTalon.set(RobotMap.TOWER_UP_VARIABLE * RobotMap.TOWER_UP_DIRECTION);
		RobotMap.leftTowerTalon.set(RobotMap.TOWER_UP_VARIABLE * RobotMap.TOWER_UP_DIRECTION);
		System.out.println("In Lift Tower Command. ");
    }

    // Make this return true when this Command no longer needs to run execute()
    /*
    protected boolean isFinished() {
    	RobotMap.rightTowerTalon.stopMotor();
		RobotMap.leftTowerTalon.stopMotor();
        return RobotMap.liftUpFlag;
    }
    */

    // Called once after isFinished returns true
    protected void end() 
    {
    	RobotMap.rightTowerTalon.stopMotor();
    	RobotMap.leftTowerTalon.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
