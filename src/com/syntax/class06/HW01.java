package com.syntax.class06;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Enter your country");
		String Country=input.nextLine();
		String Language;
		
		switch (Country) {
		
		case "Afghanistan":
			Language="Dari";
			break;
		case "India":
			Language="Hindi";
			break;
		case "Russia":
			Language="Russian";
			break;
		case "USA":
			Language="English";
			break;
		case "France":
			Language="French";
			break;
		case "Saudi Arabic":
			Language="Arabic";
			break;
			default:
				Language="Invalid";
				break;
		}
		System.out.println(Country+" people speaks in "+Language);
			
		}	
	}


