package com.syntax.class08;

public class Task01 {

	public static void main(String[] args) {
		
		for (int i=20; i>0; i-- ) 
			if (i%2==0) {
				System.out.print(i+" ");
			}
		System.out.println("----------------------------------------");
		for (int x=20; x>=1; x-=2) {
			System.out.print(x+" ");
		}
		System.out.println("----------------------------------------");
		
		for (int g=20; g<=50; g++) {
			if (g%2!=0) {
				System.out.print(g+" ");
			}
			}
			System.out.println("----------------------------------------");
			
			for (int h=21; h<=50; h+=2) {
				System.out.print(h+" ");
			}
				System.out.println("----------------------------------------");
				
				int sum=0;
				for (int i=1; i<6; i++) {
					sum=sum+1;
				
				System.out.print(sum+" ");
	}
	System.out.println("----------------------------------------");
	
		int result=1;
		for (int m=10; m>=1; m-=2) {
			result*=m;
		}
		System.out.println(result);//10, 80, 480, 1920, 3840
		
		
		// TODO Auto-generated method stub
for (int a=1; a<=100; a++) {
	System.out.print(a+" ");
}
System.out.println("----------------------------------------");
for (int b=100; b>=1; b--) {
	System.out.print(b+" ");
}
System.out.println("----------------------------------------");
for (int c=20; c>=1; c-=2) {
		System.out.print(c+" ");	

}
System.out.println("another way");
for (int d=20; d>=1;) {
	if (d%2==0) {
		System.out.print(d+" ");
	}
	d-=2;
}
		}	
}
	

	


