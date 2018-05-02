package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team319.paths.*;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SameSideSwitchCommandGroup extends CommandGroup {

    public SameSideSwitchCommandGroup(boolean isRight) {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	addSequential(new FollowTrajectory(new SameSideSwitch(isRight)));
    	addSequential(new FollowTrajectory(new SameSideSwitchPart1point3(isRight)));
    	addSequential(new FollowTrajectory(new SameSideSwitchPart1point6(isRight)));
    	
    }
}
