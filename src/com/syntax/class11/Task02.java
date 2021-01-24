package com.syntax.class11;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String[][] cars= {
				
				{"Jeep", "Ford", "Dodge"},
				{"Audi", "Porsche", "BMW"},
				{"Kia", "Hyundai", "Hyundai sonata"},
				{"Ferrari", "Maserati", "Lamborghini"},
				
		};
	
		for(String[] carArray:cars) {
			
			for(String car:carArray) {
				
				System.out.print(car+"    ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------another way------------------------------------");
		
		for(int i=0; i<cars.length; i++) {
			
			for (int j=0; j<cars[i].length; j++) {
				
				String car=cars[i][j];
				System.out.print(car+"     ");
			}
			System.out.println();
		}
		
		
	}

}
