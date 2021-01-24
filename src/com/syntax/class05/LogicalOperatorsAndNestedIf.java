package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorsAndNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Logical && and 
		 * if (true && true)=TRUE
		 * if (true && false)=FALSE
		 * if (false && true)=FALSE
		 * if (false && false)=FALSE
		 * 
		 */
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter any number");
		int number=input.nextInt();
		
		if (number>0 && number<=10) {
			System.out.println("You entered small number");
		}else if (number>10 && number<=100) {
			System.out.println("You entered medium number");
		}else if (number>100 && number<=1000) {
			System.out.println("You entered large number");
		}
		
	
		
	}

}
