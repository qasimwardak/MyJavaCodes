package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
	System.out.println("Please enter a day number");
	int day=input.nextInt();
		
		if (day==1) {
			System.out.println("Today is Monday so we have no class");
		}else if (day==2) {
			System.out.println("Today is Tuesday so we have Manual class");
		}else if (day==3) {
			System.out.println("Today is Wednesday and we have Manual  class again");
    	}else if (day==4) {
		System.out.println("Today is Thursday so I have Java Review Class");
    	}else if (day==5) {
    		System.out.println("Today is Friday and I have no class");
    	}else if (day==6) {
    		System.out.println("Today is Saturday and I have Java class");
    	}else if (day==7) {
    		System.out.println("Today is Sunday and I have Java Class");
    	}else {
		System.out.println("Today is invalid day");
		
	}
		System.out.println("-----------SAME EXAMPLE USING SWITCH CASE--------------");
		String today;
		
		
		switch (day) {//data type of variable must match with datatype of cases
		
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
		default:
			today="Invalid day";
			break;
		}
		System.out.println("Today is "+today);
		
		}
	}
	
