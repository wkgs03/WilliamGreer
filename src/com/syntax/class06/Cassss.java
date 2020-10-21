package com.syntax.class06;

import java.util.Scanner;

public class Cassss {

	public static void main(String[] args) {
		Scanner input;
		boolean response;
		int cscore;
		
		input=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		response=input.nextBoolean();
		
		if(response) {
			System.out.println("What is your credit score?");
			cscore=input.nextInt();
			if(cscore<600) {
				System.out.println("Not eligible");
			}else if(cscore<=700 && cscore>=600) {
				System.out.println("Maybe eligible");
			}else if(cscore<=800 && cscore>=701) {
				System.out.println("Eligible");
			}else if(cscore>=801) {
				System.out.println("Definitely eligible");
			}
		}else {
			System.out.println("Unknown");
		}
		
	}
}