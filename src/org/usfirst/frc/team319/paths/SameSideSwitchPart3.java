package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (14.33,21.50,-90.00)
	// (17.50,23.83,-179.00)
	// (21.25,24.25,-135.00)
	
	public SameSideSwitchPart3() {
		this(false);
	}
			
    public SameSideSwitchPart3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.015,-0.305,10.000},
				{-0.076,-0.610,10.000},
				{-0.214,-1.373,10.000},
				{-0.458,-2.441,10.000},
				{-0.839,-3.814,10.000},
				{-1.373,-5.337,10.000},
				{-2.059,-6.860,10.000},
				{-2.897,-8.380,10.000},
				{-3.886,-9.897,10.000},
				{-5.028,-11.412,10.000},
				{-6.320,-12.923,10.000},
				{-7.763,-14.431,10.000},
				{-9.356,-15.934,10.000},
				{-11.100,-17.432,10.000},
				{-12.992,-18.926,10.000},
				{-15.034,-20.413,10.000},
				{-17.223,-21.895,10.000},
				{-19.560,-23.370,10.000},
				{-22.044,-24.839,10.000},
				{-24.674,-26.300,10.000},
				{-27.449,-27.753,10.000},
				{-30.369,-29.199,10.000},
				{-33.433,-30.635,10.000},
				{-36.639,-32.064,10.000},
				{-39.987,-33.482,10.000},
				{-43.476,-34.891,10.000},
				{-47.105,-36.290,10.000},
				{-50.873,-37.679,10.000},
				{-54.779,-39.057,10.000},
				{-58.821,-40.423,10.000},
				{-62.999,-41.778,10.000},
				{-67.311,-43.121,10.000},
				{-71.756,-44.451,10.000},
				{-76.333,-45.769,10.000},
				{-81.041,-47.073,10.000},
				{-85.877,-48.364,10.000},
				{-90.841,-49.641,10.000},
				{-95.931,-50.903,10.000},
				{-101.147,-52.150,10.000},
				{-106.485,-53.382,10.000},
				{-111.945,-54.598,10.000},
				{-117.524,-55.798,10.000},
				{-123.222,-56.980,10.000},
				{-129.037,-58.146,10.000},
				{-134.966,-59.293,10.000},
				{-141.008,-60.422,10.000},
				{-147.162,-61.532,10.000},
				{-153.424,-62.621,10.000},
				{-159.793,-63.691,10.000},
				{-166.267,-64.739,10.000},
				{-172.843,-65.765,10.000},
				{-179.520,-66.769,10.000},
				{-186.295,-67.749,10.000},
				{-193.165,-68.704,10.000},
				{-200.129,-69.634,10.000},
				{-207.182,-70.537,10.000},
				{-214.324,-71.413,10.000},
				{-221.550,-72.261,10.000},
				{-228.858,-73.078,10.000},
				{-236.244,-73.864,10.000},
				{-243.706,-74.617,10.000},
				{-251.239,-75.337,10.000},
				{-258.841,-76.020,10.000},
				{-266.508,-76.666,10.000},
				{-274.235,-77.273,10.000},
				{-282.019,-77.839,10.000},
				{-289.855,-78.361,10.000},
				{-297.739,-78.837,10.000},
				{-305.666,-79.265,10.000},
				{-313.630,-79.643,10.000},
				{-321.627,-79.967,10.000},
				{-329.650,-80.235,10.000},
				{-337.694,-80.443,10.000},
				{-345.753,-80.588,10.000},
				{-353.820,-80.666,10.000},
				{-361.887,-80.673,10.000},
				{-369.948,-80.605,10.000},
				{-377.993,-80.458,10.000},
				{-386.016,-80.226,10.000},
				{-394.006,-79.904,10.000},
				{-401.955,-79.487,10.000},
				{-409.852,-78.969,10.000},
				{-417.686,-78.342,10.000},
				{-425.446,-77.601,10.000},
				{-433.120,-76.737,10.000},
				{-440.694,-75.744,10.000},
				{-448.156,-74.612,10.000},
				{-455.489,-73.333,10.000},
				{-462.679,-71.897,10.000},
				{-469.708,-70.295,10.000},
				{-476.560,-68.516,10.000},
				{-483.215,-66.549,10.000},
				{-489.653,-64.384,10.000},
				{-495.854,-62.008,10.000},
				{-501.795,-59.411,10.000},
				{-507.453,-56.580,10.000},
				{-512.803,-53.505,10.000},
				{-517.821,-50.174,10.000},
				{-522.479,-46.579,10.000},
				{-526.750,-42.709,10.000},
				{-530.606,-38.560,10.000},
				{-534.018,-34.127,10.000},
				{-536.959,-29.411,10.000},
				{-539.401,-24.416,10.000},
				{-541.316,-19.152,10.000},
				{-542.680,-13.638,10.000},
				{-543.470,-7.898,10.000},
				{-543.667,-1.970,10.000},
				{-544.077,-4.099,10.000},
				{-545.101,-10.248,10.000},
				{-546.742,-16.403,10.000},
				{-548.989,-22.474,10.000},
				{-551.825,-28.359,10.000},
				{-555.219,-33.941,10.000},
				{-559.129,-39.093,10.000},
				{-563.497,-43.680,10.000},
				{-568.253,-47.567,10.000},
				{-573.315,-50.621,10.000},
				{-578.587,-52.720,10.000},
				{-583.964,-53.761,10.000},
				{-589.330,-53.664,10.000},
				{-594.568,-52.379,10.000},
				{-599.557,-49.891,10.000},
				{-604.179,-46.217,10.000},
				{-608.320,-41.409,10.000},
				{-611.874,-35.547,10.000},
				{-614.748,-28.736,10.000},
				{-616.858,-21.097,10.000},
				{-618.134,-12.764,10.000},
				{-618.521,-3.871,10.000},
				{-619.066,-5.448,10.000},
				{-620.573,-15.069,10.000},
				{-623.060,-24.875,10.000},
				{-626.537,-34.767,10.000},
				{-631.003,-44.656,10.000},
				{-636.450,-54.471,10.000},
				{-642.865,-64.153,10.000},
				{-650.230,-73.654,10.000},
				{-658.525,-82.942,10.000},
				{-667.724,-91.991,10.000},
				{-677.802,-100.785,10.000},
				{-688.734,-109.315,10.000},
				{-700.491,-117.576,10.000},
				{-713.048,-125.571,10.000},
				{-726.379,-133.302,10.000},
				{-740.456,-140.778,10.000},
				{-755.257,-148.006,10.000},
				{-770.757,-154.997,10.000},
				{-786.933,-161.760,10.000},
				{-803.763,-168.308,10.000},
				{-821.229,-174.650,10.000},
				{-839.308,-180.798,10.000},
				{-857.984,-186.762,10.000},
				{-877.240,-192.550,10.000},
				{-897.057,-198.172,10.000},
				{-917.420,-203.635,10.000},
				{-938.315,-208.946,10.000},
				{-959.726,-214.110,10.000},
				{-981.639,-219.131,10.000},
				{-1004.040,-224.011,10.000},
				{-1026.915,-228.753,10.000},
				{-1050.251,-233.355,10.000},
				{-1074.032,-237.815,10.000},
				{-1098.245,-242.130,10.000},
				{-1122.875,-246.293,10.000},
				{-1147.904,-250.297,10.000},
				{-1173.317,-254.131,10.000},
				{-1199.080,-257.626,10.000},
				{-1225.141,-260.605,10.000},
				{-1251.445,-263.045,10.000},
				{-1277.937,-264.921,10.000},
				{-1304.558,-266.210,10.000},
				{-1331.263,-267.052,10.000},
				{-1358.022,-267.588,10.000},
				{-1384.802,-267.802,10.000},
				{-1411.570,-267.674,10.000},
				{-1438.288,-267.187,10.000},
				{-1464.920,-266.321,10.000},
				{-1491.411,-264.901,10.000},
				{-1517.687,-262.760,10.000},
				{-1543.676,-259.892,10.000},
				{-1569.306,-256.303,10.000},
				{-1594.480,-251.741,10.000},
				{-1618.263,-237.830,10.000},
				{-1640.360,-220.969,10.000},
				{-1660.959,-205.989,10.000},
				{-1680.240,-192.806,10.000},
				{-1698.373,-181.337,10.000},
				{-1715.523,-171.494,10.000},
				{-1731.842,-163.188,10.000},
				{-1747.474,-156.325,10.000},
				{-1762.555,-150.810,10.000},
				{-1777.209,-146.544,10.000},
				{-1791.552,-143.427,10.000},
				{-1805.688,-141.354,10.000},
				{-1819.710,-140.225,10.000},
				{-1833.704,-139.936,10.000},
				{-1847.742,-140.388,10.000},
				{-1861.891,-141.487,10.000},
				{-1876.206,-143.144,10.000},
				{-1890.733,-145.275,10.000},
				{-1905.513,-147.803,10.000},
				{-1920.580,-150.661,10.000},
				{-1935.958,-153.787,10.000},
				{-1951.671,-157.127,10.000},
				{-1967.734,-160.635,10.000},
				{-1984.161,-164.271,10.000},
				{-2000.962,-168.003,10.000},
				{-2018.142,-171.803,10.000},
				{-2035.707,-175.650,10.000},
				{-2053.660,-179.525,10.000},
				{-2072.001,-183.416,10.000},
				{-2090.732,-187.312,10.000},
				{-2109.853,-191.206,10.000},
				{-2129.362,-195.094,10.000},
				{-2149.260,-198.973,10.000},
				{-2169.544,-202.842,10.000},
				{-2190.214,-206.701,10.000},
				{-2211.269,-210.550,10.000},
				{-2232.708,-214.392,10.000},
				{-2254.531,-218.227,10.000},
				{-2276.737,-222.057,10.000},
				{-2299.325,-225.882,10.000},
				{-2322.295,-229.705,10.000},
				{-2345.648,-233.523,10.000},
				{-2369.381,-237.335,10.000},
				{-2393.495,-241.139,10.000},
				{-2417.988,-244.930,10.000},
				{-2442.858,-248.702,10.000},
				{-2468.103,-252.447,10.000},
				{-2493.718,-256.155,10.000},
				{-2519.700,-259.813,10.000},
				{-2546.040,-263.405,10.000},
				{-2572.732,-266.916,10.000},
				{-2599.764,-270.324,10.000},
				{-2627.125,-273.608,10.000},
				{-2654.799,-276.743,10.000},
				{-2682.770,-279.703,10.000},
				{-2711.015,-282.460,10.000},
				{-2739.514,-284.984,10.000},
				{-2768.239,-287.247,10.000},
				{-2797.160,-289.219,10.000},
				{-2826.248,-290.871,10.000},
				{-2855.465,-292.176,10.000},
				{-2884.776,-293.109,10.000},
				{-2914.141,-293.650,10.000},
				{-2943.519,-293.781,10.000},
				{-2972.868,-293.489,10.000},
				{-3002.145,-292.768,10.000},
				{-3031.306,-291.614,10.000},
				{-3060.309,-290.032,10.000},
				{-3089.112,-288.030,10.000},
				{-3117.675,-285.622,10.000},
				{-3145.957,-282.828,10.000},
				{-3173.924,-279.670,10.000},
				{-3201.542,-276.176,10.000},
				{-3228.780,-272.375,10.000},
				{-3255.609,-268.298,10.000},
				{-3282.007,-263.978,10.000},
				{-3307.952,-259.448,10.000},
				{-3333.426,-254.740,10.000},
				{-3358.415,-249.885,10.000},
				{-3382.906,-244.915,10.000},
				{-3406.892,-239.858,10.000},
				{-3430.366,-234.740,10.000},
				{-3453.324,-229.585,10.000},
				{-3475.766,-224.416,10.000},
				{-3497.691,-219.251,10.000},
				{-3519.102,-214.108,10.000},
				{-3540.002,-209.002,10.000},
				{-3560.397,-203.944,10.000},
				{-3580.291,-198.947,10.000},
				{-3599.693,-194.018,10.000},
				{-3618.610,-189.165,10.000},
				{-3637.049,-184.394,10.000},
				{-3655.020,-179.708,10.000},
				{-3672.531,-175.111,10.000},
				{-3689.592,-170.605,10.000},
				{-3706.211,-166.192,10.000},
				{-3722.398,-161.872,10.000},
				{-3738.162,-157.644,10.000},
				{-3753.513,-153.508,10.000},
				{-3768.459,-149.463,10.000},
				{-3783.010,-145.508,10.000},
				{-3797.174,-141.641,10.000},
				{-3810.960,-137.860,10.000},
				{-3824.377,-134.164,10.000},
				{-3837.432,-130.548,10.000},
				{-3850.133,-127.013,10.000},
				{-3862.488,-123.555,10.000},
				{-3874.506,-120.172,10.000},
				{-3886.192,-116.862,10.000},
				{-3897.554,-113.622,10.000},
				{-3908.599,-110.450,10.000},
				{-3919.333,-107.345,10.000},
				{-3929.764,-104.303,10.000},
				{-3939.896,-101.323,10.000},
				{-3949.736,-98.403,10.000},
				{-3959.290,-95.541,10.000},
				{-3968.564,-92.735,10.000},
				{-3977.562,-89.983,10.000},
				{-3986.291,-87.284,10.000},
				{-3994.754,-84.636,10.000},
				{-4002.958,-82.037,10.000},
				{-4010.907,-79.486,10.000},
				{-4018.605,-76.982,10.000},
				{-4026.057,-74.522,10.000},
				{-4033.268,-72.107,10.000},
				{-4040.241,-69.733,10.000},
				{-4046.981,-67.401,10.000},
				{-4053.492,-65.110,10.000},
				{-4059.778,-62.857,10.000},
				{-4065.842,-60.642,10.000},
				{-4071.688,-58.463,10.000},
				{-4077.320,-56.321,10.000},
				{-4082.742,-54.213,10.000},
				{-4087.956,-52.139,10.000},
				{-4092.965,-50.098,10.000},
				{-4097.774,-48.089,10.000},
				{-4102.385,-46.111,10.000},
				{-4106.802,-44.163,10.000},
				{-4111.026,-42.243,10.000},
				{-4115.061,-40.352,10.000},
				{-4118.910,-38.488,10.000},
				{-4122.575,-36.650,10.000},
				{-4126.059,-34.838,10.000},
				{-4129.364,-33.050,10.000},
				{-4132.492,-31.285,10.000},
				{-4135.446,-29.542,10.000},
				{-4138.229,-27.821,10.000},
				{-4140.841,-26.120,10.000},
				{-4143.284,-24.439,10.000},
				{-4145.562,-22.776,10.000},
				{-4147.675,-21.130,10.000},
				{-4149.625,-19.500,10.000},
				{-4151.413,-17.885,10.000},
				{-4153.042,-16.284,10.000},
				{-4154.511,-14.696,10.000},
				{-4155.823,-13.119,10.000},
				{-4156.979,-11.553,10.000},
				{-4157.978,-9.996,10.000},
				{-4158.823,-8.447,10.000},
				{-4159.513,-6.904,10.000},
				{-4160.050,-5.368,10.000},
				{-4160.434,-3.836,10.000},
				{-4160.679,-2.458,10.000},
				{-4160.818,-1.385,10.000},
				{-4160.880,-0.618,10.000},
				{-4160.895,-0.157,10.000},
				{-4160.896,-0.002,10.000},
				{-4160.896,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.015,-0.305,10.000},
				{-0.076,-0.610,10.000},
				{-0.214,-1.374,10.000},
				{-0.458,-2.442,10.000},
				{-0.840,-3.817,10.000},
				{-1.374,-5.345,10.000},
				{-2.062,-6.875,10.000},
				{-2.902,-8.407,10.000},
				{-3.896,-9.941,10.000},
				{-5.044,-11.479,10.000},
				{-6.346,-13.020,10.000},
				{-7.803,-14.564,10.000},
				{-9.414,-16.113,10.000},
				{-11.181,-17.667,10.000},
				{-13.103,-19.226,10.000},
				{-15.182,-20.790,10.000},
				{-17.418,-22.361,10.000},
				{-19.812,-23.938,10.000},
				{-22.364,-25.521,10.000},
				{-25.075,-27.112,10.000},
				{-27.947,-28.711,10.000},
				{-30.978,-30.318,10.000},
				{-34.172,-31.933,10.000},
				{-37.527,-33.557,10.000},
				{-41.046,-35.190,10.000},
				{-44.730,-36.833,10.000},
				{-48.578,-38.486,10.000},
				{-52.593,-40.150,10.000},
				{-56.776,-41.824,10.000},
				{-61.127,-43.510,10.000},
				{-65.647,-45.207,10.000},
				{-70.339,-46.916,10.000},
				{-75.203,-48.638,10.000},
				{-80.240,-50.373,10.000},
				{-85.452,-52.120,10.000},
				{-90.840,-53.882,10.000},
				{-96.406,-55.657,10.000},
				{-102.151,-57.447,10.000},
				{-108.076,-59.252,10.000},
				{-114.183,-61.072,10.000},
				{-120.474,-62.908,10.000},
				{-126.950,-64.761,10.000},
				{-133.613,-66.630,10.000},
				{-140.465,-68.517,10.000},
				{-147.507,-70.422,10.000},
				{-154.742,-72.345,10.000},
				{-162.170,-74.288,10.000},
				{-169.795,-76.250,10.000},
				{-177.619,-78.233,10.000},
				{-185.642,-80.237,10.000},
				{-193.868,-82.262,10.000},
				{-202.300,-84.311,10.000},
				{-210.938,-86.383,10.000},
				{-219.786,-88.480,10.000},
				{-228.846,-90.602,10.000},
				{-238.121,-92.751,10.000},
				{-247.614,-94.927,10.000},
				{-257.327,-97.132,10.000},
				{-267.264,-99.367,10.000},
				{-277.427,-101.633,10.000},
				{-287.820,-103.931,10.000},
				{-298.446,-106.264,10.000},
				{-309.310,-108.633,10.000},
				{-320.414,-111.039,10.000},
				{-331.762,-113.484,10.000},
				{-343.359,-115.971,10.000},
				{-355.209,-118.501,10.000},
				{-367.317,-121.076,10.000},
				{-379.687,-123.700,10.000},
				{-392.324,-126.375,10.000},
				{-405.235,-129.103,10.000},
				{-418.423,-131.887,10.000},
				{-431.896,-134.731,10.000},
				{-445.660,-137.638,10.000},
				{-459.721,-140.612,10.000},
				{-474.087,-143.657,10.000},
				{-488.765,-146.777,10.000},
				{-503.763,-149.976,10.000},
				{-519.089,-153.260,10.000},
				{-534.752,-156.634,10.000},
				{-550.762,-160.103,10.000},
				{-567.130,-163.674,10.000},
				{-583.865,-167.353,10.000},
				{-600.980,-171.146,10.000},
				{-618.486,-175.062,10.000},
				{-636.396,-179.107,10.000},
				{-654.726,-183.291,10.000},
				{-673.488,-187.622,10.000},
				{-692.699,-192.110,10.000},
				{-712.375,-196.764,10.000},
				{-732.535,-201.595,10.000},
				{-753.196,-206.614,10.000},
				{-774.379,-211.831,10.000},
				{-796.105,-217.259,10.000},
				{-818.396,-222.908,10.000},
				{-841.275,-228.791,10.000},
				{-864.767,-234.918,10.000},
				{-888.897,-241.300,10.000},
				{-913.692,-247.948,10.000},
				{-939.179,-254.869,10.000},
				{-965.386,-262.070,10.000},
				{-992.341,-269.554,10.000},
				{-1020.073,-277.322,10.000},
				{-1048.610,-285.369,10.000},
				{-1077.978,-293.684,10.000},
				{-1108.203,-302.250,10.000},
				{-1139.308,-311.041,10.000},
				{-1171.310,-320.021,10.000},
				{-1204.224,-329.141,10.000},
				{-1238.058,-338.341,10.000},
				{-1272.813,-347.547,10.000},
				{-1308.480,-356.670,10.000},
				{-1345.040,-365.606,10.000},
				{-1382.464,-374.239,10.000},
				{-1420.708,-382.442,10.000},
				{-1459.716,-390.080,10.000},
				{-1499.418,-397.018,10.000},
				{-1539.730,-403.124,10.000},
				{-1580.558,-408.274,10.000},
				{-1621.795,-412.367,10.000},
				{-1663.327,-415.321,10.000},
				{-1705.035,-417.088,10.000},
				{-1746.801,-417.652,10.000},
				{-1788.504,-417.031,10.000},
				{-1830.031,-415.275,10.000},
				{-1871.278,-412.465,10.000},
				{-1912.148,-408.707,10.000},
				{-1952.561,-404.122,10.000},
				{-1992.445,-398.841,10.000},
				{-2031.745,-393.001,10.000},
				{-2070.418,-386.735,10.000},
				{-2108.435,-380.168,10.000},
				{-2145.777,-373.415,10.000},
				{-2182.434,-366.576,10.000},
				{-2218.408,-359.740,10.000},
				{-2253.706,-352.978,10.000},
				{-2288.341,-346.349,10.000},
				{-2322.331,-339.900,10.000},
				{-2355.697,-333.665,10.000},
				{-2388.464,-327.669,10.000},
				{-2420.657,-321.928,10.000},
				{-2452.302,-316.451,10.000},
				{-2483.427,-311.242,10.000},
				{-2514.057,-306.300,10.000},
				{-2544.219,-301.621,10.000},
				{-2573.939,-297.198,10.000},
				{-2603.241,-293.023,10.000},
				{-2632.149,-289.084,10.000},
				{-2660.687,-285.373,10.000},
				{-2688.874,-281.878,10.000},
				{-2716.733,-278.588,10.000},
				{-2744.282,-275.492,10.000},
				{-2771.540,-272.581,10.000},
				{-2798.525,-269.845,10.000},
				{-2825.252,-267.275,10.000},
				{-2851.739,-264.864,10.000},
				{-2877.999,-262.606,10.000},
				{-2904.049,-260.494,10.000},
				{-2929.901,-258.525,10.000},
				{-2955.571,-256.697,10.000},
				{-2981.072,-255.007,10.000},
				{-3006.417,-253.458,10.000},
				{-3031.622,-252.049,10.000},
				{-3056.701,-250.786,10.000},
				{-3081.669,-249.675,10.000},
				{-3106.541,-248.724,10.000},
				{-3131.335,-247.942,10.000},
				{-3156.054,-247.194,10.000},
				{-3180.690,-246.351,10.000},
				{-3205.233,-245.438,10.000},
				{-3229.681,-244.477,10.000},
				{-3254.030,-243.493,10.000},
				{-3278.296,-242.651,10.000},
				{-3302.507,-242.115,10.000},
				{-3326.697,-241.901,10.000},
				{-3350.900,-242.029,10.000},
				{-3375.152,-242.517,10.000},
				{-3399.490,-243.383,10.000},
				{-3423.940,-244.500,10.000},
				{-3448.513,-245.732,10.000},
				{-3473.221,-247.080,10.000},
				{-3498.075,-248.539,10.000},
				{-3523.111,-250.360,10.000},
				{-3549.233,-261.222,10.000},
				{-3576.736,-275.031,10.000},
				{-3605.432,-286.959,10.000},
				{-3635.141,-297.089,10.000},
				{-3665.692,-305.505,10.000},
				{-3696.921,-312.296,10.000},
				{-3728.676,-317.550,10.000},
				{-3760.812,-321.360,10.000},
				{-3793.195,-323.823,10.000},
				{-3825.698,-325.036,10.000},
				{-3858.208,-325.101,10.000},
				{-3890.620,-324.121,10.000},
				{-3922.840,-322.199,10.000},
				{-3954.784,-319.436,10.000},
				{-3986.377,-315.932,10.000},
				{-4017.555,-311.780,10.000},
				{-4048.262,-307.072,10.000},
				{-4078.451,-301.889,10.000},
				{-4108.082,-296.309,10.000},
				{-4137.122,-290.399,10.000},
				{-4165.544,-284.222,10.000},
				{-4193.327,-277.830,10.000},
				{-4220.454,-271.270,10.000},
				{-4246.913,-264.582,10.000},
				{-4272.692,-257.798,10.000},
				{-4297.787,-250.946,10.000},
				{-4322.192,-244.047,10.000},
				{-4345.904,-237.120,10.000},
				{-4368.922,-230.178,10.000},
				{-4391.245,-223.229,10.000},
				{-4412.873,-216.283,10.000},
				{-4433.807,-209.343,10.000},
				{-4454.048,-202.412,10.000},
				{-4473.597,-195.491,10.000},
				{-4492.455,-188.580,10.000},
				{-4510.623,-181.678,10.000},
				{-4528.102,-174.785,10.000},
				{-4544.891,-167.897,10.000},
				{-4560.993,-161.015,10.000},
				{-4576.407,-154.137,10.000},
				{-4591.133,-147.263,10.000},
				{-4605.172,-140.393,10.000},
				{-4618.525,-133.528,10.000},
				{-4631.192,-126.672,10.000},
				{-4643.175,-119.828,10.000},
				{-4654.475,-113.004,10.000},
				{-4665.096,-106.206,10.000},
				{-4675.041,-99.446,10.000},
				{-4684.314,-92.736,10.000},
				{-4692.923,-86.091,10.000},
				{-4700.876,-79.529,10.000},
				{-4708.183,-73.068,10.000},
				{-4714.856,-66.732,10.000},
				{-4720.911,-60.544,10.000},
				{-4726.364,-54.532,10.000},
				{-4731.236,-48.723,10.000},
				{-4735.551,-43.146,10.000},
				{-4739.334,-37.830,10.000},
				{-4742.614,-32.806,10.000},
				{-4745.424,-28.102,10.000},
				{-4747.799,-23.745,10.000},
				{-4749.775,-19.759,10.000},
				{-4751.391,-16.166,10.000},
				{-4752.690,-12.983,10.000},
				{-4753.712,-10.222,10.000},
				{-4754.501,-7.892,10.000},
				{-4755.100,-5.993,10.000},
				{-4755.553,-4.524,10.000},
				{-4755.900,-3.474,10.000},
				{-4756.183,-2.829,10.000},
				{-4756.440,-2.572,10.000},
				{-4756.708,-2.677,10.000},
				{-4757.020,-3.119,10.000},
				{-4757.407,-3.868,10.000},
				{-4757.896,-4.893,10.000},
				{-4758.512,-6.162,10.000},
				{-4759.276,-7.640,10.000},
				{-4760.206,-9.297,10.000},
				{-4761.316,-11.099,10.000},
				{-4762.618,-13.017,10.000},
				{-4764.120,-15.022,10.000},
				{-4765.829,-17.089,10.000},
				{-4767.748,-19.191,10.000},
				{-4769.879,-21.309,10.000},
				{-4772.221,-23.422,10.000},
				{-4774.772,-25.513,10.000},
				{-4777.529,-27.567,10.000},
				{-4780.486,-29.573,10.000},
				{-4783.638,-31.518,10.000},
				{-4786.977,-33.395,10.000},
				{-4790.497,-35.196,10.000},
				{-4794.189,-36.915,10.000},
				{-4798.043,-38.549,10.000},
				{-4802.053,-40.094,10.000},
				{-4806.208,-41.548,10.000},
				{-4810.499,-42.909,10.000},
				{-4814.916,-44.177,10.000},
				{-4819.452,-45.353,10.000},
				{-4824.095,-46.437,10.000},
				{-4828.838,-47.429,10.000},
				{-4833.671,-48.332,10.000},
				{-4838.586,-49.147,10.000},
				{-4843.574,-49.876,10.000},
				{-4848.626,-50.521,10.000},
				{-4853.734,-51.084,10.000},
				{-4858.891,-51.567,10.000},
				{-4864.088,-51.973,10.000},
				{-4869.319,-52.304,10.000},
				{-4874.575,-52.563,10.000},
				{-4879.850,-52.750,10.000},
				{-4885.137,-52.870,10.000},
				{-4890.429,-52.923,10.000},
				{-4895.721,-52.913,10.000},
				{-4901.005,-52.841,10.000},
				{-4906.276,-52.708,10.000},
				{-4911.527,-52.518,10.000},
				{-4916.755,-52.272,10.000},
				{-4921.952,-51.972,10.000},
				{-4927.114,-51.619,10.000},
				{-4932.235,-51.215,10.000},
				{-4937.311,-50.762,10.000},
				{-4942.338,-50.261,10.000},
				{-4947.309,-49.713,10.000},
				{-4952.221,-49.120,10.000},
				{-4957.069,-48.484,10.000},
				{-4961.850,-47.805,10.000},
				{-4966.558,-47.085,10.000},
				{-4971.191,-46.325,10.000},
				{-4975.743,-45.525,10.000},
				{-4980.212,-44.688,10.000},
				{-4984.593,-43.814,10.000},
				{-4988.884,-42.905,10.000},
				{-4993.080,-41.960,10.000},
				{-4997.178,-40.982,10.000},
				{-5001.175,-39.971,10.000},
				{-5005.068,-38.928,10.000},
				{-5008.853,-37.854,10.000},
				{-5012.528,-36.750,10.000},
				{-5016.090,-35.618,10.000},
				{-5019.536,-34.457,10.000},
				{-5022.863,-33.269,10.000},
				{-5026.068,-32.054,10.000},
				{-5029.150,-30.815,10.000},
				{-5032.105,-29.551,10.000},
				{-5034.931,-28.263,10.000},
				{-5037.626,-26.954,10.000},
				{-5040.189,-25.623,10.000},
				{-5042.616,-24.272,10.000},
				{-5044.906,-22.901,10.000},
				{-5047.057,-21.512,10.000},
				{-5049.068,-20.106,10.000},
				{-5050.936,-18.684,10.000},
				{-5052.661,-17.246,10.000},
				{-5054.240,-15.795,10.000},
				{-5055.673,-14.331,10.000},
				{-5056.959,-12.856,10.000},
				{-5058.096,-11.370,10.000},
				{-5059.084,-9.875,10.000},
				{-5059.921,-8.372,10.000},
				{-5060.607,-6.862,10.000},
				{-5061.142,-5.347,10.000},
				{-5061.524,-3.827,10.000},
				{-5061.770,-2.455,10.000},
				{-5061.908,-1.384,10.000},
				{-5061.970,-0.618,10.000},
				{-5061.986,-0.157,10.000},
				{-5061.986,-0.002,10.000},
				{-5061.986,-0.000,10.000}
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