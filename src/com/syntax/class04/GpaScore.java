package com.syntax.class04;

public class GpaScore {

	public static void main(String[] args) {
		// Write a program to store a boolean value of whether user has a diploma or
		// not. If user has a diploma, you should say congratulations, otherwise program
		// should suggest to get a degree. Then if user has a degree, program should
		// check a gpa score. If gpa score is higher or equals to 3.5-> output should
		// say "You are eligible for a scholarship", otherwise->"You should have studied
		// harder"
		
boolean diploma=true;
double GpaScore=3.6;

if(diploma) {
	System.out.println("Congratulations!!");

if(GpaScore>=3.5) {
	System.out.println("You are eligible for a scholarship");
}else {
	System.out.println("You should have studied harder");
}


	
}else {
	System.out.println("You should get a degree");
}
	}

}
