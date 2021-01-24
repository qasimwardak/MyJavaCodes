package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
        System.out.println("Do you guys have Sale tody?");
		boolean sale=input.nextBoolean();
		
		if (!sale) { 
			System.out.println("No Shopping");
		}else {
			System.out.println("We will go for shopping");
			System.out.println("Please enter the price");
			double price=input.nextDouble();
			double discount;
			double FinalPrice;
		if (price>=10 && price <50) {
			discount=(price*10)/100;
		}else if (price>=50 && price<100) {
				discount=(price*20)/100;
		}else if (price>=100 && price<500) {
			discount=(price*40)/100;
		}else if (price>=500) {
			discount=(price*50)/100;
		}else {
			discount=0;
		}
		FinalPrice=price-discount;
		System.out.println("Your product price is $"+price+" and you get $"+discount+" dicount and you pay only "+FinalPrice);
		
		
		}
		}
		}
