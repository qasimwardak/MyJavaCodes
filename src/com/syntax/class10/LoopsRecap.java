package com.syntax.class10;

public class LoopsRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean condition=true;
		while (condition) {
			System.out.println("I am while loop");
			for (int i=1; i<8; i++) {
				System.out.println("I a for loop");
			}
			break;
		
			}
		System.out.println("--------------------------------------------------");
		for (int a=1; a<=3; a++) {
			System.out.println("I am for loop");
			while (condition) {
				System.out.println("I am a while loop");
				break;
			}
		}
		}
	}


