package com.syntax.class09;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = new int [5];
		num[0]=10;//each one called element
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		// to access elements 
		System.out.println(num[2]);
		System.out.println(num[1]+num[4]);
		num[4]=100;
		System.out.println(num[4]);
		
		
		String [] Greeting=new String[4];
		Greeting [0]="Hello";
		Greeting [1]="How are you?";
		Greeting [2]="How is your family?";
		Greeting [3]="How is going?";
		System.out.println(Greeting[3]);
		
		
		
	}

}
