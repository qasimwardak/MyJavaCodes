package com.syntax.class07;

import java.util.Scanner;

public class ScannerWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask user what is his name 5 times --> print hello+name
		Scanner input=new Scanner (System.in);
		int number=1;
		while (number<=5) {
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Nice to meet you"+name);
		System.out.println("---------------------------------");
		number++;
		}
		
		
		
		
	}

}
