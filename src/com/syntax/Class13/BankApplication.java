package com.syntax.Class13;

import java.sql.SQLOutput;

public class BankApplication {
    public static void main(String[] args) {
        Account qasimAccount = new Account();
        qasimAccount.accountId = "123";
        qasimAccount.userName = "Qasim";
        qasimAccount.password = "qasim123";
        qasimAccount.balance = 100000000;
        qasimAccount.typeOfAccount = "Checking";
        qasimAccount.limit = 125;
        boolean isLoggedIn = qasimAccount.login("Qsim", "qasim123");
        if (isLoggedIn) {
            System.out.println("Welcome to Syntax bank");
        } else {
            System.out.println("Invalid user name or password");
        }

        double amountToTransfer = qasimAccount.amountTransfer(100);
        if (amountToTransfer == 0) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println(amountToTransfer + " Transferred");
        }
    }
}


