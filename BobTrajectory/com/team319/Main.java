package com.team319;

import com.team254.lib.trajectory.WaypointSequence;
import com.team319.trajectory.BobPath;
import com.team319.trajectory.BobPathGenerator;
import com.team319.trajectory.SrxTranslatorConfig;
/**
 * Forked from 254's 2014 Trajectory library just a comment to make a change
 * 
 * @author Jared341
 * @author ttremblay
 */
public class Main {
	
	private static SrxTranslatorConfig standardConfig = new SrxTranslatorConfig();
	private static final double ROBOT_LENGTH = 39;
	private static String path = "src/org/usfirst/frc/team319/paths";

	public static void main(String[] args) {
		//Standard configs between all trajectories
		standardConfig.name = "StandardConfig";
		standardConfig.dt = .01;
		standardConfig.max_acc = 5;
		standardConfig.max_jerk = 60.0;
		standardConfig.max_vel = 7.0; 
		standardConfig.wheelbase_width_feet = inInches(31.5);
		standardConfig.wheel_dia_inches = 5;
		standardConfig.scale_factor = 1.39; 
		standardConfig.encoder_ticks_per_rev = 480;

		generateCenterSwitch();
		generateSameSideSwitch();
		generateSameSideScale();
		generateOppositeSideScale();
		generateBaseline();
		generateOppositeSideSwitch();
		generateConfig();
	}
	
	private static void generateCenterSwitch() {
		BobPath centerSwitch = new BobPath(standardConfig, "CenterSwitch", 1);
		centerSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH / 2), 0 + 13.5, 0));
		centerSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(120), inInches(60) + 13.5, 0));
		
		BobPathGenerator.exportPathToJavaFile(path, centerSwitch);
	}
	
	private static void generateSameSideSwitch() {
		SrxTranslatorConfig slowConfig = new SrxTranslatorConfig(standardConfig);
		slowConfig.max_vel = 5.0;
		slowConfig.max_acc = 3;
		
//		BobPath sameSideSwitch = new BobPath(standardConfig, "SameSideSwitch", 1);
//		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH), 0, 0));
//		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(140), inInches(-57), Math.toRadians(0.0)));
		
		BobPath sameSideSwitch = new BobPath(slowConfig, "SameSideSwitch", 1);
		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH / 2), 0 + 23, 0));
		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(145), inInches(10) + 23, 0));
		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(172), inInches(-18) + 23, Math.toRadians(-89)));
//		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(172), inInches(0) + 23, 0));
		
		SrxTranslatorConfig turnConfig = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 4.0;
		turnConfig.max_acc = 3;
		
		BobPath sameSideSwitchPart1point3 = new BobPath(turnConfig, "SameSideSwitchPart1point3", 1);
		sameSideSwitchPart1point3.addWaypoint(new WaypointSequence.Waypoint(inInches(0), inInches(0), Math.toRadians(0)));
		sameSideSwitchPart1point3.addWaypoint(new WaypointSequence.Waypoint(inDegrees(90), 0, 0));
		
		SrxTranslatorConfig straightConfig = new SrxTranslatorConfig(standardConfig);
		straightConfig.max_vel = 5.0;
		straightConfig.max_acc = 8;
		
		BobPath sameSideSwitchPart1point6 = new BobPath(straightConfig, "SameSideSwitchPart1point6", 1);
		sameSideSwitchPart1point6.addWaypoint(new WaypointSequence.Waypoint(inInches(172), inInches(0) + 23, Math.toRadians(90)));
		sameSideSwitchPart1point6.addWaypoint(new WaypointSequence.Waypoint(inInches(172), inInches(-18) + 23, Math.toRadians(90)));
		
		BobPath sameSideSwitchPart2 = new BobPath(turnConfig, "SameSideSwitchPart2", 1);
		sameSideSwitchPart2.addWaypoint(new WaypointSequence.Waypoint(inInches(0), inInches(0), Math.toRadians(0)));
		sameSideSwitchPart2.addWaypoint(new WaypointSequence.Waypoint(inDegrees(90), 0, 0));
		
		BobPath sameSideSwitchPart3 = new BobPath(slowConfig, "SameSideSwitchPart3", -1);
		sameSideSwitchPart3.addWaypoint(new WaypointSequence.Waypoint(inInches(172), inInches(-18) + 23, Math.toRadians(-90)));
		sameSideSwitchPart3.addWaypoint(new WaypointSequence.Waypoint(inInches(210), inInches(10) + 23, Math.toRadians(-179)));
		sameSideSwitchPart3.addWaypoint(new WaypointSequence.Waypoint(inInches(255), inInches(15) + 23, Math.toRadians(-135)));
		
		BobPath sameSideSwitchPart4 = new BobPath(straightConfig, "SameSideSwitchPart4", 1);
		sameSideSwitchPart4.addWaypoint(new WaypointSequence.Waypoint(inInches(255), inInches(15) + 23, Math.toRadians(-135)));
		sameSideSwitchPart4.addWaypoint(new WaypointSequence.Waypoint(inInches(228), inInches(-22) + 23, Math.toRadians(-135)));
		
		
		BobPathGenerator.exportPathToJavaFile(path, sameSideSwitch);
		BobPathGenerator.exportPathToJavaFile(path, sameSideSwitchPart1point3, 1);
		BobPathGenerator.exportPathToJavaFile(path, sameSideSwitchPart1point6);
		BobPathGenerator.exportPathToJavaFile(path, sameSideSwitchPart2, 1);
		BobPathGenerator.exportPathToJavaFile(path, sameSideSwitchPart3);
		BobPathGenerator.exportPathToJavaFile(path, sameSideSwitchPart4);
	}
	
	private static void generateSameSideScale() {
		SrxTranslatorConfig sameSideScaleConfig = new SrxTranslatorConfig(standardConfig);
		sameSideScaleConfig.max_vel = 3.0;
		sameSideScaleConfig.max_acc = 4;
		
		SrxTranslatorConfig firstPathConfig = new SrxTranslatorConfig(standardConfig);
		firstPathConfig.max_vel = 6;
		firstPathConfig.max_acc = 5;
		
		SrxTranslatorConfig slowConfig = new SrxTranslatorConfig(standardConfig);
		slowConfig.max_vel = 2.0;
		slowConfig.max_acc = 3;
		
		SrxTranslatorConfig turnConfig = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 4.0;
		turnConfig.max_acc = 3;
		
		SrxTranslatorConfig turnConfigFast = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 5.0;
		turnConfig.max_acc = 4;
		
		BobPath sameSideScale = new BobPath(firstPathConfig, "SameSideScale", 1);
		sameSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH / 2), 0 + 23, 0));
		sameSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(200), inInches(0) + 23, 0));
		sameSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(265), inInches(-25) + 23, Math.toRadians(-25)));
		
		BobPath sameSideScalePart2 = new BobPath(turnConfig, "SameSideScalePart2", 1);
		sameSideScalePart2.addWaypoint(0, 0, 0);
		sameSideScalePart2.addWaypoint(inDegrees(125), 0, 0);
		
		BobPath sameSideScalePart3 = new BobPath(sameSideScaleConfig, "SameSideScalePart3", 1);
		sameSideScalePart3.addWaypoint(new WaypointSequence.Waypoint(inInches(275), inInches(-15) + 23, Math.toRadians(-150)));
		sameSideScalePart3.addWaypoint(new WaypointSequence.Waypoint(inInches(234), inInches(-32) + 23, Math.toRadians(-160)));
		
		BobPath sameSideScalePart4 = new BobPath(turnConfigFast, "SameSideScalePart4", 1);
		sameSideScalePart4.addWaypoint(0, 0, 0);
		sameSideScalePart4.addWaypoint(inDegrees(160), 0, 0);
		
		BobPath sameSideScalePart5 = new BobPath(sameSideScaleConfig, "SameSideScalePart5", 1);
		sameSideScalePart5.addWaypoint(new WaypointSequence.Waypoint(inInches(234), inInches(-32) + 23, Math.toRadians(0)));
		sameSideScalePart5.addWaypoint(new WaypointSequence.Waypoint(inInches(275), inInches(-32) + 23, Math.toRadians(0)));
		
		BobPathGenerator.exportPathToJavaFile(path, sameSideScale);
		BobPathGenerator.exportPathToJavaFile(path, sameSideScalePart2, 1);
		BobPathGenerator.exportPathToJavaFile(path, sameSideScalePart3);
		BobPathGenerator.exportPathToJavaFile(path, sameSideScalePart4, -1);
		BobPathGenerator.exportPathToJavaFile(path, sameSideScalePart5);
	}
	
	private static void generateOppositeSideScale() {
		SrxTranslatorConfig oppositeSideScaleConfig = new SrxTranslatorConfig(standardConfig);
		oppositeSideScaleConfig.max_vel = 6.0;
		oppositeSideScaleConfig.max_acc = 3;
		
		BobPath oppositeSideScale = new BobPath(oppositeSideScaleConfig, "OppositeSideScale", 1);
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH / 2), 0 + 23, 0));
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(160), inInches(0) + 23, 0));
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(235), inInches(-65) + 23, Math.toRadians(-89.99)));
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(235), inInches(-145) + 23, Math.toRadians(-89.99)));
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(275), inInches(-200) + 23, Math.toRadians(0.00)));
		
		SrxTranslatorConfig turnConfig = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 4.0;
		turnConfig.max_acc = 3;
		
		BobPath oppositeSideScalePart2 = new BobPath(turnConfig, "OppositeSideScalePart2", 1);
		oppositeSideScalePart2.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		oppositeSideScalePart2.addWaypoint(new WaypointSequence.Waypoint(inDegrees(180), 0, 0));
		
		BobPath oppositeSideScalePart3 = new BobPath(turnConfig, "OppositeSideScalePart3", 1);
		oppositeSideScalePart3.addWaypoint(new WaypointSequence.Waypoint(inInches(275), inInches(-200) + 23, Math.toRadians(180)));
		oppositeSideScalePart3.addWaypoint(new WaypointSequence.Waypoint(inInches(234), inInches(-198) + 23, Math.toRadians(160)));
		
		BobPath scoreInSwitch = new BobPath(turnConfig, "ScoreInSwitch", 1);
		scoreInSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(230), inInches(-195) + 23, Math.toRadians(160)));
		scoreInSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(220), inInches(-191) + 23, Math.toRadians(160)));
		
		SrxTranslatorConfig turnConfigFast = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 5.0;
		turnConfig.max_acc = 4;
		
		BobPath oppositeSideScalePart4 = new BobPath(turnConfigFast, "OppositeSideScalePart4", 1);
		oppositeSideScalePart4.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		oppositeSideScalePart4.addWaypoint(new WaypointSequence.Waypoint(inDegrees(180), 0, 0));
		
		BobPathGenerator.exportPathToJavaFile(path, oppositeSideScale);
		BobPathGenerator.exportPathToJavaFile(path, oppositeSideScalePart2, -1);
		BobPathGenerator.exportPathToJavaFile(path, oppositeSideScalePart3);
		BobPathGenerator.exportPathToJavaFile(path, scoreInSwitch);
		BobPathGenerator.exportPathToJavaFile(path, oppositeSideScalePart4, -1);
	}
	
	private static void generateBaseline() {
		SrxTranslatorConfig oppositeSideScaleConfig = new SrxTranslatorConfig(standardConfig);
		oppositeSideScaleConfig.max_vel = 5.0;
		oppositeSideScaleConfig.max_acc = 3;
		
		BobPath baseline = new BobPath(oppositeSideScaleConfig, "Baseline", 1);
		baseline.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH / 2), 23, 0));
		baseline.addWaypoint(new WaypointSequence.Waypoint(inInches(160), inInches(0) + 23, 0));
		baseline.addWaypoint(new WaypointSequence.Waypoint(inInches(239), inInches(-65) + 23, Math.toRadians(-89.99)));
		baseline.addWaypoint(new WaypointSequence.Waypoint(inInches(239), inInches(-100) + 23, Math.toRadians(-89.99)));

		BobPathGenerator.exportPathToJavaFile(path, baseline);
	}
	
	private static void generateOppositeSideSwitch() {
		SrxTranslatorConfig oppositeSideSwitchConfig = new SrxTranslatorConfig(standardConfig);
		oppositeSideSwitchConfig.max_vel = 5.0;
		oppositeSideSwitchConfig.max_acc = 3;
		
		BobPath opposideSideSiwtch = new BobPath(oppositeSideSwitchConfig, "OppositeSideSwitch", 1);
		opposideSideSiwtch.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH / 2), 23, 0));
		opposideSideSiwtch.addWaypoint(new WaypointSequence.Waypoint(inInches(160), inInches(0) + 23, 0));
		opposideSideSiwtch.addWaypoint(new WaypointSequence.Waypoint(inInches(239), inInches(-100) + 23, Math.toRadians(-89.99)));
		opposideSideSiwtch.addWaypoint(new WaypointSequence.Waypoint(inInches(220), inInches(-150) + 23, Math.toRadians(-135)));

		BobPathGenerator.exportPathToJavaFile(path, opposideSideSiwtch);
	}
	
	private static void generateConfig() {
		SrxTranslatorConfig slowConfig = new SrxTranslatorConfig(standardConfig);
		slowConfig.max_vel = 5.0;
		slowConfig.max_acc = 3;
		
		BobPath scalingCalibration = new BobPath(standardConfig, "scaling_calibration", 1);
		scalingCalibration.addWaypoint(new WaypointSequence.Waypoint(0.0, 0.0, 0.0));
		scalingCalibration.addWaypoint(new WaypointSequence.Waypoint(5.0, 0.0, Math.toRadians(0.0)));
		
		BobPath turningCalibration = new BobPath(slowConfig, "turning_calibration", 1);
		turningCalibration.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		turningCalibration.addWaypoint(new WaypointSequence.Waypoint(4.0, 4.0, Math.toRadians(89.99)));

		BobPathGenerator.exportPathToJavaFile(path, scalingCalibration);
		BobPathGenerator.exportPathToJavaFile(path, turningCalibration);
	}
	
	private static double inInches(double inches) {
		return ((double) inches) / 12.0;
	}
	
	private static double inDegrees(double degree) {
		return inInches(90) * degree / 360.0;
	}
}
