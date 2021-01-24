package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		//Loops will help us to void repetitive execution
		
		//while loop:
		
		int time=15;
		if (time>12) {
			System.out.println("Good day"); //1 time print
	//	} while (time>12) {
			//System.out.println("Good day");// unlimited prints
			
			System.out.println("------------------------------------");
		//} while (time>12) {
		//	System.out.println("Good day");// 3 times
			//time--;
		}
		
System.out.println("---------------------------------------------");
	 while (time>12) {
		System.out.println("Good day");// infinite loop
		time++;
	}
	}

}
