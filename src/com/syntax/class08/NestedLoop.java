package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=3; i++) {
			System.out.println(i+ "Outter Loop");
			for (int y=0; y<=3; y++) {
				System.out.println(y+" Inner Loop");
			}
		}
	}

}
