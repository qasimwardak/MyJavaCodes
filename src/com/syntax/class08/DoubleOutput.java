package com.syntax.class08;

import java.util.Scanner;

public class DoubleOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("Int: ");
		int num=input.nextInt();
		
		for (int a=num-1; a>=0; a--) {
			if (num>0) {
				System.out.print(a+" ");
			}
	}
	}

}