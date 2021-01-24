package com.syntax.class06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter a grade by using ABC alphabet");
		char grade=input.next().charAt(0);
		String result;
	
		
		switch (grade) {
		case 'A':
			result="Excellent";
			break;
		case 'B':
			result="Good";
			break;
		case 'C':
			result="Average";
			break;
		case 'D':
			result="Bad";
		break;
		default:
			result="Not acceptable";
			break;
		}
		System.out.println(result);
		
		}

		}
		
	

