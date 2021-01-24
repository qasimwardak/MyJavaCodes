package com.syntax.class07;

import java.util.Scanner;

public class WhileLotterry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//play a lottery where we need to number form 1 to 100
		//lucky number is 7
		//keep asking a user to enter a number until entered number is same a lucky number
		
		Scanner input=new Scanner (System.in);
		int luckynumber=7;
		int userNumber;
		
			System.out.println("Please enter any number from 1 to 100");
			userNumber=input.nextInt();
			
		while (userNumber!=luckynumber) {
			System.out.println("Please enter any number from 1 to 100");
			userNumber=input.nextInt();
		}
			System.out.println("You are the Winner");
			
		}

	}
	

