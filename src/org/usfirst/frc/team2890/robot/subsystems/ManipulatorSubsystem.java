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
    
    public void controlGripper()
    {
    	if(RobotMap.assistantDriverController.getXButtonPressed())
    	{
    		//open gripper
    		if(RobotMap.controlGripperFlag)
        	{
    			RobotMap.grabberSolenoid.set(DoubleSolenoid.Value.kReverse);
        		RobotMap.controlGripperFlag = false;
        	}
    		//close gripper
        	else
        	{
        		RobotMap.grabberSolenoid.set(DoubleSolenoid.Value.kForward);
        		RobotMap.controlGripperFlag = true;
        	}
    	}
    	//System.out.println("shiftGearMethod is working");
    }
    
    public void controlCube()
    {
    	if(RobotMap.assistantDriverController.getYButtonPressed())
    	{
    		//cube up
    		if(RobotMap.controlCubeFlag)
        	{
    			RobotMap.rotateSolenoid.set(DoubleSolenoid.Value.kReverse);
        		RobotMap.controlCubeFlag = false;
        	}
    		//cube down
        	else
        	{
        		RobotMap.rotateSolenoid.set(DoubleSolenoid.Value.kForward);
        		RobotMap.controlCubeFlag = true;
        	}
    	}
    	//System.out.println("shiftGearMethod is working");
    }
    
    public void shiftGearMethod()
    {
    	if(RobotMap.assistantDriverController.getAButtonPressed())
    	{
    		if(RobotMap.shiftGearButtonFlag)
        	{
        		RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kForward);
        		System.out.println("shifting to low gear");
        		RobotMap.shiftGearButtonFlag = false;
        	}
        	else
        	{
        		RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kReverse);
        		System.out.println("shifting to high gearr");
        		RobotMap.shiftGearButtonFlag = true;
        	}
    	}
    	System.out.println("shiftGearMethod is working"); //if(!RobotMap.shiftGearButtonFlag)
    }
    
    public void towerUp()
    {
    	if (RobotMap.assistantDriverController.getBumper(Hand.kLeft))
    	{
    		RobotMap.rightTowerTalon.set(0.1);
    	}
    	else 
    	{
    		RobotMap.rightTowerTalon.set(0.0);
    	}
    }
    
    public void towerDown()
    {
    	if (RobotMap.assistantDriverController.getBumper(Hand.kRight))
    	{
    		RobotMap.rightTowerTalon.set(-0.1);
    	}
    	else
    	{
    		RobotMap.rightTowerTalon.set(0.0);
    	}
    }
    
}
	
	
