package com.syntax.Class15;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter Mom's First name");
        String MomFname=input.nextLine();
        System.out.println("Please enter Dad's First name");
        String DadFname=input.nextLine();
        System.out.println("Are you Expectiong a girl or a boy?");
        String Gender=input.nextLine();
        if (Gender.equalsIgnoreCase("boy")) {
            System.out.println(DadFname.substring(0,DadFname.length()/2) + MomFname.substring(MomFname.length()/2));
        }else{
            if (Gender.equalsIgnoreCase("girl")) {
                System.out.println(MomFname.substring(0, MomFname.length() / 2) + DadFname.substring(DadFname.length() / 2));
            }else {
                System.out.println("No Suggestion");
            }
        }
    }
}
