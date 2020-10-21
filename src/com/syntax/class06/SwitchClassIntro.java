package com.syntax.class06;

import java.util.Scanner;

public class SwitchClassIntro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a day number");
		int day = scan.nextInt();

		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we have Manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we have Manual class again");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we have Review class");
		} else if (day == 5) {
			System.out.println("Today is Friday and we have no class, but I will prepare for tomorrow");
		} else if (day == 6) {
			System.out.println("Today is Saturday, I miss Java classes");
		} else if (day == 7) {
			System.out.println("Today is Sunday, I did a lot of coding this week");
		} else {
			System.out.println("This is an invalid day of a week");

		}

		System.out.println("SAME EXAMPLE USING SWITH CASE-----");
		String today;

		switch (day) {//datatype of the variable must match with datatype of cases

		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today = "Invalid Day";
		}

	}

}