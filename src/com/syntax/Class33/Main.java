package com.syntax.Class33;




class Main {
     static String thirdLetter(String s) {
        String ns = "";
        for (int i = 0; i < s.length(); i+=3) {
            ns+=s.charAt(i);
            }
            return ns;
        }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

