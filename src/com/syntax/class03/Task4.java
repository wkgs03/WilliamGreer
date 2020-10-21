package com.syntax.class03;

public class Task4 {

	public static void main(String[] args) {
		// Declare variable and increase by 100 using shorthand operator

		int A = 10;
		A += 100;
		System.out.println(A);

		// Declare variable and decrease by 67 using shorthand operator

		int B = 67;
		B -= 67;
		System.out.println(B);

		/*
		 * Declare variable cakePiece=11 and divide cakePiece between 4 people using
		 * shorthand operator Each person should get an equal piece of cake
		 */

		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);

		// Declare variable cakePiece=25 and divide cakePiece between 7 people. Using
		// shorthand operator found out how many pieces of cake left after it was
		// distributed equally among 7 people
         
		int cakePiece1=25;
		cakePiece1/=7;
				cakePiece1%=7;
		System.out.println(cakePiece1);
	}

}
