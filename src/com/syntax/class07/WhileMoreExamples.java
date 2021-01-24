package com.syntax.class07;

public class WhileMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Saturday";
		if (day.equals("Saturday")) {
			System.out.println("My favorite Java class");//1 time print
		}
		while (day.equals("Saturday")) {
			System.out.println("My favorite Java Class");// Infinite
			//to stop
			day="Sunday";
		}
		
		System.out.println("------------------------");
		
		boolean isSaturday=true;
		if (isSaturday ) {
			System.out.println("My favorite Java Class");//1 time
			while (isSaturday) {
				System.out.println("My favorite Java Class");//infinite
				//to stop
				isSaturday=false;
				
			}
		}
		
	}

}
