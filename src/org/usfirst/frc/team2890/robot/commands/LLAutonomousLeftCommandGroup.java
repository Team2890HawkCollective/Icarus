package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Autonomous from left with near switch and scale on left
 */
public class LLAutonomousLeftCommandGroup extends CommandGroup 
{

    public LLAutonomousLeftCommandGroup() 
    {
    	addSequential(new AutonomousTimedDriveForward(RobotMap.autonomousLeftOrRightTimeDrive));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees));
    	addSequential(new AutonomousTimedDriveForward(2.0));
    	addSequential(new ClawDownCommand());
    	addSequential(new OpenGripperCommand());
    }
}
