package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousTargetingLeftCommandGroup extends CommandGroup {

    public AutonomousTargetingLeftCommandGroup() {
    	

    	addSequential(new LiftUpCommand(RobotMap.LIFT_TIMED_RAISE));
    	//addSequential(new AutonomousDelayCommand(1.0));
    	addSequential(new AutonomousTimedDriveForward(RobotMap.AUTONOMOUS_MIDDLE_ONE_SECOND_TIMED_DRIVE));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.leftTurnDegrees));
    	addSequential(new AutonomousTimedDriveForward(RobotMap.leftAutonomousMiddleTimeDrive));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees));
    	addSequential(new AutonomousTimedDriveForward(2.0));
    	addSequential(new ClawDownCommand());
    	addSequential(new OpenGripperCommand(1.0));
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
    }
}
