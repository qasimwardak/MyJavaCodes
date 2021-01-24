package com.syntax.class08;

import java.util.Scanner;

public class Task02Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input=new Scanner (System.in);
		 System.out.println("Please enter which number");
		 
			int num1=input.nextInt();
		
			int mult;
			for (int i=1; i<=10; i++) {
				mult=num1*i;
				System.out.println(num1+" x "+i+" = "+mult);
				
				System.out.println("----------------------------------------------");
			}
			
	}
	}

