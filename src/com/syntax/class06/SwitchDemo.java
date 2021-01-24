package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ask a user which browser they would like to use
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter a browser");
		String browser=input.nextLine();
		String message;
		//browser 
		switch (browser.toLowerCase()){ 
		
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case "chrome":
			message="Your code will be executed on Chrome browser";
			break;
		case "firefox":
			message="Your code will be executed on Firefox browser";
			break;
		default:
			message="Entered browser is not supported";
			break;
		}
		System.out.println(message);
			
		}

	}


