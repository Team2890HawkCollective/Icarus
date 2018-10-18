package org.usfirst.frc.team2890.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Exactly what it says. It's a test command.<br>
 * Don't hate me Taylor for this javadoc
 */
public class TestCommandDontHateMeTaylor extends CommandGroup 
{

    public TestCommandDontHateMeTaylor() 
    {
    	addSequential(new AutonomousRotateIntCommand(90));
    	addSequential(new AutonomousRotateIntCommand(-90));
    }
}
