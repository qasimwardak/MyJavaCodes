package com.syntax.class05;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter the weekday by using numbers");
		int day=input.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("Weekday");
		}else if (day>=6 && day<=7) {
			System.out.println("Weekend");
		
	}else { 
		System.out.println("Invalid day");
		}
	}


		
	}


