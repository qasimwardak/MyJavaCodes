package com.syntax.class11;

public class LargestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// which is the largest num in array
		
		int array [] = {10, 0, 20, 8, -1, 77, 56};
		int Max=array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i]>Max) {
				Max=array[i];
			}
		}
		System.out.println("The largest number from an array is "+Max);
	
	}
	
}

