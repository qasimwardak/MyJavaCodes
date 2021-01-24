package com.syntax.class05;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input;
		String month;
		input=new Scanner (System.in);
		System.out.println("Please enter your birth month");
		month=input.nextLine();
		String Season;
		
		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			Season="Summer";
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			Season="Fall";
		}else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Febraury")) {
			Season="Winter";
		}else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			Season="Spring";
		}else {
			Season="Invalid month";
		}
		System.out.println(Season);
			
		}
	}
	

