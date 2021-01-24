package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter number of years worked");
		int year=input.nextInt();
		
		
		if (year>=5) {
			System.out.println("eligible for the bonus");
			
			System.out.println("Please enter your salary");
			long salary=input.nextLong();
			if (salary>50000) {
			System.out.println("bonus=5000");
			}else {
				System.out.println("bonus=3000");
			}
		}else {
			
			System.out.println("You are not eligible");
			
		}
			
			}
		
			}
		
	
	

