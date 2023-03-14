package com.driver.test;

class A{

    public String meth(){

        return "this is a string";

    }
}
class B{
    public String meth(){

        return "Method is overridden in extendend class B";
    }
    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth());
        System.out.println(objB.meth());
    }
}
