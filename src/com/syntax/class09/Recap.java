package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<=5; i++) {// outter loop
			System.out.println("Hello");
			System.out.println("-------");
			for (int y=0; y<3; y++) {//inner loop
				System.out.println("Bye");
			}
		}
		
		for (int a=10; a<=90; a++) {
			System.out.println(a+ " ");
		}
		
		for (int b=1; b<=9; b++) {
			for (int c=0; c<=9; c++) {
				System.out.println(b+""+c);
			}
		}
	
		
	
	}

}
