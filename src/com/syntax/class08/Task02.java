package com.syntax.class08;


public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumO=0;
		int sumE=0;
		
		for (int n = 1; n < 51; n++) {
			
		    if (n%2 == 0) {
		        sumE+= n;
		    }else {
		        sumO+= n ;
		    }
		}
		System.out.println("The sum of even number from 1 to 50 is " + sumE);
		System.out.println("The sum of even number from 1 to 50 is " + sumO);
	

	
	System.out.println("-----------------------------------------");

			
			//I want to create a multiplication table
			/*
			 *1x1=1
			 *1x2=2
			 *1x3=3
			 *
			 */
			int num1=1;
			int mult;
			
			for (int i=1; i<=10; i++) {
				
				mult=num1*i;
				System.out.println(num1+" x "+i+" = "+mult);
			}
				System.out.println("-----------------------------------------");
				
				int multi=0;
				int num3=3;
				for (int a=1; a<=10; a++) {
					multi=num3*a;
						System.out.println(a+"x"+num3+"="+multi);
}	
				System.out.println("----------------------------------------------");
				
				 int num=3;
					
					for(int j=1; j<=10; j++) {
						System.out.println(num+"*"+j+"="+num*j);
					}
}
}


