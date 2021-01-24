package com.syntax.class03;

public class PrimitivCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 //converting 1 type to another
		//2 types of casting
		//widening  - Implicit or automatic
		//byte-short-int-long-float-double
		
		//narrrowing - amaual
		//double-float-long-int-short-byte
		
		double d=12/7;
		System.out.println(d);
		
		double e=9;
		System.out.println(e);//Widening
		
		//int num=9.89;error
		
		
		int i=(int)9.99;//Narrowing
		System.out.println(i);
		//problem
		byte b=(byte)130;
		System.out.println(b);//narrowing
		
		
		
	
		
	}

}
