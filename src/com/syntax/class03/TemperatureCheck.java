package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		// Create a java program and name it Temperature Check. Create variable to store
				// temperature. Your program should check if temperature is below 32 then it
				// should print "Water will freeze with temperature_",otherwise "Water will NOT
				// freeze with temperature_"
		int temperature=75;
		int frz=32;
		if(temperature<frz) {
			System.out.println("Water will freeze with temperature "+frz);
		}else {
			System.out.println("Water will NOT freeze with temperature "+temperature);
		}
		
	}

}
