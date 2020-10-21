package com.syntax.class06;

import java.util.Scanner;

public class CalculatorTask {

	public static void main(String[] args) {
		Scanner input;
		char operator;
		int num1;
		int num2;
		int result;
input=new Scanner(System.in);
System.out.println("Enter two numbers");
num1=input.nextInt();
num2=input.nextInt();
System.out.println("Please enter what type of mathematical operations would you like to use(+, -, / or *)");
operator=input.next().charAt(0);
result=num1+operator+num2;
System.out.println(result);

	}

}
