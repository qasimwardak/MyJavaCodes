package com.syntax.class07;

public class WhileSyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while Syntax
		//I want to print 1 to 50
		
		int num=1;
		while (num<51) {System.out.print(num+" ");// prints 0-49
		num++;
		}
		System.out.println("-----------------------------------");
		int a=10;
		while (a<61) {
			System.out.print(a+" ");
			a++;
		}
		
	System.out.println("---------------");
	// 100 to 60
	
	int b=100;
	while (b>=60) {
		System.out.print(b+" ");
		b--;
	}
	
	System.out.println("--------------------");
	//10 to 30 only even numbers
	int c=10;
	while (c<31) {
		if (c%2==0) {
		System.out.print(c+" ");
	}
		c++;
	}	
		System.out.println("---------------");
		//another way
		int d=10;
		while (d<30) {
			System.out.print(d+" ");
			d+=2;
		}
	System.out.println("------------------------------");
	//another way
		 int e=10;
			while (e<31) {
				if (e%2==0) {
					System.out.print(e+" ");
					//e++; // we will get infinite loop
				}
				e++;
			}
		     
		System.out.println("-------------------------");
		
		int f=100;
		while (f>0) {
			if (f%2!=0) {
				System.out.print(f+ " ");
			}
			f--;
		}
		System.out.println("------------------");
		//another way
		int g=99;
		while (g>0) {
				System.out.print(g+" ");
				g-=2;
			}
		}
	}	



