package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1 way to create a variable:
		
		//create variable = assigning value
		//declare a variable = initializing
		double $num = 12.99;
		
		
		//2 way to create a variable:
		//declare a variable
		//initialize or assing value
		
		int myBox; //we declare variable only once
		myBox=135;//assigning value
		
		System.out.println(myBox);//135
		
		myBox=155;//reassigning value
		System.out.println(myBox);//155
		
		// 3 way to create a variable

		int num1, num2, num3; //if variable is of the same type, we can declare all in one line
		num1=10;
		num2=20;
		num3=30;
		
		System.out.println(num3);
		
       //what will be the output?
		
		char char1='C';
		char char2='d';
		
		char char3=char1;
		System.out.println(char3);
		
	}

}
