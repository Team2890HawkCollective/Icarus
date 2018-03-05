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
    
    public void controlManipulator()
    {
    	//controlTower method
    	//Tower up
    	if (RobotMap.assistantDriverController.getBumper(Hand.kLeft))
    	{
    		RobotMap.rightTowerTalon.set(RobotMap.TOWER_UP_VARIABLE);
    		RobotMap.leftTowerTalon.set(RobotMap.TOWER_UP_VARIABLE);
    		//.rightTowerTalon.set(-1); //0.1
    		System.out.println("Hello, K.Right is Pressed");
    	}
    	//Tower down
    	else if (RobotMap.assistantDriverController.getBumper(Hand.kRight))
    	{
    		RobotMap.rightTowerTalon.set(-RobotMap.TOWER_UP_VARIABLE);
    		RobotMap.leftTowerTalon.set(-RobotMap.TOWER_UP_VARIABLE);
    		//.rightTowerTalon.set(-1); //0.1
    		System.out.println("Hello, K.Right is Pressed");
    	}
    	else
    	{
    		RobotMap.rightTowerTalon.stopMotor();
    		RobotMap.leftTowerTalon.stopMotor();
    	}
    	
    	//shiftGear method
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
    	
    	//controlCube method
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
    	
    	//controlGripper method
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
    }
    
    public void openGripper()
    {
    	RobotMap.grabberSolenoid.set(DoubleSolenoid.Value.kReverse);
    	RobotMap.openedGripperFlag = true;
    }
    
    public void closeGripper()
    {
    	RobotMap.grabberSolenoid.set(DoubleSolenoid.Value.kForward);
    	RobotMap.closedGripperFlag = true;
    }
    
    public void dropClaw()
    {
    	RobotMap.rotateSolenoid.set(DoubleSolenoid.Value.kForward);
    	RobotMap.clawDownFlag = true;
    }
    
}