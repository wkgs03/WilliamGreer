package com.syntax.class06;

import java.util.Scanner;

public class GradeTask02 {

	public static void main(String[] args) {
		/* Allow user to enter grade and them provide explanation:A-Excellent,B-Good,C-Average,D-Bad,any other grade-->Not acceptable.
		 * At the end your program should print which grade was entered by user with explanation
		 */
		Scanner input;
		String explanation;
		char grade;
		input=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=input.next().charAt(0);
		explanation=input.nextLine();
		
		switch(grade) {
		case 'A':
			explanation=" Excellent ";
			break;
		case'B':
			explanation=" Good ";
			break;
		case'C':
			explanation=" Average";
			break;
		case'D':
			explanation=" Bad ";
			default:
				explanation=" Invalid entry ";
		}	
System.out.println("Your grade is "+grade+" and you are doing "+explanation);
	}

}
