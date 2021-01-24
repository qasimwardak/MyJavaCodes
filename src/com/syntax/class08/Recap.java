package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1;
while (a<=5) { 
	System.out.print(a+" ");
	a++;
}
System.out.println("--------------------------------------");
int b=1;
while (b<=5) { 
	System.out.print(b+" ");
   b++;
}
System.out.println("------------------------------------------------");

Scanner input=new Scanner (System.in);
int money;
int waterPrice=5;
System.out.println("Plese pay for your water");
money=input.nextInt();
while (money!=waterPrice) {
	if (money>waterPrice) {
	System.out.println("This is too much, you need to enter less money");
	//money=input.nextInt();
	}else {
		System.out.println("The water is expensive, please insert more money");
		//money=input.nextInt();
	}
		money=input.nextInt();
	}
	System.out.println("Enjoy your water");
	
}

	}


