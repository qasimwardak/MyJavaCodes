package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * Variables for allergy yes or no
		 * if allergy is yes -->
		 * we will check if pet allergy
		 *                  if peanut allergy
		 *                  if pollen allergy
		 *                  
		 *                  if no allergy then you are lucky.
		 */
		
		boolean allergy=false;
		if (allergy ) {
			System.out.println("Lets do further check");
		}else {
			System.out.println("you are lucky");
		}
		
		System.out.println("---------------------");
		
		boolean allergy2=true;
		
		boolean petAllergy=false;
		boolean peanutAllergy=true;
		boolean pollenAllergy=false;
		
		if (allergy2) {
			System.out.println("Let's do further check");
	    	}if (petAllergy) {
			System.out.println("No cats or dogs in the house anymore");
	    	}if (peanutAllergy) {
			System.out.println("No more Peanut please!");
	    	}if (pollenAllergy) {
			System.out.println("No more Grass mowing");
		}else {
			System.out.println("You are Lucky");
		}
		
		System.out.println("-----------------------------------------------");
	
	//if todday is friday we will watch a movie but would like to check the date
		/*
		 * if date is 13-->watch scary movie
		 * if its not will watch comedy, action
		 * if not friday---> I am studying
		 * 
		 */
		
		boolean isFriday=true;
		int date=4;
		boolean monday=true;
		
		if (isFriday) {
	    	if (date==13) {
			System.out.println("I will watch scary movie");
	    	}else {
			System.out.println("I will watch PK movie with Amir Khan");
	    	}
	    }else {
			System.out.println("Today is not Friday, I am studying");
		
			if (monday) {
				System.out.println("I am not studying, I am working");
	    	}else {
				System.out.println("I have class at Syntax");
	
			}
		}
		
	
	System.out.println("-----------------------------------------------");
	
	/*check if assignment is completed
	 * if assignment is completed
	 *        if score >90---. great job
	 *        if score >80--->good job
	 *        if score >70----> plese study more
	 */
	
	int score=92;
	boolean assignment=true;
	
	if (assignment) {
		if (score>90) {
	    System.out.println("Great Job!");
		}else if (score>80) {
			System.out.println("Good Job!");
		}else if (score>70) {
			System.out.println("It's ok, but study more");
		}else {
			System.out.println("that is fine but you must study hard");
		}
}else { 
	System.out.println("You shoudl always completer all assignment");
}

}
}


