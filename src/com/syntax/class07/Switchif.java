package com.syntax.class07;

public class Switchif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String timeOfday="Morning";
		String day="Saturday";
		switch (timeOfday) {
		
		case "Morning":
		System.out.print("Good Morning ");

	    switch (day)  {
	    case "Saturday":
	    		System.out.print("JAVA Class");
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
