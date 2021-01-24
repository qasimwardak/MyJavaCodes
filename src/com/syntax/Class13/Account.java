package com.syntax.Class13;

public class Account {

    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;
    boolean isBlocked;

    boolean login(String userName, String password) {
        if (userName.equals(userName) && password.equals(password)) {
            return true;
        } else {
            return false;
        }
        }
        double amountTransfer ( double amountToTransfer){
            if (amountToTransfer < balance) {
                return balance = balance - amountToTransfer;
            } else {
                return 0;
            }

        }
    }
