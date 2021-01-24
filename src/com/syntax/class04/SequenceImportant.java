package com.syntax.class04;

public class SequenceImportant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//top to bottom exection that is why we study more
		
		
		int score=85;
		boolean assignment=true;
		
		if (assignment) {
			if (score>90) {
		    System.out.println("Great Job!");
			}else if (score>70) {
				System.out.println("It's ok, but study more");
			}else if (score>80) {
				System.out.println("Good Job!");
			}else {
				System.out.println("that is fine but you must study hard");
			}
	}else { 
		System.out.println("You shoudl always completer all assignment");
	}
		
	}

}
