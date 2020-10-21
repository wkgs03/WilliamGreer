package com.syntax.class05;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		/*
		 * WRITE A PROGRAM FOR USER TO ENTER HIS/HERS BIRTH MONTH. bASED ON THE MONTH DEFINE THE SEASON.
		 * Example: if user is born in June,july or August-> season="Summer". At the end of the program we shoul see output as "You were born
		 * ________
		 */

		
		Scanner scan;
		String month;
		scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		
		month=scan.next();
		if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("You were born in Sumer");
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("You were born in Fall");
		}else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			System.out.println("You were born in Winter");
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in Spring");
		}
		}
		
	}


