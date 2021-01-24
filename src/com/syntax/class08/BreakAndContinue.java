package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//break
		
		for (int i=1; i<=4; i++) {
			System.out.println("Hello");
			break;
		}
		
		// 1 to 10
		// when number is 5 want to break from the loop
		
		for (int b=1; b<=10; b++) {
			if (b==5) {
				break;
			}
				 System.out.print(b+" ");
			}
		
		System.out.println("-------------");
		
		int day=1;
		boolean workday=true;
		while (workday) {
			if (day<=5) {
				System.out.println("I need a day off");
			
			}else {
				System.out.println("Its weekend");
				break;
			}
			day++;
			}
		}
}
	


