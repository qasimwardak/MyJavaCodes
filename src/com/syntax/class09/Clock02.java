package com.syntax.class09;

public class Clock02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {
				
				if (h<10 && m<10) {
					System.out.println("0" + h + ":0" + m);
					
				}else if (h<10 && m>10) {
					System.out.println("0" + h + ":" + m);
				}
			}		
			}
		}
		}


