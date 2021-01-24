package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
		String timeOfday="Morning";
		String day="Saturday";
		switch (timeOfday) {
		
		case "Morning":
		System.out.print("Good Morning ");

	    if (day.equalsIgnoreCase("Saturday")) {
	    		System.out.print("Class");
		}
	    break;
	    
		case "Noon":
			System.out.println("Good Noon");
			break;
		case "evening":
			System.out.println("Good evening");
			break;
			default:
			System.out.println("Nothing");
			break;
			
	    }
	
			
		}

	}
