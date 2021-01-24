package com.syntax.class11;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] [] $array=new char [3][4];
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		//2nd row
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='W';
		//3rd row
		$array[2][0]='O';
		$array[2][1]='W';
		$array[2][2]='B';
		$array[2][3]='R';
		System.out.println($array[1][3]);
	
	System.out.println("---------------------another way to create a 2D array-----------------------");
	
	int [][] array= {
			{10, 20, 30},
			{1, 2, 3},
			{100, 200, 300}
	};
	System.out.println(array[2][1]);
	System.out.println(array[0][0]);
	System.out.println("The size of array of integers = "+array.length);
	
	}	
}
