package com.syntax.ReviewClass08;


public class MethodsExample2 {

    public static void main(String[] args) {

        printNTime("Please Study ",10);
        //break till 8:30

    }

    static void printNTime(String word, int nTimes) {
        for (int i = 0; i < nTimes ; i++) {
            System.out.println(word);
        }


    }
    void printRainInfo(){
        isItRaining(false);
        printNTime("Please Study",15);
    }
    public void isItRaining(boolean isRaining){
        if(isRaining){
            System.out.println("Please take the umbrella");
        }else {
            System.out.println("let's go for a walk");
        }
    }

}

