package com.syntax.class03;

public class RelationalAndEqualityOperatiors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		int b=15;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		int x=100;
		int y=90;
		
		
		//result=x>y; error because it s boolean
		boolean result=x>y;
		System.out.println(result);
		
		result=x==y;
		System.out.println(result);
		
		System.out.println("--------");
		System.out.println(x==y);//compare
		System.out.println(x=y);//reassign value
		System.out.println(x);//90
		
		boolean result1=x==y;
		System.out.println(result1);//true because we have reassigned.
		
		byte num=100;
		byte num1=11;
		
		boolean boo=num>=num1;
		System.out.println(boo);
		//we will use them to control our flow
		
		
		
		
		
		
	}
	

}
