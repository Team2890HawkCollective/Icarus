package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Rotation for targeting with camera from left
 */
public class AutonomousCameraTargetingLeftCommandGroup extends CommandGroup 
{

    public AutonomousCameraTargetingLeftCommandGroup() 
    {
    	addSequential(new AutonomousRotateIntCommand(RobotMap.leftTurnDegrees));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees));
    	addSequential(new AngleDegreesFromCamera(RobotMap.angleFromTarget));
    	
    	//CALL ROTATEINT WITH THE STATIC VARIABLE FROM THE ANGLE COMMAND
    }
}
