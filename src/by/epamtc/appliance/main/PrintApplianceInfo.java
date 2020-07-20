package by.epamtc.appliance.main;

import by.epamtc.appliance.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {
		for (int i = 0; i<appliance.size(); i++){
			System.out.println(appliance.get(i));
		}
		// you may add your own code here
		
	}
	
	// you may add your own code here

}
