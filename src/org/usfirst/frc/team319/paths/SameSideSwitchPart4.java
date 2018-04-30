package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart4 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (21.25,24.25,-135.00)
	// (19.00,21.17,-135.00)
	
	public SameSideSwitchPart4() {
		this(false);
	}
			
    public SameSideSwitchPart4(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.014,0.289,10.000},
				{0.072,0.578,10.000},
				{0.202,1.300,10.000},
				{0.433,2.310,10.000},
				{0.794,3.608,10.000},
				{1.313,5.192,10.000},
				{2.019,7.061,10.000},
				{2.940,9.210,10.000},
				{4.104,11.637,10.000},
				{5.538,14.338,10.000},
				{7.268,17.305,10.000},
				{9.322,20.533,10.000},
				{11.723,24.014,10.000},
				{14.497,27.736,10.000},
				{17.652,31.551,10.000},
				{21.183,35.307,10.000},
				{25.083,39.001,10.000},
				{29.345,42.625,10.000},
				{33.963,46.175,10.000},
				{38.927,49.647,10.000},
				{44.231,53.035,10.000},
				{49.865,56.336,10.000},
				{55.819,59.547,10.000},
				{62.086,62.666,10.000},
				{68.655,65.690,10.000},
				{75.517,68.618,10.000},
				{82.662,71.450,10.000},
				{90.080,74.185,10.000},
				{97.763,76.825,10.000},
				{105.700,79.371,10.000},
				{113.882,81.824,10.000},
				{122.301,84.189,10.000},
				{130.948,86.468,10.000},
				{139.815,88.667,10.000},
				{148.894,90.792,10.000},
				{158.179,92.848,10.000},
				{167.663,94.844,10.000},
				{177.342,96.787,10.000},
				{187.211,98.688,10.000},
				{197.266,100.556,10.000},
				{207.507,102.403,10.000},
				{217.931,104.242,10.000},
				{228.540,106.087,10.000},
				{239.335,107.951,10.000},
				{250.320,109.850,10.000},
				{261.500,111.802,10.000},
				{272.882,113.824,10.000},
				{284.476,115.933,10.000},
				{296.290,118.149,10.000},
				{308.340,120.492,10.000},
				{320.638,122.981,10.000},
				{333.201,125.637,10.000},
				{346.049,128.479,10.000},
				{359.202,131.528,10.000},
				{372.682,134.804,10.000},
				{386.515,138.324,10.000},
				{400.726,142.108,10.000},
				{415.343,146.173,10.000},
				{430.396,150.532,10.000},
				{445.916,155.202,10.000},
				{461.936,160.193,10.000},
				{478.487,165.517,10.000},
				{495.606,171.183,10.000},
				{513.314,177.084,10.000},
				{531.625,183.105,10.000},
				{550.547,189.228,10.000},
				{570.091,195.435,10.000},
				{590.261,201.700,10.000},
				{611.061,207.998,10.000},
				{632.491,214.298,10.000},
				{654.547,220.568,10.000},
				{677.225,226.772,10.000},
				{700.512,232.876,10.000},
				{724.396,238.842,10.000},
				{748.860,244.632,10.000},
				{773.880,250.208,10.000},
				{799.430,255.493,10.000},
				{825.474,260.445,10.000},
				{851.980,265.061,10.000},
				{878.911,269.304,10.000},
				{906.224,273.134,10.000},
				{933.876,276.515,10.000},
				{961.817,279.409,10.000},
				{989.995,281.780,10.000},
				{1018.354,283.596,10.000},
				{1046.837,284.824,10.000},
				{1075.380,285.434,10.000},
				{1103.920,285.401,10.000},
				{1132.390,284.701,10.000},
				{1160.722,283.316,10.000},
				{1188.850,281.278,10.000},
				{1216.726,278.763,10.000},
				{1244.317,275.909,10.000},
				{1271.589,272.725,10.000},
				{1298.511,269.222,10.000},
				{1325.053,265.412,10.000},
				{1351.184,261.311,10.000},
				{1376.877,256.935,10.000},
				{1402.107,252.299,10.000},
				{1426.849,247.423,10.000},
				{1451.082,242.326,10.000},
				{1474.785,237.028,10.000},
				{1497.940,231.548,10.000},
				{1520.530,225.906,10.000},
				{1542.543,220.124,10.000},
				{1563.965,214.220,10.000},
				{1584.786,208.214,10.000},
				{1604.999,202.126,10.000},
				{1624.596,195.972,10.000},
				{1643.573,189.770,10.000},
				{1661.927,183.538,10.000},
				{1679.656,177.289,10.000},
				{1696.759,171.038,10.000},
				{1713.239,164.800,10.000},
				{1729.098,158.585,10.000},
				{1744.338,152.405,10.000},
				{1758.966,146.271,10.000},
				{1772.985,140.192,10.000},
				{1786.402,134.175,10.000},
				{1799.225,128.228,10.000},
				{1811.461,122.357,10.000},
				{1823.118,116.568,10.000},
				{1834.204,110.865,10.000},
				{1844.729,105.252,10.000},
				{1854.702,99.731,10.000},
				{1864.133,94.305,10.000},
				{1873.030,88.975,10.000},
				{1881.405,83.742,10.000},
				{1889.265,78.605,10.000},
				{1896.621,73.563,10.000},
				{1903.483,68.616,10.000},
				{1909.859,63.760,10.000},
				{1915.758,58.994,10.000},
				{1921.190,54.313,10.000},
				{1926.161,49.715,10.000},
				{1930.681,45.194,10.000},
				{1934.755,40.747,10.000},
				{1938.392,36.367,10.000},
				{1941.597,32.048,10.000},
				{1944.379,27.824,10.000},
				{1946.763,23.834,10.000},
				{1948.780,20.177,10.000},
				{1950.465,16.842,10.000},
				{1951.847,13.824,10.000},
				{1952.958,11.115,10.000},
				{1953.829,8.709,10.000},
				{1954.489,6.602,10.000},
				{1954.969,4.791,10.000},
				{1955.296,3.274,10.000},
				{1955.501,2.047,10.000},
				{1955.612,1.111,10.000},
				{1955.658,0.464,10.000},
				{1955.669,0.107,10.000},
				{1955.669,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.014,0.289,10.000},
				{0.072,0.578,10.000},
				{0.202,1.301,10.000},
				{0.434,2.313,10.000},
				{0.795,3.615,10.000},
				{1.316,5.210,10.000},
				{2.026,7.098,10.000},
				{2.954,9.282,10.000},
				{4.131,11.767,10.000},
				{5.587,14.557,10.000},
				{7.352,17.657,10.000},
				{9.460,21.075,10.000},
				{11.942,24.819,10.000},
				{14.831,28.897,10.000},
				{18.149,33.174,10.000},
				{21.899,37.507,10.000},
				{26.090,41.904,10.000},
				{30.727,46.371,10.000},
				{35.818,50.911,10.000},
				{41.371,55.530,10.000},
				{47.394,60.233,10.000},
				{53.896,65.022,10.000},
				{60.887,69.901,10.000},
				{68.374,74.873,10.000},
				{76.368,79.939,10.000},
				{84.878,85.102,10.000},
				{93.914,90.360,10.000},
				{103.486,95.716,10.000},
				{113.602,101.166,10.000},
				{124.273,106.712,10.000},
				{135.508,112.349,10.000},
				{147.316,118.074,10.000},
				{159.704,123.885,10.000},
				{172.682,129.777,10.000},
				{186.256,135.743,10.000},
				{200.434,141.777,10.000},
				{215.221,147.872,10.000},
				{230.623,154.019,10.000},
				{246.644,160.209,10.000},
				{263.287,166.431,10.000},
				{280.554,172.674,10.000},
				{298.447,178.926,10.000},
				{316.964,185.172,10.000},
				{336.104,191.398,10.000},
				{355.863,197.589,10.000},
				{376.236,203.728,10.000},
				{397.215,209.797,10.000},
				{418.793,215.778,10.000},
				{440.958,221.652,10.000},
				{463.698,227.400,10.000},
				{486.998,233.001,10.000},
				{510.842,238.436,10.000},
				{535.210,243.684,10.000},
				{560.083,248.725,10.000},
				{585.437,253.540,10.000},
				{611.248,258.110,10.000},
				{637.490,262.417,10.000},
				{664.134,266.443,10.000},
				{691.151,270.174,10.000},
				{718.511,273.595,10.000},
				{746.180,276.694,10.000},
				{774.126,279.460,10.000},
				{802.315,281.886,10.000},
				{830.693,283.786,10.000},
				{859.192,284.989,10.000},
				{887.743,285.512,10.000},
				{916.281,285.373,10.000},
				{944.740,284.597,10.000},
				{973.062,283.212,10.000},
				{1001.186,281.246,10.000},
				{1029.060,278.733,10.000},
				{1056.630,275.707,10.000},
				{1083.851,272.204,10.000},
				{1110.677,268.261,10.000},
				{1137.068,263.915,10.000},
				{1162.989,259.206,10.000},
				{1188.402,254.134,10.000},
				{1213.276,248.742,10.000},
				{1237.587,243.107,10.000},
				{1261.314,237.268,10.000},
				{1284.440,231.263,10.000},
				{1306.953,225.131,10.000},
				{1328.844,218.907,10.000},
				{1350.107,212.627,10.000},
				{1370.739,206.325,10.000},
				{1390.743,200.034,10.000},
				{1410.121,193.782,10.000},
				{1428.880,187.595,10.000},
				{1447.030,181.498,10.000},
				{1464.581,175.508,10.000},
				{1481.548,169.668,10.000},
				{1497.957,164.092,10.000},
				{1513.842,158.856,10.000},
				{1529.237,153.949,10.000},
				{1544.174,149.362,10.000},
				{1558.682,145.081,10.000},
				{1572.791,141.091,10.000},
				{1586.529,137.378,10.000},
				{1599.921,133.923,10.000},
				{1612.992,130.708,10.000},
				{1625.763,127.714,10.000},
				{1638.255,124.922,10.000},
				{1650.486,122.312,10.000},
				{1662.473,119.863,10.000},
				{1674.228,117.555,10.000},
				{1685.765,115.368,10.000},
				{1697.093,113.284,10.000},
				{1708.222,111.282,10.000},
				{1719.156,109.345,10.000},
				{1729.902,107.456,10.000},
				{1740.462,105.599,10.000},
				{1750.837,103.757,10.000},
				{1761.029,101.917,10.000},
				{1771.036,100.065,10.000},
				{1780.854,98.189,10.000},
				{1790.482,96.278,10.000},
				{1799.914,94.322,10.000},
				{1809.146,92.311,10.000},
				{1818.169,90.238,10.000},
				{1826.979,88.094,10.000},
				{1835.566,85.874,10.000},
				{1843.923,83.573,10.000},
				{1852.042,81.185,10.000},
				{1859.913,78.708,10.000},
				{1867.527,76.138,10.000},
				{1874.874,73.473,10.000},
				{1881.945,70.713,10.000},
				{1888.731,67.856,10.000},
				{1895.221,64.902,10.000},
				{1901.406,61.853,10.000},
				{1907.277,58.710,10.000},
				{1912.825,55.475,10.000},
				{1918.040,52.151,10.000},
				{1922.914,48.741,10.000},
				{1927.439,45.249,10.000},
				{1931.607,41.679,10.000},
				{1935.411,38.036,10.000},
				{1938.843,34.326,10.000},
				{1941.898,30.553,10.000},
				{1944.575,26.763,10.000},
				{1946.885,23.103,10.000},
				{1948.854,19.688,10.000},
				{1950.507,16.528,10.000},
				{1951.870,13.630,10.000},
				{1952.970,11.001,10.000},
				{1953.835,8.647,10.000},
				{1954.492,6.571,10.000},
				{1954.969,4.777,10.000},
				{1955.296,3.268,10.000},
				{1955.501,2.045,10.000},
				{1955.612,1.111,10.000},
				{1955.658,0.464,10.000},
				{1955.669,0.107,10.000},
				{1955.669,0.000,10.000}
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