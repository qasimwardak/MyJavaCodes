package com.syntax.class04;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userIn=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		
		int num1 = userIn.nextInt();
		int num2 = userIn.nextInt();
		int num3 = userIn.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("The largest number is "+num1);
			 }
		
      	} if (num2>num1) {
			    if (num2>num3) {
				System.out.println("The largest numnber is "+num2);
			}    
         } if(num3>=num1) { 
			    if (num3>num2) {
				System.out.println("The largest number is "+num3);
            }
         }else {
	        	System.out.println("The numbers are equal");
		    }
	}	

}
