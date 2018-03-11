package com.munna.defaultmethods;

public class InterfaceAImpl implements IntefaceA{
    //we can use as is of the interface method impl

    /* we can override default method
    @Override
    public void method_1() {
        System.out.println("i am from method_1() of InterfaceImpl class");
    }*/


    public static void main(String[] args) {
       // new InterfaceAImpl().method_1();
        System.out.println("this is main method()");
        IntefaceA.staticMethod();
    }
}
