package com.syntax.class03;

public class AdditionVsConcatation {
	
	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Friends";
		
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		System.out.println(x+y+a+b);
	    System.out.println(x+y+(a+b));
	    
	    
	}


	}


