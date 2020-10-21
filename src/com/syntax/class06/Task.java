package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * we are thinking of going shopping: first we check is store has sale: if no
		 * sale--> no shopping if sale-->we go for shopping ask for the price:
		 * 
		 * if price >50%-->we give 10% discount if price is between 50 and 100-->20%
		 * discount if price is between 100-500-->40%discount if price is more than
		 * 500-->50% discount Your program should calculate the final price that you
		 * will after discount!
		 */
		boolean sale;
		Scanner input;
		double price, discount, finalPrice;

		input = new Scanner(System.in);
		System.out.println("If there any store with sales?");
		sale = input.nextBoolean();

		if (!sale) {
			System.out.println("We are not going shopping");
		}else {
			
			System.out.println("Please enter the price");
			price = input.nextDouble();
			if (price >= 10 && price < 50) {
				discount = price * 0.1;
			} else if (price >= 50 && price < 100) {
				discount = price * 0.2;
			} else if (price >= 100 && price < 500) {
				discount = price * 0.4;
			} else if (price >= 500) {
				discount = price * 0.5;
			}else {
				discount=0;
			}
			finalPrice=price-discount;
			System.out.println("Your product price is $" + price + " and you will get $" + discount
					+ " you final price will be " + (finalPrice));
		
		}
	}
}