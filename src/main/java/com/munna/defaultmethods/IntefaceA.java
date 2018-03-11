package com.munna.defaultmethods;

public interface IntefaceA {
    public static void staticMethod(){
        System.out.println("i am from static");
    }
    default void method_1(){
        System.out.println("i am from default method_1 of InterfaceA");
    }
}
