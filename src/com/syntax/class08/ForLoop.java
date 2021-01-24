package com.syntax.class08;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * / Good morning 5 times
		 */
		
for (int a=1; a<=5; a++) {
	System.out.println("Good morning");
}
		// 1 to 100 numbers
for (int b=1; b<=100; b++) {
	System.out.print(b+" ");
}
System.out.println("----------------");

		//10 to 0
for (int c=10; c>=0; c--) {
	System.out.print(c+" ");
}
System.out.println("------------------------------------------------");

for (int i=0; i<=30; i+=3) {
	System.out.print(i+" ");
}

	}

}
