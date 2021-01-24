package com.syntax.class08;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter a start up number");
		int a=input.nextInt();
		System.out.println("Please enter an end up number");
		int b=input.nextInt();
		int res1=0;
		int res2=0;
		
		for (int i=a; i<=b; i++) {
			if (i%2==0) {
				res1+=i;
				
			}if (i%2!=0) {
				res2+=i;
			}
		}
			System.out.println(" Result 1 is "+res1);
			System.out.println(" Result 2 is "+res2);	
				
			}
		}
