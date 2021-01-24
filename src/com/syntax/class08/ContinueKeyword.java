package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print 1 to 5 except number 3
		
		for (int i=1; i<=5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("End of the Loop");
		
		//1 t0 10 except 3 and 7
		
		System.out.println("----------------");
		
		for (int a=1; a<=10; a++ ) {
			if (a==3 || a==7) {
				continue;
			}
			System.out.println(a);
				
			}
		}
	}
	
