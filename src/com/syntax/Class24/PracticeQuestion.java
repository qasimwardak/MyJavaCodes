package com.syntax.Class24;


    class A
    {

    }

    class B extends A
    {

    }

    class C extends B
    {

    }

    public class PracticeQuestion
    {
        static void overloadedMethod(A a)
        {
            System.out.println("ONE");
        }

        static void overloadedMethod(B b)
        {
            System.out.println("TWO");
        }

        static void overloadedMethod(Object obj)
        {
            System.out.println("THREE");
        }

        public static void main(String[] args)
        {
            C c = new C();

            Object object=new Object();
            overloadedMethod(object);
            overloadedMethod(c);
        }
}
