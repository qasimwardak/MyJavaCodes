package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter booolean value for rain");
		boolean rain=input.nextBoolean();
		
		if (rain) {
			System.out.println("Please take an umbrella");
		}else {
			System.out.println("It is nice weather go for a walk");
		}	
			System.out.println("------------Let s Capture integer Value---------------");
			System.out.println("Please enter your name");
			String Fname=input.next();
			String Lname=input.next();
			System.out.println("Please enter your age");
			int age=input.nextInt();
			
			System.out.println("My name is "+Fname+" "+Lname+" and I am "+age+" years old");
			
			
		}
		
	}


