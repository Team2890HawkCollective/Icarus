package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Rotation for targeting with camera from the right
 */
public class AutonomousCameraTargetingRightCommandGroup extends CommandGroup 
{

    public AutonomousCameraTargetingRightCommandGroup() 
    {
    	addSequential(new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.leftTurnDegrees));
    	addSequential(new AngleDegreesFromCamera(RobotMap.angleFromTarget));
    }
}
