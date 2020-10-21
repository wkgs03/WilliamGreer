package com.syntax.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		/*
		 * Check if the assignment is completed
		 * if assignment is completed:
		 *                      if score >90 --> great job
		 *                      if score >80 --> good job
		 *                      if score >70--> please study more
		 */

int score=65;
boolean assignment=true;

if(assignment) { 
	if(score>90) {
		System.out.println("You did great!!!!");
	}else if(score>80) {
		System.out.println("You did good!!!");
	}else if(score>70) {
		System.out.println("Problably you need to study more");
	}else {
		System.out.println("Good job for trying but you must study!");
	}
}else {
	System.out.println("You should always complete all assigments");
			

	}

}
	
}
