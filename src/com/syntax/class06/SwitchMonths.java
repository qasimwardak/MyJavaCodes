package com.syntax.class06;

import java.util.Scanner;

public class SwitchMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Input a number between 1-12");
		int month=input.nextInt();
		String Month;
switch (month) {// //break is optional since our case is at the end.
		
		case 1:
			Month="January";
			break;
		case 2:
			Month="February";
			break;
		case 3:
			Month="March";
			break;
		case 4:
			Month="April";
			break;
		case 5:
			Month="May";
			break;
		case 6:
			Month="June";
			break;
		case 7:
			Month="July";
			break;
		case 8:
			Month="August";
			break;
		case 9:
			Month="September";
			break;
		case 10:
			Month="October";
			break;
		case 11:
			Month="November";
			break;
		case 12:
			Month="December";
			break;
		
		default:
			Month="Invalid";
			break;
		}
		System.out.println(Month);
		
	}

}
