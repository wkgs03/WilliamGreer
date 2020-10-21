package com.syntax.class04;

public class ValuesofMortgage {

	public static void main(String[] args) {
		double rate = 4.6;
		int price = 20000;
		
		if (rate > 4.5) {
			System.out.println("User will not buy a house");
		} else {
			System.out.println("User will consider buying");
			if (price > 200000) {
				System.out.println("User will take a loan");
			} else {
				System.out.println("User will pay cash");
			}

}
}
}
