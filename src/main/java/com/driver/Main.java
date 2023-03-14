package com.driver;

public class Main {

    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B{
        public String meth(){
            return "Method is overridden in extendend class B";
        }
    }

    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth());
    }
}