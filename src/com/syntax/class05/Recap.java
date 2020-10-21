package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		//I want to capture sentence:
		System.out.println("Please enter any sentence");
		String sentence=scanner.nextLine();
		
		System.out.println("You entered sentence: "+sentence);
		
		//I want to capture 1 number
		System.out.println("Please entered a number");
		int number=scanner.nextInt();
		System.out.println("You entered number: "+number);
		
		//I want to capture 1 word
		System.out.println("Please enter any word");
		String word=scanner.next();
		System.out.println("You entered number: "+word);
		
		//I want to capture 1 character
		System.out.println("Please enter any character");
		char singleCharacter=scanner.next().charAt(0);
		System.out.println("You entered number: "+singleCharacter);

	}

}
