package com.syntax.class08;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String response;

		do {

			System.out.println("Do you want to apply for credit card ");
			response = scan.nextLine();

		} while (!response.equalsIgnoreCase("yes"));

		System.out.println("You are selected ");
		
	}

}
