package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {

		String day="Sunday";
		if (day.equals("Saturday") || day.equals("Sunday")); {
		System.out.println("Today I have Java Class at Syntax");	
		}
			System.out.println("The End");
			
			System.out.println("----------------");
			
			/*
			 * if day is 1 or 5 =  I am off from Syntax
			 * if day 2 or 3 = GIT class
			 * if day 4 = review class
			 * if day 6 or 7 = Java class
			 * others = invalid day
			 * 
			 */
		
			Scanner input=new Scanner (System.in);
			System.out.println("Please enter what day is today by using numbers");
			int today=input.nextInt();
			
			if (today==1 || today==5) {
				System.out.println("I am off from Syntax");
			}else if (today==2 || today==3) {
			System.out.println("Today I have GIT Class");
	      }else if (today==4) {
	    	  System.out.println("Today I have review is Class");
	      }else if (today==6 || today==7) {
			System.out.println("Today I have Java Class");
	      
      }else {
	System.out.println("Invalid Day");
	      }
}
}
