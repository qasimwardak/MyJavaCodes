package com.syntax.Class12AndGroupAssignment;

public class ForVsEnhancedFor {

	public static void main(String[] args) {
		
		
int[] num= {10, 20, 30, 1};//num.length=4
		
		for (int i=num.length-1; i>=0; i--) {
			System.out.print(num[i]+" ");
		}

		//we cannot loop backward using enhanced for loop.
		//it starts from the beginning of the loop and stops at the end
		
		

	}

}
