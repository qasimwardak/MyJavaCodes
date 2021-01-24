package com.syntax.class05;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter you quiz score");
		double quiz=input.nextDouble();
		System.out.println("Please enter your mid term score");
		double midTerm=input.nextDouble();
		System.out.println("Please enter your final score");
		double Final=input.nextDouble();
		
		
		double avg=(quiz+midTerm+Final)/3;
		System.out.println(avg);
		

		
		if (avg>=90) {
			System.out.println("Grade=A");
		}else if (avg>=70 && avg<=90) {
			System.out.println("Grade=B");
		}else if (avg>=50 && avg<=70) {
			System.out.println("Grade=C");
		
		}else if (avg<50) {
			System.out.println("Grade=F");
		}
		
		
}
	}
	
	
