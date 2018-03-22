package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class Baseline extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,23.00,0.00)
	// (13.33,23.00,0.00)
	// (19.92,17.58,-89.99)
	// (19.92,14.67,-89.99)
	
	public Baseline() {
		this(false);
	}
			
    public Baseline(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.000018, 0.000722, 50},
				{0.000018, 0.000000, 50},
				{0.000131, 0.002257, 50},
				{0.000420, 0.005780, 50},
				{0.000871, 0.009031, 50},
				{0.001522, 0.013005, 50},
				{0.002407, 0.017701, 50},
				{0.003563, 0.023119, 50},
				{0.005026, 0.029260, 50},
				{0.006832, 0.036124, 50},
				{0.009017, 0.043710, 50},
				{0.011618, 0.052018, 50},
				{0.014671, 0.061049, 50},
				{0.018211, 0.070802, 50},
				{0.022275, 0.081278, 50},
				{0.026899, 0.092477, 50},
				{0.032118, 0.104397, 50},
				{0.037970, 0.117041, 50},
				{0.044491, 0.130407, 50},
				{0.051716, 0.144495, 50},
				{0.059681, 0.159305, 50},
				{0.068423, 0.174839, 50},
				{0.077977, 0.191094, 50},
				{0.088381, 0.208072, 50},
				{0.099670, 0.225773, 50},
				{0.111880, 0.244196, 50},
				{0.125047, 0.263342, 50},
				{0.139207, 0.283210, 50},
				{0.154397, 0.303800, 50},
				{0.170653, 0.325113, 50},
				{0.188010, 0.347149, 50},
				{0.206506, 0.369907, 50},
				{0.226175, 0.393387, 50},
				{0.247054, 0.417590, 50},
				{0.269180, 0.442515, 50},
				{0.292588, 0.468163, 50},
				{0.317315, 0.494533, 50},
				{0.343396, 0.521626, 50},
				{0.370868, 0.549441, 50},
				{0.399767, 0.577979, 50},
				{0.430129, 0.607239, 50},
				{0.461990, 0.637222, 50},
				{0.495387, 0.667927, 50},
				{0.530354, 0.699355, 50},
				{0.566930, 0.731505, 50},
				{0.605149, 0.764377, 50},
				{0.645047, 0.797972, 50},
				{0.686662, 0.832290, 50},
				{0.730028, 0.867330, 50},
				{0.775183, 0.903092, 50},
				{0.822162, 0.939577, 50},
				{0.871001, 0.976785, 50},
				{0.921737, 1.014714, 50},
				{0.974405, 1.053367, 50},
				{1.029042, 1.092742, 50},
				{1.085684, 1.132839, 50},
				{1.144367, 1.173659, 50},
				{1.205127, 1.215201, 50},
				{1.268000, 1.257466, 50},
				{1.333023, 1.300453, 50},
				{1.400231, 1.344162, 50},
				{1.469661, 1.388595, 50},
				{1.541348, 1.433749, 50},
				{1.615329, 1.479626, 50},
				{1.691641, 1.526226, 50},
				{1.770300, 1.573187, 50},
				{1.851307, 1.620147, 50},
				{1.934663, 1.667108, 50},
				{2.020366, 1.714069, 50},
				{2.108418, 1.761030, 50},
				{2.198817, 1.807991, 50},
				{2.291565, 1.854951, 50},
				{2.386661, 1.901912, 50},
				{2.484104, 1.948873, 50},
				{2.583896, 1.995834, 50},
				{2.686036, 2.042795, 50},
				{2.790523, 2.089755, 50},
				{2.897359, 2.136716, 50},
				{3.006543, 2.183677, 50},
				{3.118075, 2.230638, 50},
				{3.231955, 2.277599, 50},
				{3.348183, 2.324559, 50},
				{3.466759, 2.371520, 50},
				{3.587683, 2.418481, 50},
				{3.710955, 2.465442, 50},
				{3.836575, 2.512403, 50},
				{3.964543, 2.559363, 50},
				{4.094859, 2.606324, 50},
				{4.227524, 2.653285, 50},
				{4.362536, 2.700246, 50},
				{4.499896, 2.747207, 50},
				{4.639605, 2.794167, 50},
				{4.781661, 2.841128, 50},
				{4.926066, 2.888089, 50},
				{5.072818, 2.935050, 50},
				{5.221919, 2.982011, 50},
				{5.373367, 3.028971, 50},
				{5.527164, 3.075932, 50},
				{5.683308, 3.122893, 50},
				{5.841801, 3.169854, 50},
				{6.002624, 3.216453, 50},
				{6.165740, 3.262330, 50},
				{6.331115, 3.307485, 50},
				{6.498710, 3.351917, 50},
				{6.668492, 3.395627, 50},
				{6.840422, 3.438614, 50},
				{7.014466, 3.480879, 50},
				{7.190587, 3.522421, 50},
				{7.368749, 3.563241, 50},
				{7.548916, 3.603338, 50},
				{7.731052, 3.642713, 50},
				{7.915120, 3.681365, 50},
				{8.101085, 3.719295, 50},
				{8.288910, 3.756502, 50},
				{8.478559, 3.792987, 50},
				{8.669997, 3.828750, 50},
				{8.863186, 3.863790, 50},
				{9.058092, 3.898107, 50},
				{9.254677, 3.931702, 50},
				{9.452906, 3.964575, 50},
				{9.652742, 3.996725, 50},
				{9.854150, 4.028153, 50},
				{10.057092, 4.058858, 50},
				{10.261534, 4.088840, 50},
				{10.467439, 4.118101, 50},
				{10.674771, 4.146638, 50},
				{10.883494, 4.174454, 50},
				{11.093571, 4.201546, 50},
				{11.304967, 4.227917, 50},
				{11.517645, 4.253564, 50},
				{11.731570, 4.278490, 50},
				{11.946705, 4.302693, 50},
				{12.163013, 4.326173, 50},
				{12.380460, 4.348931, 50},
				{12.599008, 4.370966, 50},
				{12.818622, 4.392279, 50},
				{13.039266, 4.412870, 50},
				{13.260902, 4.432738, 50},
				{13.483497, 4.451883, 50},
				{13.707012, 4.470307, 50},
				{13.931412, 4.488007, 50},
				{14.170520, 4.782150, 50},
				{14.418469, 4.958976, 50},
				{14.669455, 5.019732, 50},
				{14.923783, 5.086564, 50},
				{15.181817, 5.160673, 50},
				{15.443988, 5.243430, 50},
				{15.710805, 5.336340, 50},
				{15.982852, 5.440941, 50},
				{16.260782, 5.558590, 50},
				{16.545285, 5.690056, 50},
				{16.837027, 5.834841, 50},
				{17.136535, 5.990158, 50},
				{17.444018, 6.149674, 50},
				{17.759140, 6.302435, 50},
				{18.080786, 6.432915, 50},
				{18.406952, 6.523330, 50},
				{18.734879, 6.558528, 50},
				{19.061461, 6.531636, 50},
				{19.383812, 6.447034, 50},
				{19.699737, 6.318483, 50},
				{20.007926, 6.163781, 50},
				{20.307895, 5.999396, 50},
				{20.599768, 5.837458, 50},
				{20.884018, 5.684992, 50},
				{21.161288, 5.545404, 50},
				{21.432275, 5.419733, 50},
				{21.697636, 5.307233, 50},
				{21.957958, 5.206426, 50},
				{22.213736, 5.115570, 50},
				{22.465382, 5.032912, 50},
				{22.713222, 4.956809, 50},
				{22.957511, 4.885768, 50},
				{23.198433, 4.818446, 50},
				{23.436115, 4.753633, 50},
				{23.670626, 4.690225, 50},
				{23.901986, 4.627192, 50},
				{24.130163, 4.563546, 50},
				{24.355079, 4.498314, 50},
				{24.576604, 4.430506, 50},
				{24.794558, 4.359091, 50},
				{25.008707, 4.282971, 50},
				{25.218755, 4.200965, 50},
				{25.437209, 4.369081, 50},
				{25.664325, 4.542323, 50},
				{25.890678, 4.527060, 50},
				{26.116232, 4.511075, 50},
				{26.340951, 4.494368, 50},
				{26.564797, 4.476938, 50},
				{26.787737, 4.458785, 50},
				{27.009732, 4.439911, 50},
				{27.230748, 4.420313, 50},
				{27.450748, 4.399993, 50},
				{27.669695, 4.378951, 50},
				{27.887554, 4.357186, 50},
				{28.104289, 4.334699, 50},
				{28.319864, 4.311489, 50},
				{28.534242, 4.287557, 50},
				{28.747387, 4.262902, 50},
				{28.959263, 4.237525, 50},
				{29.169834, 4.211426, 50},
				{29.379065, 4.184604, 50},
				{29.586917, 4.157059, 50},
				{29.793357, 4.128792, 50},
				{29.998347, 4.099802, 50},
				{30.201852, 4.070090, 50},
				{30.403835, 4.039656, 50},
				{30.604259, 4.008499, 50},
				{30.803090, 3.976620, 50},
				{31.000291, 3.944018, 50},
				{31.195826, 3.910693, 50},
				{31.389658, 3.876646, 50},
				{31.581752, 3.841877, 50},
				{31.772071, 3.806385, 50},
				{31.960580, 3.770171, 50},
				{32.147242, 3.733234, 50},
				{32.332020, 3.695575, 50},
				{32.514880, 3.657193, 50},
				{32.695785, 3.618089, 50},
				{32.874698, 3.578263, 50},
				{33.051583, 3.537714, 50},
				{33.226406, 3.496442, 50},
				{33.394157, 3.355036, 50},
				{33.554833, 3.213506, 50},
				{33.712393, 3.151208, 50},
				{33.866653, 3.085207, 50},
				{34.017395, 3.014824, 50},
				{34.164353, 2.939170, 50},
				{34.307207, 2.857072, 50},
				{34.445564, 2.767148, 50},
				{34.578940, 2.667529, 50},
				{34.706703, 2.555249, 50},
				{34.827998, 2.425896, 50},
				{34.941649, 2.273029, 50},
				{35.046001, 2.087034, 50},
				{35.138665, 1.853281, 50},
				{35.216129, 1.549278, 50},
				{35.273175, 1.140932, 50},
				{35.302212, 0.580730, 50},
				{35.311144, 0.178637, 50},
				{35.366629, 1.109708, 50},
				{35.463929, 1.945987, 50},
				{35.572927, 2.179970, 50},
				{35.655126, 1.643976, 50},
				{35.693794, 0.773359, 50},
				{35.694386, 0.011845, 50},
				{35.723564, 0.583554, 50},
				{35.772376, 0.976251, 50},
				{35.834395, 1.240377, 50},
				{35.905284, 1.417781, 50},
				{35.982123, 1.536770, 50},
				{36.062911, 1.615773, 50},
				{36.146252, 1.666809, 50},
				{36.231144, 1.697844, 50},
				{36.316857, 1.714270, 50},
				{36.402849, 1.719821, 50},
				{36.488705, 1.717138, 50},
				{36.574112, 1.708125, 50},
				{36.658821, 1.694182, 50},
				{36.742639, 1.676354, 50},
				{36.825410, 1.655432, 50},
				{36.907011, 1.632024, 50},
				{36.987341, 1.606598, 50},
				{37.066317, 1.579522, 50},
				{37.143883, 1.551316, 50},
				{37.220013, 1.522597, 50},
				{37.294699, 1.493712, 50},
				{37.367940, 1.464832, 50},
				{37.439745, 1.436097, 50},
				{37.510126, 1.407619, 50},
				{37.579100, 1.379489, 50},
				{37.646689, 1.351779, 50},
				{37.712917, 1.324545, 50},
				{37.777808, 1.297828, 50},
				{37.841391, 1.271654, 50},
				{37.903693, 1.246037, 50},
				{37.964742, 1.220978, 50},
				{38.024565, 1.196466, 50},
				{38.083188, 1.172474, 50},
				{38.140637, 1.148968, 50},
				{38.196932, 1.125896, 50},
				{38.252092, 1.103198, 50},
				{38.306131, 1.080798, 50},
				{38.359062, 1.058611, 50},
				{38.410889, 1.036540, 50},
				{38.461613, 1.014478, 50},
				{38.511229, 0.992314, 50},
				{38.559725, 0.969928, 50},
				{38.607085, 0.947199, 50},
				{38.653285, 0.924009, 50},
				{38.698298, 0.900244, 50},
				{38.742088, 0.875800, 50},
				{38.784617, 0.850585, 50},
				{38.825843, 0.824527, 50},
				{38.865722, 0.797573, 50},
				{38.904207, 0.769696, 50},
				{38.941251, 0.740894, 50},
				{38.976811, 0.711193, 50},
				{39.010843, 0.680645, 50},
				{39.043310, 0.649331, 50},
				{39.074178, 0.617354, 50},
				{39.103420, 0.584838, 50},
				{39.131016, 0.551924, 50},
				{39.156954, 0.518768, 50},
				{39.181231, 0.485534, 50},
				{39.203850, 0.452390, 50},
				{39.224826, 0.419507, 50},
				{39.244178, 0.387050, 50},
				{39.261937, 0.355181, 50},
				{39.278140, 0.324055, 50},
				{39.292831, 0.293815, 50},
				{39.306061, 0.264595, 50},
				{39.317886, 0.236516, 50},
				{39.328371, 0.209688, 50},
				{39.337581, 0.184208, 50},
				{39.345589, 0.160164, 50},
				{39.352471, 0.137629, 50},
				{39.358304, 0.116668, 50},
				{39.363171, 0.097337, 50},
				{39.367155, 0.079680, 50},
				{39.370342, 0.063737, 50},
				{39.372819, 0.049537, 50},
				{39.374674, 0.037104, 50},
				{39.375997, 0.026457, 50},
				{39.376877, 0.017609, 50},
				{39.377406, 0.010568, 50},
				{39.377673, 0.005341, 50},
				{39.377769, 0.001932, 50},
				{39.377786, 0.000341, 50},
				{39.377786, 0.000000, 50}

		};
		
		double[][] rightPoints = {
				{0.000018, 0.000722, 50},
				{0.000018, 0.000000, 50},
				{0.000131, 0.002257, 50},
				{0.000420, 0.005780, 50},
				{0.000871, 0.009031, 50},
				{0.001522, 0.013005, 50},
				{0.002407, 0.017701, 50},
				{0.003563, 0.023119, 50},
				{0.005026, 0.029260, 50},
				{0.006832, 0.036124, 50},
				{0.009017, 0.043710, 50},
				{0.011618, 0.052018, 50},
				{0.014671, 0.061049, 50},
				{0.018211, 0.070802, 50},
				{0.022275, 0.081278, 50},
				{0.026899, 0.092477, 50},
				{0.032118, 0.104397, 50},
				{0.037970, 0.117041, 50},
				{0.044491, 0.130407, 50},
				{0.051716, 0.144495, 50},
				{0.059681, 0.159305, 50},
				{0.068423, 0.174839, 50},
				{0.077977, 0.191094, 50},
				{0.088381, 0.208072, 50},
				{0.099670, 0.225773, 50},
				{0.111880, 0.244196, 50},
				{0.125047, 0.263342, 50},
				{0.139207, 0.283210, 50},
				{0.154397, 0.303800, 50},
				{0.170653, 0.325113, 50},
				{0.188010, 0.347149, 50},
				{0.206506, 0.369907, 50},
				{0.226175, 0.393387, 50},
				{0.247054, 0.417590, 50},
				{0.269180, 0.442515, 50},
				{0.292588, 0.468163, 50},
				{0.317315, 0.494533, 50},
				{0.343396, 0.521626, 50},
				{0.370868, 0.549441, 50},
				{0.399767, 0.577979, 50},
				{0.430129, 0.607239, 50},
				{0.461990, 0.637222, 50},
				{0.495387, 0.667927, 50},
				{0.530354, 0.699355, 50},
				{0.566930, 0.731505, 50},
				{0.605149, 0.764377, 50},
				{0.645047, 0.797972, 50},
				{0.686662, 0.832290, 50},
				{0.730028, 0.867330, 50},
				{0.775183, 0.903092, 50},
				{0.822162, 0.939577, 50},
				{0.871001, 0.976785, 50},
				{0.921737, 1.014714, 50},
				{0.974405, 1.053367, 50},
				{1.029042, 1.092742, 50},
				{1.085684, 1.132839, 50},
				{1.144367, 1.173659, 50},
				{1.205127, 1.215201, 50},
				{1.268000, 1.257466, 50},
				{1.333023, 1.300453, 50},
				{1.400231, 1.344162, 50},
				{1.469661, 1.388595, 50},
				{1.541348, 1.433749, 50},
				{1.615329, 1.479626, 50},
				{1.691641, 1.526226, 50},
				{1.770300, 1.573187, 50},
				{1.851307, 1.620147, 50},
				{1.934663, 1.667108, 50},
				{2.020366, 1.714069, 50},
				{2.108418, 1.761030, 50},
				{2.198817, 1.807991, 50},
				{2.291565, 1.854951, 50},
				{2.386661, 1.901912, 50},
				{2.484104, 1.948873, 50},
				{2.583896, 1.995834, 50},
				{2.686036, 2.042795, 50},
				{2.790523, 2.089755, 50},
				{2.897359, 2.136716, 50},
				{3.006543, 2.183677, 50},
				{3.118075, 2.230638, 50},
				{3.231955, 2.277599, 50},
				{3.348183, 2.324559, 50},
				{3.466759, 2.371520, 50},
				{3.587683, 2.418481, 50},
				{3.710955, 2.465442, 50},
				{3.836575, 2.512403, 50},
				{3.964543, 2.559363, 50},
				{4.094859, 2.606324, 50},
				{4.227524, 2.653285, 50},
				{4.362536, 2.700246, 50},
				{4.499896, 2.747207, 50},
				{4.639605, 2.794167, 50},
				{4.781661, 2.841128, 50},
				{4.926066, 2.888089, 50},
				{5.072818, 2.935050, 50},
				{5.221919, 2.982011, 50},
				{5.373367, 3.028971, 50},
				{5.527164, 3.075932, 50},
				{5.683308, 3.122893, 50},
				{5.841801, 3.169854, 50},
				{6.002624, 3.216453, 50},
				{6.165740, 3.262330, 50},
				{6.331115, 3.307485, 50},
				{6.498710, 3.351917, 50},
				{6.668492, 3.395627, 50},
				{6.840422, 3.438614, 50},
				{7.014466, 3.480879, 50},
				{7.190587, 3.522421, 50},
				{7.368749, 3.563241, 50},
				{7.548916, 3.603338, 50},
				{7.731052, 3.642713, 50},
				{7.915120, 3.681365, 50},
				{8.101085, 3.719295, 50},
				{8.288910, 3.756502, 50},
				{8.478559, 3.792987, 50},
				{8.669997, 3.828750, 50},
				{8.863186, 3.863790, 50},
				{9.058092, 3.898107, 50},
				{9.254677, 3.931702, 50},
				{9.452906, 3.964575, 50},
				{9.652742, 3.996725, 50},
				{9.854150, 4.028153, 50},
				{10.057092, 4.058858, 50},
				{10.261534, 4.088840, 50},
				{10.467439, 4.118101, 50},
				{10.674771, 4.146638, 50},
				{10.883494, 4.174454, 50},
				{11.093571, 4.201546, 50},
				{11.304967, 4.227917, 50},
				{11.517645, 4.253564, 50},
				{11.731570, 4.278490, 50},
				{11.946705, 4.302693, 50},
				{12.163013, 4.326173, 50},
				{12.380460, 4.348931, 50},
				{12.599008, 4.370966, 50},
				{12.818622, 4.392279, 50},
				{13.039266, 4.412870, 50},
				{13.260902, 4.432738, 50},
				{13.483497, 4.451883, 50},
				{13.707012, 4.470307, 50},
				{13.931412, 4.488007, 50},
				{14.142473, 4.221219, 50},
				{14.346639, 4.083318, 50},
				{14.549318, 4.053587, 50},
				{14.750135, 4.016323, 50},
				{14.948651, 3.970322, 50},
				{15.144361, 3.914208, 50},
				{15.336685, 3.846471, 50},
				{15.524963, 3.765563, 50},
				{15.708469, 3.670119, 50},
				{15.886437, 3.559357, 50},
				{16.058125, 3.433769, 50},
				{16.222932, 3.296134, 50},
				{16.380572, 3.152795, 50},
				{16.531308, 3.014738, 50},
				{16.676186, 2.897551, 50},
				{16.817141, 2.819102, 50},
				{16.956872, 2.794623, 50},
				{17.098423, 2.831024, 50},
				{17.244618, 2.923898, 50},
				{17.397589, 3.059407, 50},
				{17.558572, 3.219664, 50},
				{17.727979, 3.388134, 50},
				{17.905611, 3.552647, 50},
				{18.090897, 3.705716, 50},
				{18.283094, 3.843939, 50},
				{18.481431, 3.966739, 50},
				{18.685174, 4.074874, 50},
				{18.893666, 4.169834, 50},
				{19.106334, 4.253369, 50},
				{19.322696, 4.327238, 50},
				{19.542351, 4.393091, 50},
				{19.764972, 4.452424, 50},
				{19.990301, 4.506584, 50},
				{20.218140, 4.556781, 50},
				{20.448346, 4.604121, 50},
				{20.680828, 4.649636, 50},
				{20.915544, 4.694312, 50},
				{21.152500, 4.739123, 50},
				{21.391753, 4.785059, 50},
				{21.633410, 4.833149, 50},
				{21.877635, 4.884490, 50},
				{22.124648, 4.940260, 50},
				{22.361718, 4.741404, 50},
				{22.588834, 4.542323, 50},
				{22.815187, 4.527060, 50},
				{23.040741, 4.511075, 50},
				{23.265459, 4.494368, 50},
				{23.489306, 4.476938, 50},
				{23.712245, 4.458785, 50},
				{23.934241, 4.439911, 50},
				{24.155257, 4.420313, 50},
				{24.375256, 4.399993, 50},
				{24.594204, 4.378951, 50},
				{24.812063, 4.357186, 50},
				{25.028798, 4.334699, 50},
				{25.244373, 4.311489, 50},
				{25.458750, 4.287557, 50},
				{25.671896, 4.262902, 50},
				{25.883772, 4.237525, 50},
				{26.094343, 4.211426, 50},
				{26.303573, 4.184604, 50},
				{26.511426, 4.157059, 50},
				{26.717866, 4.128792, 50},
				{26.922856, 4.099802, 50},
				{27.126360, 4.070090, 50},
				{27.328343, 4.039656, 50},
				{27.528768, 4.008499, 50},
				{27.727599, 3.976620, 50},
				{27.924800, 3.944018, 50},
				{28.120335, 3.910693, 50},
				{28.314167, 3.876646, 50},
				{28.506261, 3.841877, 50},
				{28.696580, 3.806385, 50},
				{28.885089, 3.770171, 50},
				{29.071750, 3.733234, 50},
				{29.256529, 3.695575, 50},
				{29.439389, 3.657193, 50},
				{29.620293, 3.618089, 50},
				{29.799206, 3.578263, 50},
				{29.976092, 3.537714, 50},
				{30.150914, 3.496442, 50},
				{30.328267, 3.547052, 50},
				{30.508763, 3.609928, 50},
				{30.688030, 3.585343, 50},
				{30.866181, 3.563014, 50},
				{31.043362, 3.543621, 50},
				{31.219765, 3.528050, 50},
				{31.395638, 3.517476, 50},
				{31.571325, 3.513729, 50},
				{31.747295, 3.519400, 50},
				{31.924181, 3.537721, 50},
				{32.102836, 3.573097, 50},
				{32.284434, 3.631961, 50},
				{32.470629, 3.723908, 50},
				{32.663806, 3.863536, 50},
				{32.867470, 4.073273, 50},
				{33.086824, 4.387093, 50},
				{33.329439, 4.852291, 50},
				{33.605208, 5.515389, 50},
				{33.922683, 6.349492, 50},
				{34.277100, 7.088345, 50},
				{34.638484, 7.227671, 50},
				{34.968522, 6.600773, 50},
				{35.250521, 5.639975, 50},
				{35.488804, 4.765661, 50},
				{35.693764, 4.099193, 50},
				{35.874427, 3.613270, 50},
				{36.037207, 3.255590, 50},
				{36.186430, 2.984467, 50},
				{36.325014, 2.771671, 50},
				{36.454954, 2.598814, 50},
				{36.577649, 2.453897, 50},
				{36.694098, 2.328967, 50},
				{36.805029, 2.218636, 50},
				{36.910988, 2.119173, 50},
				{37.012385, 2.027941, 50},
				{37.109537, 1.943037, 50},
				{37.202690, 1.863061, 50},
				{37.292039, 1.786970, 50},
				{37.377737, 1.713971, 50},
				{37.459910, 1.643458, 50},
				{37.538658, 1.574962, 50},
				{37.614064, 1.508116, 50},
				{37.686206, 1.442851, 50},
				{37.755170, 1.379275, 50},
				{37.821036, 1.317308, 50},
				{37.883875, 1.256782, 50},
				{37.943752, 1.197555, 50},
				{38.000728, 1.139517, 50},
				{38.054857, 1.082575, 50},
				{38.106190, 1.026658, 50},
				{38.154776, 0.971710, 50},
				{38.200660, 0.917691, 50},
				{38.243889, 0.864572, 50},
				{38.284506, 0.812342, 50},
				{38.322556, 0.760999, 50},
				{38.358084, 0.710555, 50},
				{38.391135, 0.661034, 50},
				{38.421759, 0.612474, 50},
				{38.450005, 0.564924, 50},
				{38.475927, 0.518445, 50},
				{38.499583, 0.473113, 50},
				{38.521034, 0.429013, 50},
				{38.540346, 0.386243, 50},
				{38.557591, 0.344907, 50},
				{38.572847, 0.305120, 50},
				{38.586197, 0.267000, 50},
				{38.597730, 0.230667, 50},
				{38.607542, 0.196240, 50},
				{38.615734, 0.163833, 50},
				{38.622412, 0.133551, 50},
				{38.627686, 0.105485, 50},
				{38.631671, 0.079707, 50},
				{38.634485, 0.056270, 50},
				{38.636245, 0.035201, 50},
				{38.637070, 0.016502, 50},
				{38.637077, 0.000149, 50},
				{38.637773, 0.013917, 50},
				{38.639062, 0.025769, 50},
				{38.640837, 0.035513, 50},
				{38.643001, 0.043274, 50},
				{38.645461, 0.049192, 50},
				{38.648132, 0.053422, 50},
				{38.650938, 0.056130, 50},
				{38.653812, 0.057483, 50},
				{38.656695, 0.057651, 50},
				{38.659535, 0.056802, 50},
				{38.662290, 0.055096, 50},
				{38.664924, 0.052687, 50},
				{38.667410, 0.049720, 50},
				{38.669727, 0.046328, 50},
				{38.671858, 0.042631, 50},
				{38.673795, 0.038741, 50},
				{38.675533, 0.034754, 50},
				{38.677071, 0.030758, 50},
				{38.678412, 0.026826, 50},
				{38.679563, 0.023023, 50},
				{38.680533, 0.019405, 50},
				{38.681334, 0.016017, 50},
				{38.681979, 0.012898, 50},
				{38.682483, 0.010076, 50},
				{38.682862, 0.007577, 50},
				{38.683133, 0.005418, 50},
				{38.683313, 0.003613, 50},
				{38.683422, 0.002171, 50},
				{38.683477, 0.001098, 50},
				{38.683497, 0.000397, 50},
				{38.683500, 0.000070, 50},
				{38.683500, 0.000000, 50}
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