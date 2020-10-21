package com.syntax.class05;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LogicalOr {

	public static void main(String[] args) {
		String day = "Monday";
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today I have a java class at syntax");
		} else {
			System.out.println("we are off");
		}
		System.out.println("__________________________________________________________________________________");

		/*If day 1 or 5--> I am off from Syntax
		 * if day 2 or 3--> GIT classes
		 * if day is 4 __> review class
		 * if day 6 or 7 -->Java class
		 * everything else will be invalid day
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter todays day using numbers only from 1 to 7");
		
		int today=input.nextInt();
		if(today==1 || today==5) {
			System.out.println("I am off from Syntax");
			
		}else if (today==2 || today==3) {
			System.out.println("Today is GIT class");
		}else if(today==4) {
			System.out.println("Today is review Class");
			
		}else if(today==6 || today==7) {
			System.out.println("Today is Java class");
		}else {
			System.out.println("Please enter a valid day from 1 to 7");
		}
	}

}
