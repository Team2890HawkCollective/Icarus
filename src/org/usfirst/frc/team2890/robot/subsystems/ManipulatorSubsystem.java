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
    	RobotMap.upperLimitSwitch = RobotMap.sensorSubsystem.isUpperLimitSwitchPressed();
    	RobotMap.lowerLimitSwitch = RobotMap.sensorSubsystem.isLowerLimitSwitchPressed();
    	//controlTower method
    	//Tower Down
    	if (RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft) > RobotMap.TRIGGER_SENSITIVIY && RobotMap.lowerLimitSwitch)
    	{
    		RobotMap.rightTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft));
    		RobotMap.leftTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft));
    		System.out.println("left Trigger: " + RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft));
    	}
    	//Tower up
    	else if (RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) > RobotMap.TRIGGER_SENSITIVIY && !RobotMap.upperLimitSwitch)
    	{
    		RobotMap.rightTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) * RobotMap.TOWER_UP_DIRECTION);
    		RobotMap.leftTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) * RobotMap.TOWER_UP_DIRECTION);
    		System.out.println("right Trigger: " + RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight));
    	}
    	//Stop tower
    	else
    	{
    		RobotMap.rightTowerTalon.stopMotor();
    		RobotMap.leftTowerTalon.stopMotor();
    	}
    	//Tower Down
    	/*if (RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft) > RobotMap.TRIGGER_SENSITIVIY)
    	{   
    		if(RobotMap.lowerLimitSwitch)
    		{
        		RobotMap.rightTowerTalon.stopMotor();
        		RobotMap.leftTowerTalon.stopMotor();
    		}
    		else if (RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft) > RobotMap.TRIGGER_SENSITIVIY)
    		{
    			RobotMap.rightTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft));
        		RobotMap.leftTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft));
        	}
    		else
        	{
        		RobotMap.rightTowerTalon.stopMotor();
        		RobotMap.leftTowerTalon.stopMotor();
        	}
    	}
    	//Tower up
    	else if (RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) > RobotMap.TRIGGER_SENSITIVIY)
    	{
    		if(RobotMap.upperLimitSwitch)
    		{
    			RobotMap.rightTowerTalon.stopMotor();
        		RobotMap.leftTowerTalon.stopMotor();
    		}
    		else if (RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) > RobotMap.TRIGGER_SENSITIVIY)
    		{
    			RobotMap.rightTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) * RobotMap.TOWER_UP_DIRECTION);
        		RobotMap.leftTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) * RobotMap.TOWER_UP_DIRECTION);
    		}
    		else
        	{
        		RobotMap.rightTowerTalon.stopMotor();
        		RobotMap.leftTowerTalon.stopMotor();
        	}
    	}*/
    	
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
    			RobotMap.elbowSolenoid.set(DoubleSolenoid.Value.kReverse);
        		RobotMap.controlCubeFlag = false;
        	}
    		//cube down
        	else
        	{
        		RobotMap.elbowSolenoid.set(DoubleSolenoid.Value.kForward);
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
    	
    	if(RobotMap.assistantDriverController.getStartButtonPressed())
    	{
    		if(RobotMap.controlRatchetFlag)
    		{
    			RobotMap.ratchetSolenoid.set(DoubleSolenoid.Value.kForward);
    			RobotMap.controlRatchetFlag = false;
    		}
    		else
    		{
    			RobotMap.ratchetSolenoid.set(DoubleSolenoid.Value.kReverse);
    			RobotMap.controlRatchetFlag = true;
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
    	RobotMap.elbowSolenoid.set(DoubleSolenoid.Value.kForward);
    	RobotMap.clawDownFlag = true;
    }
    
    public void liftUp()
    {
		if(RobotMap.upperLimitSwitch)
		{
    		RobotMap.rightTowerTalon.stopMotor();
    		RobotMap.leftTowerTalon.stopMotor();
		}
		else
		{
	    	RobotMap.rightTowerTalon.set(RobotMap.TOWER_UP_VARIABLE * RobotMap.TOWER_UP_DIRECTION);
			RobotMap.leftTowerTalon.set(RobotMap.TOWER_UP_VARIABLE * RobotMap.TOWER_UP_DIRECTION);
			RobotMap.liftUpFlag = true;
		}
    }
    
}