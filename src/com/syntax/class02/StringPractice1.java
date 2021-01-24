package com.syntax.class02;

public class StringPractice1 {

	public static void main(String[] args) {
		
		
		String Name="Ahmad";
		
		//I would like to say : My name is Ahmad
		
	
		System.out.println("My Name is "+Name);
	
		String LastName="Qasim";
		System.out.println(Name+" "+LastName);
		
		String City="Miami";
		System.out.println(Name+" lives in "+City);
		
		char grade='B';
		System.out.println(Name+" is "+grade+" student.");
		
		int age=21;
		System.out.println(Name+" is "+age+" years old");
		
		/*to attach/concatenate any value (char, int, String, double)
		  to a string we use + (string concatenation operator)
		 */
		
		int date=27;
		String month="September";
		System.out.println(date+" "+month);
		
		String state="DC";
		String anotherState=" DC";
		System.out.println(state);
		System.out.println(anotherState);
		
	

	}

}
