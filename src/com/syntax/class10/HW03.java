package com.syntax.class10;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner (System.in);
System.out.println("Please enter how many numbers do you want store?");
int size=input.nextInt();
double [] numbers=new double [size];
for (int a=0; a<size; a++) {
	System.out.println("Please any numbers");
	numbers[a]=input.nextDouble();
}
double sum=0;
for (double num: numbers) {
	sum=sum+num;
}
System.out.println(sum);
	
}
}

