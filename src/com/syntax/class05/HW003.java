package com.syntax.class05;

import java.util.Scanner;

public class HW003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter 3 distinct numbers");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		double largestnum;
		
		if (num1>num2 && num1>num3) {
			largestnum=num1;
		}else if (num2>num1 && num2>num3) {
			largestnum=num2;
		}else {
			largestnum=num3;
		}
		System.out.println("The largest number is "+largestnum);
		}
	}





