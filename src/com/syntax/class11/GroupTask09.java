package com.syntax.class11;

public class GroupTask09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total=0;
		String[][] country={
			{"Argentina", "Bolivia", "Brazil", "Chile","Colombia"},
			{"Cuba","Dominica","Dominican Republic", "El Salvador,"},
			{"Croatia","Cyprus","Czechia","Denmark","Estonia"},
			{"China","China","Japan","Mongolia","Republic of Korea"},
			{"Tanzania","Togo","Tunisia","Uganda","Zambia"},
		};
			
		for(int i=0; i<country.length; i++) {
			for(int j=0; j<country[i].length; j++) {
				total=country[i].length+country[j].length;
				System.out.println(total);
			}
		
				System.out.println("-------second way-------------");
			
			for (String[] counts:country) {
				for (String count:counts) {
				total++;
}
}
		}
	}
}

