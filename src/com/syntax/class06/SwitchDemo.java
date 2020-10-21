package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		/*
		 * lets ask a tester on witch browser they would like to use
		 * 
		 */
		Scanner scan;
		String browser;
		String message;

		scan = new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser = scan.nextLine();

		switch (browser.toLowerCase()) {
		case "Safari":
			message = "You code will be executed on Safari browser";
			break;
		case "Opera":
			message = "You code will be execueed on Opera browser";
			break;
		case "Chrome":
			message = "You code will be executed on chrome";
			break;
		default:
			message = "Entered browser is not supported";
		}
		System.out.println(message);
//switch cannot work with double,float,long
		//switch case cannot use relational or logical operators

		float f=10.99f;
		double d=19.90;
		long l=19099;
		boolean b= true;
		
		// switch(l) {CE:Compailer Error
	}

}
