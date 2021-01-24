package com.syntax.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter the weekday by using numbers");
		int height=input.nextInt();
		
		if (height<60) {
			System.out.println("Short");
		}else if (height>=60 && height<=72) {
			System.out.println("Medium");
		}else if (height>70) {
			System.out.println("Tall");
		
	}else { 
		System.out.println("Invalid entry");
		}
	}

}
