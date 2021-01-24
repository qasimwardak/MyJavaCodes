package com.syntax.Class14;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        String userName="";
        String password="123Ahm";
        String ConfirmPassword;
        System.out.println("Please Enter username");
        userName=input.nextLine();
        System.out.println("Please Enter password");
        password=input.nextLine();
        System.out.println("Confirm password");
        ConfirmPassword=input.nextLine();

        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("userName and password cant be empty");
        }else {
            if (password.length()<8) {
                System.out.println("Password is too short");
            }else {
                if (password.contains(userName)) {
                    System.out.println("Password cant contain usernaem");
                }else {
                if (!password.equals(ConfirmPassword)) {
                    System.out.println("Passwords doesn't match");
                }else {
                    System.out.println("Your username and password has been succesfully created");
                }
                }

            }
        }

        }
    }

