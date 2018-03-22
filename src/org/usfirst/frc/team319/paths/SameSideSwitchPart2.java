package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart2 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (1.88,0.00,0.00)
	
	public SameSideSwitchPart2() {
		this(false);
	}
			
    public SameSideSwitchPart2(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.015,0.304,10.000},
				{0.076,0.608,10.000},
				{0.213,1.369,10.000},
				{0.456,2.434,10.000},
				{0.837,3.803,10.000},
				{1.369,5.324,10.000},
				{2.053,6.845,10.000},
				{2.890,8.366,10.000},
				{3.879,9.887,10.000},
				{5.020,11.408,10.000},
				{6.313,12.929,10.000},
				{7.758,14.450,10.000},
				{9.355,15.972,10.000},
				{11.104,17.493,10.000},
				{13.005,19.014,10.000},
				{15.059,20.535,10.000},
				{17.264,22.056,10.000},
				{19.622,23.577,10.000},
				{22.132,25.098,10.000},
				{24.794,26.619,10.000},
				{27.608,28.140,10.000},
				{30.574,29.661,10.000},
				{33.692,31.182,10.000},
				{36.963,32.704,10.000},
				{40.385,34.225,10.000},
				{43.960,35.746,10.000},
				{47.686,37.267,10.000},
				{51.565,38.788,10.000},
				{55.596,40.309,10.000},
				{59.779,41.830,10.000},
				{64.114,43.351,10.000},
				{68.601,44.872,10.000},
				{73.241,46.393,10.000},
				{78.032,47.915,10.000},
				{82.976,49.436,10.000},
				{88.071,50.957,10.000},
				{93.319,52.478,10.000},
				{98.719,53.999,10.000},
				{104.271,55.520,10.000},
				{109.975,57.041,10.000},
				{115.831,58.562,10.000},
				{121.840,60.083,10.000},
				{128.000,61.604,10.000},
				{134.313,63.125,10.000},
				{140.777,64.647,10.000},
				{147.394,66.168,10.000},
				{154.163,67.689,10.000},
				{161.084,69.210,10.000},
				{168.157,70.731,10.000},
				{175.382,72.252,10.000},
				{182.760,73.773,10.000},
				{190.289,75.294,10.000},
				{197.971,76.815,10.000},
				{205.804,78.336,10.000},
				{213.790,79.858,10.000},
				{221.928,81.379,10.000},
				{230.218,82.900,10.000},
				{238.660,84.421,10.000},
				{247.254,85.942,10.000},
				{256.000,87.463,10.000},
				{264.899,88.984,10.000},
				{273.949,90.505,10.000},
				{283.152,92.026,10.000},
				{292.507,93.547,10.000},
				{302.014,95.069,10.000},
				{311.673,96.590,10.000},
				{321.484,98.111,10.000},
				{331.447,99.632,10.000},
				{341.562,101.153,10.000},
				{351.830,102.674,10.000},
				{362.249,104.195,10.000},
				{372.821,105.716,10.000},
				{383.544,107.237,10.000},
				{394.420,108.758,10.000},
				{405.448,110.279,10.000},
				{416.628,111.801,10.000},
				{427.960,113.322,10.000},
				{439.429,114.691,10.000},
				{451.005,115.755,10.000},
				{462.657,116.516,10.000},
				{474.354,116.972,10.000},
				{486.060,117.063,10.000},
				{497.739,116.788,10.000},
				{509.360,116.209,10.000},
				{520.892,115.326,10.000},
				{532.306,114.138,10.000},
				{543.577,112.708,10.000},
				{554.696,111.187,10.000},
				{565.662,109.666,10.000},
				{576.477,108.145,10.000},
				{587.139,106.623,10.000},
				{597.649,105.102,10.000},
				{608.007,103.581,10.000},
				{618.213,102.060,10.000},
				{628.267,100.539,10.000},
				{638.169,99.018,10.000},
				{647.919,97.497,10.000},
				{657.516,95.976,10.000},
				{666.962,94.455,10.000},
				{676.255,92.934,10.000},
				{685.396,91.412,10.000},
				{694.386,89.891,10.000},
				{703.223,88.370,10.000},
				{711.908,86.849,10.000},
				{720.440,85.328,10.000},
				{728.821,83.807,10.000},
				{737.050,82.286,10.000},
				{745.126,80.765,10.000},
				{753.050,79.244,10.000},
				{760.823,77.723,10.000},
				{768.443,76.202,10.000},
				{775.911,74.680,10.000},
				{783.227,73.159,10.000},
				{790.391,71.638,10.000},
				{797.402,70.117,10.000},
				{804.262,68.596,10.000},
				{810.970,67.075,10.000},
				{817.525,65.554,10.000},
				{823.928,64.033,10.000},
				{830.179,62.512,10.000},
				{836.278,60.991,10.000},
				{842.225,59.469,10.000},
				{848.020,57.948,10.000},
				{853.663,56.427,10.000},
				{859.154,54.906,10.000},
				{864.492,53.385,10.000},
				{869.678,51.864,10.000},
				{874.713,50.343,10.000},
				{879.595,48.822,10.000},
				{884.325,47.301,10.000},
				{888.903,45.780,10.000},
				{893.329,44.259,10.000},
				{897.603,42.737,10.000},
				{901.724,41.216,10.000},
				{905.694,39.695,10.000},
				{909.511,38.174,10.000},
				{913.176,36.653,10.000},
				{916.690,35.132,10.000},
				{920.051,33.611,10.000},
				{923.260,32.090,10.000},
				{926.317,30.569,10.000},
				{929.221,29.048,10.000},
				{931.974,27.526,10.000},
				{934.574,26.005,10.000},
				{937.023,24.484,10.000},
				{939.319,22.963,10.000},
				{941.463,21.442,10.000},
				{943.456,19.921,10.000},
				{945.295,18.400,10.000},
				{946.983,16.879,10.000},
				{948.519,15.358,10.000},
				{949.903,13.837,10.000},
				{951.134,12.315,10.000},
				{952.214,10.794,10.000},
				{953.141,9.273,10.000},
				{953.916,7.752,10.000},
				{954.539,6.231,10.000},
				{955.010,4.710,10.000},
				{955.335,3.250,10.000},
				{955.536,2.004,10.000},
				{955.642,1.062,10.000},
				{955.685,0.424,10.000},
				{955.694,0.091,10.000},
				{955.694,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.015,-0.304,10.000},
				{-0.076,-0.608,10.000},
				{-0.213,-1.369,10.000},
				{-0.456,-2.434,10.000},
				{-0.837,-3.803,10.000},
				{-1.369,-5.324,10.000},
				{-2.053,-6.845,10.000},
				{-2.890,-8.366,10.000},
				{-3.879,-9.887,10.000},
				{-5.020,-11.408,10.000},
				{-6.313,-12.929,10.000},
				{-7.758,-14.450,10.000},
				{-9.355,-15.972,10.000},
				{-11.104,-17.493,10.000},
				{-13.005,-19.014,10.000},
				{-15.059,-20.535,10.000},
				{-17.264,-22.056,10.000},
				{-19.622,-23.577,10.000},
				{-22.132,-25.098,10.000},
				{-24.794,-26.619,10.000},
				{-27.608,-28.140,10.000},
				{-30.574,-29.661,10.000},
				{-33.692,-31.182,10.000},
				{-36.963,-32.704,10.000},
				{-40.385,-34.225,10.000},
				{-43.960,-35.746,10.000},
				{-47.686,-37.267,10.000},
				{-51.565,-38.788,10.000},
				{-55.596,-40.309,10.000},
				{-59.779,-41.830,10.000},
				{-64.114,-43.351,10.000},
				{-68.601,-44.872,10.000},
				{-73.241,-46.393,10.000},
				{-78.032,-47.915,10.000},
				{-82.976,-49.436,10.000},
				{-88.071,-50.957,10.000},
				{-93.319,-52.478,10.000},
				{-98.719,-53.999,10.000},
				{-104.271,-55.520,10.000},
				{-109.975,-57.041,10.000},
				{-115.831,-58.562,10.000},
				{-121.840,-60.083,10.000},
				{-128.000,-61.604,10.000},
				{-134.313,-63.125,10.000},
				{-140.777,-64.647,10.000},
				{-147.394,-66.168,10.000},
				{-154.163,-67.689,10.000},
				{-161.084,-69.210,10.000},
				{-168.157,-70.731,10.000},
				{-175.382,-72.252,10.000},
				{-182.760,-73.773,10.000},
				{-190.289,-75.294,10.000},
				{-197.971,-76.815,10.000},
				{-205.804,-78.336,10.000},
				{-213.790,-79.858,10.000},
				{-221.928,-81.379,10.000},
				{-230.218,-82.900,10.000},
				{-238.660,-84.421,10.000},
				{-247.254,-85.942,10.000},
				{-256.000,-87.463,10.000},
				{-264.899,-88.984,10.000},
				{-273.949,-90.505,10.000},
				{-283.152,-92.026,10.000},
				{-292.507,-93.547,10.000},
				{-302.014,-95.069,10.000},
				{-311.673,-96.590,10.000},
				{-321.484,-98.111,10.000},
				{-331.447,-99.632,10.000},
				{-341.562,-101.153,10.000},
				{-351.830,-102.674,10.000},
				{-362.249,-104.195,10.000},
				{-372.821,-105.716,10.000},
				{-383.544,-107.237,10.000},
				{-394.420,-108.758,10.000},
				{-405.448,-110.279,10.000},
				{-416.628,-111.801,10.000},
				{-427.960,-113.322,10.000},
				{-439.429,-114.691,10.000},
				{-451.005,-115.755,10.000},
				{-462.657,-116.516,10.000},
				{-474.354,-116.972,10.000},
				{-486.060,-117.063,10.000},
				{-497.739,-116.788,10.000},
				{-509.360,-116.209,10.000},
				{-520.892,-115.326,10.000},
				{-532.306,-114.138,10.000},
				{-543.577,-112.708,10.000},
				{-554.696,-111.187,10.000},
				{-565.662,-109.666,10.000},
				{-576.477,-108.145,10.000},
				{-587.139,-106.623,10.000},
				{-597.649,-105.102,10.000},
				{-608.007,-103.581,10.000},
				{-618.213,-102.060,10.000},
				{-628.267,-100.539,10.000},
				{-638.169,-99.018,10.000},
				{-647.919,-97.497,10.000},
				{-657.516,-95.976,10.000},
				{-666.962,-94.455,10.000},
				{-676.255,-92.934,10.000},
				{-685.396,-91.412,10.000},
				{-694.386,-89.891,10.000},
				{-703.223,-88.370,10.000},
				{-711.908,-86.849,10.000},
				{-720.440,-85.328,10.000},
				{-728.821,-83.807,10.000},
				{-737.050,-82.286,10.000},
				{-745.126,-80.765,10.000},
				{-753.050,-79.244,10.000},
				{-760.823,-77.723,10.000},
				{-768.443,-76.202,10.000},
				{-775.911,-74.680,10.000},
				{-783.227,-73.159,10.000},
				{-790.391,-71.638,10.000},
				{-797.402,-70.117,10.000},
				{-804.262,-68.596,10.000},
				{-810.970,-67.075,10.000},
				{-817.525,-65.554,10.000},
				{-823.928,-64.033,10.000},
				{-830.179,-62.512,10.000},
				{-836.278,-60.991,10.000},
				{-842.225,-59.469,10.000},
				{-848.020,-57.948,10.000},
				{-853.663,-56.427,10.000},
				{-859.154,-54.906,10.000},
				{-864.492,-53.385,10.000},
				{-869.678,-51.864,10.000},
				{-874.713,-50.343,10.000},
				{-879.595,-48.822,10.000},
				{-884.325,-47.301,10.000},
				{-888.903,-45.780,10.000},
				{-893.329,-44.259,10.000},
				{-897.603,-42.737,10.000},
				{-901.724,-41.216,10.000},
				{-905.694,-39.695,10.000},
				{-909.511,-38.174,10.000},
				{-913.176,-36.653,10.000},
				{-916.690,-35.132,10.000},
				{-920.051,-33.611,10.000},
				{-923.260,-32.090,10.000},
				{-926.317,-30.569,10.000},
				{-929.221,-29.048,10.000},
				{-931.974,-27.526,10.000},
				{-934.574,-26.005,10.000},
				{-937.023,-24.484,10.000},
				{-939.319,-22.963,10.000},
				{-941.463,-21.442,10.000},
				{-943.456,-19.921,10.000},
				{-945.295,-18.400,10.000},
				{-946.983,-16.879,10.000},
				{-948.519,-15.358,10.000},
				{-949.903,-13.837,10.000},
				{-951.134,-12.315,10.000},
				{-952.214,-10.794,10.000},
				{-953.141,-9.273,10.000},
				{-953.916,-7.752,10.000},
				{-954.539,-6.231,10.000},
				{-955.010,-4.710,10.000},
				{-955.335,-3.250,10.000},
				{-955.536,-2.004,10.000},
				{-955.642,-1.062,10.000},
				{-955.685,-0.424,10.000},
				{-955.694,-0.091,10.000},
				{-955.694,-0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}