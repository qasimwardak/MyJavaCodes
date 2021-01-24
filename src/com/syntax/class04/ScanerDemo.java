package com.syntax.class04;

import java.util.Scanner;

public class ScanerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//short cut to import is ctlr+shif+o
		
		
		Scanner scan=new Scanner(System.in);   //waits for your input and once you provide hit enter
		System.out.println("Please enter any text ");
		String Value=scan.nextLine();
		System.out.println("I captured the Value = "+Value);
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
		
		
		
	}

}
