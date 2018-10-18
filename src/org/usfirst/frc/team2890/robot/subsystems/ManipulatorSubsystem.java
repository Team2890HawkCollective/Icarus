package org.usfirst.frc.team2890.robot.subsystems;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Controls all aspects of the Manipulator<br>
 * ControlManipulator() method is used during teleop<br>
 * All other methods are used during autonomous
 */
public class ManipulatorSubsystem extends Subsystem 
{
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    /**
     * Maps the buttons from the controller to the different functions of the manipulator<br>
     * <b><i>All these buttons are placed on the Assistant Driver Controller</i></b><br>
     * <b>Left Trigger</b> Pulls Tower Down. Slows down when first limit switch is pressed, and auto stops when near the bottom<br>
     * <b>Right Trigger</b> Lifts Tower Up. SUPPOSEDLY Auto stops when near the top <i>Limit switch too sensitive to be placed properly, functionality not mechanically operational</i><br>
     * <b>A Button</b> Shifts Gears<br>
     * <b>Y Button</b> Raises/Lowers Elbow<br>
     * <b>X Button</b> Opens/Closes Gripper<br>
     * <b>Start Button</b> Engages/Disengages Ratchet<br>
     * <b><i>ON DRIVER CONTROLLER</i> A Button</b> "Turns On/Off" Second camera
     */
    public void controlManipulator()
    {
    	RobotMap.upperLimitSwitch = RobotMap.sensorSubsystem.isUpperLimitSwitchPressed();
    	RobotMap.lowerLimitSwitch = RobotMap.sensorSubsystem.isLowerLimitSwitchPressed();
<<<<<<< HEAD
    	RobotMap.secondaryLowerLimitSwitch = RobotMap.sensorSubsystem.isSecondaryLowerLimitSwitchPressed();
=======
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
    	
    	//controlTower method
    	//Tower Down
    	if (RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft) > RobotMap.TRIGGER_SENSITIVIY && !RobotMap.lowerLimitSwitch)
    		//!RobotMap.lowerLimitSwitch
    	{
    		RobotMap.rightTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft) * RobotMap.towerLoweringSensitivity);
    		RobotMap.leftTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft) * RobotMap.towerLoweringSensitivity);
    		System.out.println("left Trigger: " + RobotMap.assistantDriverController.getTriggerAxis(Hand.kLeft));
    	}
    	//Tower up
    	else if (RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) > RobotMap.TRIGGER_SENSITIVIY && RobotMap.upperLimitSwitch)
    	//RobotMap.upperLimitSwitch
    	{
    		RobotMap.rightTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) * RobotMap.TOWER_UP_DIRECTION);
    		RobotMap.leftTowerTalon.set(RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight) * RobotMap.TOWER_UP_DIRECTION);
    		System.out.println("right Trigger: " + RobotMap.assistantDriverController.getTriggerAxis(Hand.kRight));
    	}
    	//Stop tower
    	else
    	{
    		RobotMap.rightTowerTalon.set(0);
    		RobotMap.leftTowerTalon.set(0);
    	}
    	
    	if (!RobotMap.secondaryLowerLimitSwitch)
    	{
    		RobotMap.towerLoweringSensitivity = 0.5;
    	}
    	else
    	{
    		RobotMap.towerLoweringSensitivity = 1.0;
    	}
    	
    	if (RobotMap.driverController.getAButtonPressed())
    	{
    		if (!RobotMap.forwardsBackwardsSensitivityFlag)
    		{	
    			RobotMap.forwardsBackwardsSensitivity = 0.5;
    			RobotMap.forwardsBackwardsSensitivityFlag = true;
    		}
    		else
    		{
    			RobotMap.forwardsBackwardsSensitivity = 1.0;
    			RobotMap.forwardsBackwardsSensitivityFlag = false;
    		}
    	}
    	
    	//shiftGear method
    	if(RobotMap.assistantDriverController.getAButtonPressed())
    	{
    		if(RobotMap.shiftGearButtonFlag)
        	{
        		RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kForward);
        		System.out.println("shifting to low gear");
        		RobotMap.highGear = false;
        		RobotMap.lowGear = true;
        		RobotMap.shiftGearButtonFlag = false;
        	}
        	else
        	{
        		RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kReverse);
        		System.out.println("shifting to high gearr");
        		RobotMap.lowGear = false;
        		RobotMap.highGear = true;
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
    			RobotMap.elbowIsDown = true;
        		RobotMap.controlCubeFlag = false;
        	}
    		//cube down
        	else
        	{
        		RobotMap.elbowSolenoid.set(DoubleSolenoid.Value.kForward);
        		RobotMap.elbowIsDown = false;
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
    			RobotMap.ratchetEngaged = false;
    		}
    		else
    		{
    			RobotMap.ratchetSolenoid.set(DoubleSolenoid.Value.kReverse);
    			RobotMap.ratchetEngaged = true;
    			RobotMap.controlRatchetFlag = true;
    		}
    	}
    	
    	if(RobotMap.driverController.getAButtonPressed())
    	{
    		if(RobotMap.turnSecondCameraOn)
    		{
    			RobotMap.secondCamera.setResolution(640, 480);
    			RobotMap.secondCamera.setFPS(30);
    			RobotMap.turnSecondCameraOn = false;
    		}
    		else
    		{
    			RobotMap.secondCamera.setResolution(1, 1);
    			RobotMap.secondCamera.setFPS(1);
    			RobotMap.turnSecondCameraOn = true;
    		}
    	}
    }
    
    /**
     * Opens up the gripper
     */
    public void openGripper()
    {
    	RobotMap.grabberSolenoid.set(DoubleSolenoid.Value.kForward);
    	RobotMap.openedGripperFlag = true;
    }
    
    /**
     * Closes the gripper
     */
    public void closeGripper()
    {
    	RobotMap.grabberSolenoid.set(DoubleSolenoid.Value.kReverse);
    	RobotMap.closedGripperFlag = true;
    }
    
    /**
     * Lowers the elbow
     */
    public void dropClaw()
    {
    	RobotMap.elbowSolenoid.set(DoubleSolenoid.Value.kForward);
    	RobotMap.clawDownFlag = true;
    }
    
    /**
     * Lifts the tower up until the upper limit switch is pressed
     */
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
