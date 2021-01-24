package com.syntax.class07;

public class WhileVsDowWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------------While Loop-----------------------");
		int a=20;
		while (a>15) {
			System.out.println("Hello");
			a--;
		}
		System.out.println("-----------------Do while Loop---------------");
		int b=20;
		//first do smth
		do {
			System.out.println("Hi");
			b++;
		}while (b<15); //then check condition
	
	System.out.println("------------------------------------------------");
	
	
	int g=10;
	do {
        System.out.println(g);
		g++;
	}
	while(g<=20);
		}
	}


