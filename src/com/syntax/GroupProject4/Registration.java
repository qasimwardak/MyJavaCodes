package com.syntax.GroupProject4;

public class Registration {
    private static String email;
    private static String userName;
    private static String password;
    public static void main(String[] args) {
        Registration main = new Registration();
        main.email = "qasim.wardak@yahoo.com";
        main.userName = "ahmadqasim";
        main.password = "kjljuhu76";
        if (!main.email.contains("yahoo")) {
            System.out.println("The email should be yahoo");
        } else {
            System.out.println(main.email);
            if (main.userName.isEmpty()) {
                System.out.println("your userName cant be empty");
            } else {
                System.out.println(main.userName);
                if (main.password.isEmpty()) {
                    System.out.println("your password cant be empty");
                } else if (main.password.length()<6) {
                    System.out.println("your password length should be larger than 6 characters ");
                } else if (main.password.contains(userName)) {
                    System.out.println("your password cant be same or contain your userName");
                } else {
                    System.out.println("your account has been successfully created");
                }
            }
        }
    }
}


