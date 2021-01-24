package com.syntax.class10;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] Animals= {"Lion", "Tiger", "Wolf", "Deer", "Dog", "Cat"};
		for (String a:Animals) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("------------------Print another way--------------------");
		
		int size=Animals.length;
		for (int a=0; a<Animals.length; a++) {
			System.out.print(Animals[a]+" ");
		}
	}

}
