package com.syntax.class05;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		String answer;
		double balance;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter if you have a credit (true/false)");
		answer = scan.next();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("what is the balance on your card");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your card");
			} else {
				System.out.println("You can spend more $$$");
			}
		} else {
			System.out.println("Would you like to get a credit card?");
		}

	}



		
	}


