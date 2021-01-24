package com.syntax.Class29;


    public class StudentNew implements PrintInfo,PayFee {

        @Override
        public void printName() {
            System.out.println("Mohammad");
        }

        @Override
        public void printPhoneNumber() {
            System.out.println("123456789");
        }

        @Override
        public void printAddress() {

            System.out.println(" bla bla bla USA");
        }

        @Override
        public void payFee() {
            System.out.println("Paid");
        }
}
