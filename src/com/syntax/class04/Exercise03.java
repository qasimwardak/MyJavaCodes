package com.syntax.class04;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ahmad=new Scanner(System.in);
		System.out.println("what is the amount of your loan?");
		long amount=ahmad.nextInt();
		long loan=100000;
		
			if (loan<=200000) {
				System.out.println("You would lend the money");
			}else {
				System.out.println("You would reject the client");
				
		
			}
		}
		
	}
		
	


