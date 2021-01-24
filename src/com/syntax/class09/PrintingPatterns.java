package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5; i++) {
			System.out.println("*");
		}
		System.out.println("---------------------------------------------");
		
		for (int r=1;  r<=4; r++) {
			for (int c=1; c<=6; c++) {
				System.out.print("*");
			}
			System.out.println();
			}
		System.out.println("----------------------------------------------");
		
		for (int r1=1; r1<=6; r1++) {
			for (int c1=1; c1<=12; c1++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		for (int r2=1; r2<=7; r2++) {
			for (int c2=1; c2<=8; c2++) {
				System.out.print(c2);
			}
			System.out.println();
			}
		System.out.println("-------------------------------------");
		
		
		for (int a=7; a>=1; a--) {
			for (int b=1; b<=7; b++) {
				System.out.print(a);
			}
			System.out.println();
			}
		System.out.println("------------------------------------------");
		
		for (int g=5; g>=1; g--) {
			for (int h=7; h>=1; h--) {
				System.out.print(h);
			}
			System.out.println();
		}
		
		}
		}
		
	


