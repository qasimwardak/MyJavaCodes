package com.syntax.class07;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean workday=true;
	int day=1;

		while (workday) {
			if (day<=6) {
			System.out.println("I need a day off");
			}else {
				System.out.println("Its weekend and I am off");
				workday=false;
			}
			day++;
		
		
	}
	}
}
