package com.syntax.class05;

import java.util.Scanner;

public class improved {
	public static void main(String[] args) {
	
	Scanner scan;
	String month;
	String season;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your birth month");
	
	month=scan.next();
	if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
		season="Summer";
	}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
		season="Fall";
	}else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
		season="Winter";
	}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
		season="Spring";
	}else {
		season="invalid";
	}
	System.out.println("You were born in "+season);
	}
}


