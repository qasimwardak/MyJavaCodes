package com.syntax.class06;

import java.util.Scanner;

public class HW02Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter two numbers");
		System.out.println("Enter first number");
		double num1=input.nextDouble();
		System.out.println("Please enter the Math operations you want to take place");
		char Operation=input.next().charAt(0);
        System.out.println("Enter second number");
		double num2=input.nextDouble();
		double result;
		double Result=0;
		if (Operation=='+') {
			Result=(result=num1+num2);
		}else if (Operation=='-') {
				Result=(result=num1-num2);
		}else if (Operation=='*') {
				Result=(result=num1*num2);
		} else if (Operation=='/') {
				Result=(result=num1/num2);
			
		}else {
			System.out.println("Error");
		}	
		System.out.println("The Operation Result is "+Result);
		}		
	}

