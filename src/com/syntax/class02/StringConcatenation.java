package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {

		String name = "Olga";

		// I would like to say; My name is Olga

		System.out.println("My name is " + name);
        
		String lastName=" Sorrels";
		
		System.out.println("My name is "+name+lastName);

		String city="Miami";
		// Olga lives in Miami
		
		System.out.println(name+" "+ "lives in" +" "+city);
		
		char grade='B';
		//Olga is a B student
		
		System.out.println(name+" "+"is a"+" "+grade+" "+"student");
		
		int age=21;
		//Olga is 21 years old
		
		System.out.println(name+" is "+age +" "+"years old");
		//to attach/concatenate ANY value (char, int, string, double) to a string we use + (String concatenation operator)
		
		int date=29;
		//29 september
		String month="september";
		System.out.println(date+" "+month);
		
		String state="DC";
		String anotherState="DC ";
		//above Strings are not equal, state has 2 characters and anotherState has 3 Characters
		
		
	}

}
