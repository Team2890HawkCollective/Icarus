package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Autonomous from right with switch on right
 */
public class RRAutonomousRightCommandGroup extends CommandGroup 
{

    public RRAutonomousRightCommandGroup() 
    {
    	addSequential(new AutonomousTimedDriveForward(RobotMap.autonomousLeftOrRightTimeDrive));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.leftTurnDegrees));
    	addSequential(new AutonomousTimedDriveForward(2.0));
    	addSequential(new ClawDownCommand());
    	addSequential(new OpenGripperCommand());
    }
}
