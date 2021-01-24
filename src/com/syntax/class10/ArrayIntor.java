package com.syntax.class10;

public class ArrayIntor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//I have 5 students in the class and I need to calculate the average score
		
		int [] grades=new int [5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		//double or
		int average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		System.out.println("Average score of my students = "+average);
	
System.out.println("--------------------------------------------------------------------");
int a=10;
int b=10;

double[]num=new double[3];
num[0]=12.99;
num[1]=10.89;
System.out.println("Value of last element "+num[2]);

num[2]=5.99;
System.out.println("Value of last element "+num[2]);

//num[3]=6.99; error out of bound
//System.out.println("Value of las element "+num[3]);
System.out.println("----------------------------------------------------------");

String[] liquid=new String[4];//arrays are fixed in size
liquid[0]="Water";
liquid[1]="Tea";
liquid[2]="Coffee";
liquid[3]="Juice";
System.out.println(liquid[3]);



	}
}
