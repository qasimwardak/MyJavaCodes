package com.syntax.class08;

import java.util.Scanner;

public class RecapDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		int money;
		int waterPrice=5;
		System.out.println("Plese pay for your water");
		
		do {
			money=input.nextInt();
			if (money>waterPrice) {
			System.out.println("This is too much, you need to enter more money");
			}else if (money<waterPrice) {
				System.out.println("The water is expensive, please insert more money");
			}
				//money=input.nextInt();
		}while (money!=waterPrice);
			
			System.out.println("Enjoy your water");
}
}                                                                                                                                   
	

