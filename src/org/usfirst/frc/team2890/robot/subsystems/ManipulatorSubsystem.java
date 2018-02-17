package org.usfirst.frc.team2890.robot.subsystems;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ManipulatorSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void openGripper()
    {
    	if (RobotMap.assistantDriverController.getAButton())
    	{
    		RobotMap.grabberSolenoid.set(DoubleSolenoid.Value.kReverse);
    	}
    }
    
    public void closeGripper()
    {
    	if(RobotMap.assistantDriverController.getXButton())
    	{
    		RobotMap.grabberSolenoid.set(DoubleSolenoid.Value.kForward);
    	}
    }
    
    public void cubeUp()
    {
    	if (RobotMap.assistantDriverController.getYButton())
    	{
    		RobotMap.rotateSolenoid.set(DoubleSolenoid.Value.kReverse);
    	}
    }
    
    public void cubeDown()
    {
    	if (RobotMap.assistantDriverController.getBButton())
    	{
    		RobotMap.rotateSolenoid.set(DoubleSolenoid.Value.kForward);
    	}
    }
    
    public void shiftToHighGear()
    {
    	if(RobotMap.assistantDriverController.getBackButton())
    	{
    		RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kReverse);
    	}
    }
    
    public void shiftToLowGear()
    {
    	if(RobotMap.assistantDriverController.getStartButton())
    	{
    		RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kForward);
    	}
    }
    
    public void towerUp()
    {
    	if (RobotMap.assistantDriverController.getBumper(Hand.kLeft))
    	{
    		RobotMap.towerTalon.set(0.1);
    	}
    	else 
    	{
    		RobotMap.towerTalon.set(0.0);
    	}
    }
    
    public void towerDown()
    {
    	if (RobotMap.assistantDriverController.getBumper(Hand.kRight))
    	{
    		RobotMap.towerTalon.set(-0.1);
    	}
    	else
    	{
    		RobotMap.towerTalon.set(0.0);
    	}
    }
    
    
    
    
}
	
	
