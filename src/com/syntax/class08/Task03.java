package com.syntax.class08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int a=1; a<=50; a++) {
	if (a%3==0) {
		continue;
	}
		System.out.print(a+" ");
	}

System.out.println("--------------------------------------------------------");

Scanner input=new Scanner (System.in);
String answer;
do {
System.out.println("Do you want to apply for a credit card?");
answer=input.nextLine();

} while (!answer.equalsIgnoreCase("yes"));

System.out.println("Goog Luck");
}
}



	
	

