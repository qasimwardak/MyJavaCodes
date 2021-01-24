package com.syntax.class08;

import java.util.Scanner;

public class ScannerForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter any number");
		int num=input.nextInt();
		
		for (int a=0; a<=num-1; a++) {
				System.out.print(a+" ");
			}
		
	}

}
