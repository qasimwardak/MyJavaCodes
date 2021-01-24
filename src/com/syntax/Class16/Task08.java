package com.syntax.Class16;


public class Task08 {
	public static void main(String[] args) {
		
		 primeNumber num=new primeNumber ();
		 num.givenNumber=7;
		 primeNumber prime=new primeNumber ();
		 prime.flag=false;
	
			 for (int i=2; i<=num.givenNumber/2; i++) {
		        if (num.givenNumber%i==0) {
		        	prime.flag=true;
		        	break;
		        }
		        i++;
			 }
			 if (!prime.flag)
			 System.out.println(num.givenNumber+" Is a Prime number");
		 else 
		System.out.println(num.givenNumber+" Is not a Prime number");
	
		
	}
}
class primeNumber {
	int givenNumber;
	boolean flag;
}


