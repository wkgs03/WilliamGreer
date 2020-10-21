package com.syntax.class05;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (Numbers must(be distinct)
		 */
		double num1, num2, num3, max;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("Please enter your first number");
		num1 = scan.nextDouble();

		System.out.println("Please enter your second number");
		num2 = scan.nextDouble();

		System.out.println("Please enter your third number");
		num3 = scan.nextDouble();
		if (num1 > num2 && num1 > num3) {
			max=num1;
		} else if (num2 > num3) {
			max= num2;
		} else {
			max= num3;
		}
		System.out.println("The largest number is "+max);

	}

}
