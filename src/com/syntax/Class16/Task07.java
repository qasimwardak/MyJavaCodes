package com.syntax.Class16;

import java.util.Scanner;

class Task07 {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		 createEmail emailadd=new createEmail ();
		System.out.println("Please enter your First Name");
		emailadd.firstName=input.nextLine();
		System.out.println("Please enter your Last Name");
		emailadd.lastName=input.nextLine();
		System.out.println("Please enter your Email type");
		emailadd.emailType=input.nextLine();
		System.out.println(emailadd.firstName+emailadd.lastName+"@"+emailadd.emailType+".com");
		
		
		
		
	}
	
		    }
class createEmail {
	String firstName, lastName, emailType;
}

		  
