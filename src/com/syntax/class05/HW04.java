package com.syntax.class05;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter the amount of sales");
		double sales=input.nextDouble();
		double Comission;
		
		if (sales>10 && sales<100) {
		Comission=(sales*10)/100;
	}else if (sales>100 && sales<200) {
		Comission=(sales*20)/100;
	}else if (sales>200 && sales<500) {
	    Comission=(sales*30)/100;
	}else if (sales>500) {
		Comission=(sales*50)/100;
} else {
	Comission=0;
	}
		System.out.println("The Comission is "+Comission);
}

}

