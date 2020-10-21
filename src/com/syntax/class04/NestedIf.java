package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * Variable for allergy -yes or no
		 * 
		 * if allergy is yes--> we will check if pet allergy if peanut allergy if pollen
		 * allergy if no allergy you are lucky
		 */

		boolean allergy = false;

		boolean petAllergy = true;

		if (allergy) {
			System.out.println("Lest's do further check");
			if (petAllergy) {
				System.out.println("Please no cats or dogs on the house");
			} else {
				System.out.println("That is good you do not have pet allergy");
			}

		} else {
			System.out.println("You are lucky");

			System.out.println("__________________________________________________EXAMPLE 2");

			/*
			 * it today is Friday we will watch movie but would like to check the date If
			 * date is 13 --> watching scary movie and if it is not--> I will watch comedy,
			 * action
			 * 
			 * If no Friday---> I am studying
			 */

			boolean isFriday = false;
			int date = 13;
			boolean Monday= false;
			if(isFriday) {
				if(date==13) {
					System.out.println("I will watch a scary movie");
				}else {
					System.out.println("I will watch PK movie with Amir Khan");
				}
				
			}else {
		if(Monday) {
			System.out.println("I am not studing, I am working");
		}else {
			System.out.println("I have class at Syntax");
		}
			}
		}
	}
			
			 

		}

	



