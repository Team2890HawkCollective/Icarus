/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;

import com.ctre.phoenix.motorcontrol.can.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //Talons
  public static WPI_TalonSRX leftFrontTalon;
  public static WPI_TalonSRX rightFrontTalon;
  public static WPI_TalonSRX leftBackTalon;
  public static WPI_TalonSRX rightBackTalon;

  public static Joystick leftJoystick;
  public static Joystick rightJoystick;

  public static JoystickButton middleButtonLeft;
  public static JoystickButton middleButtonRight;

  public static DriveTrainSubsystem driveTrain;

  //Port Ids
  public static int leftFrontTalonId = 4;
  public static int rightFrontTalonId = 5;
  public static int leftBackTalonId = 3;
  public static int rightBackTalonId = 2; 

  public static int leftJoystickPort = 0;
  public static int rightJoystickPort = 1;
  public static int middleButtonPort = 1;


  public static void init()
  {
    leftFrontTalon = new WPI_TalonSRX(leftFrontTalonId);
    rightFrontTalon = new WPI_TalonSRX(rightFrontTalonId);
    rightBackTalon = new WPI_TalonSRX(rightBackTalonId);
    leftBackTalon = new WPI_TalonSRX(leftBackTalonId);

    //rightFrontTalon.setInverted(true);
    //leftFrontTalon.setInverted(true);

    leftJoystick = new Joystick(leftJoystickPort);
    rightJoystick = new Joystick(rightJoystickPort);
    middleButtonLeft = new JoystickButton(leftJoystick, middleButtonPort);
    middleButtonRight = new JoystickButton(rightJoystick, middleButtonPort);

    driveTrain = new DriveTrainSubsystem();
  }
}
