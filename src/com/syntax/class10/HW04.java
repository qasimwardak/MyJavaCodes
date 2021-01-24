package com.syntax.class10;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] Country=new String [5];
Country[0]="Afghanistan";
Country[1]="United States";
Country[2]="Turkey";
Country[3]="Iran";
Country[4]="Iraq";

int size=Country.length;

for (int a=0; a<Country.length; a++) {
	System.out.print(Country[a]+" ");
}
System.out.println();
System.out.println("-----------------Second way------------------------");

		String [] Capital= {"Kabul", "Washington D.C", "Ankara", "Tehran", "Baghdad"};
		for (String Capital1:Capital) {
			System.out.print(Capital1+" ");
		}
	}	
	}