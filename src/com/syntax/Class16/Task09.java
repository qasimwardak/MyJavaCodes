package com.syntax.Class16;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner (System.in);
System.out.println("Please enter your Score");
getGrade number=new getGrade ();
number.score=input.nextInt();
getGrade result=new getGrade ();
result.grade=0;
if (number.score>=90 && number.score<=100) {
	result.grade='A';
}else if (number.score>=80 && number.score<90) {
	result.grade='B';
}else if (number.score>=70 && number.score<80) {
	result.grade='C';
}else if (number.score>=50 && number.score<70) {
	result.grade='D';
}else {
	result.grade='F';
	
}
System.out.println(result.grade);
	}
}

	
class getGrade {
	double score;
	char grade;
}

