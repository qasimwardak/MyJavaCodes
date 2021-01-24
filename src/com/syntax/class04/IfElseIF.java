package com.syntax.class04;

public class IfElseIF {

	public static void main(String[] args) {
		
		
		//compare 2 numbers 
		//bigger, smaller or equal
		
		int num1=19;
		int num2=99;
		
		if (num1>num2) {
			System.out.println(num1+" is bigger than +num2");
		}else if (num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equalto "+num2);
			
		}

		/* Based on the day do the week we will print class schedule 
		 * 
		 */
	System.out.println("________________--------------_______-___-_---_-_-");
		int day=4;
				
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
	}
}
