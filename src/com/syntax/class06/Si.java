package com.syntax.class06;

import java.util.Scanner;

public class Si {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean response;
		int cscore;
		String decision=input.next();

		
		input=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		
		response=input.nextBoolean();
		if(response) {
			System.out.println("What is your credit score?");
			cscore=input.nextInt();
			if(cscore<600) {	
				decision="Not eligible";
			}else if(cscore<=700 && cscore>=600) {
				decision="Maybe eligible";
			}else if(cscore<=800 && cscore>=701) {
				decision="Eligible";
			}else if(cscore>=801) {
				decision="Definitely eligible";
			}
			System.out.println("The eligibility is "+decision);
		}else {
			System.out.println("Unknown");
			
		}
		
	}

}
