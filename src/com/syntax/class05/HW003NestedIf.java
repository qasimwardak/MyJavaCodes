package com.syntax.class05;

import java.util.Scanner;

public class HW003NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int LargestNum;
		
		if (num1>num2) { 
			if (num1>num3) {
			LargestNum=num1;
			}else { 
			LargestNum=num3;
			}
		}else {
			   if (num2>num3) {
					LargestNum=num2;
				}else {
					LargestNum=num3;
					
				}
		}
					System.out.println("The largest number is "+LargestNum);
				}
				}
	

	



