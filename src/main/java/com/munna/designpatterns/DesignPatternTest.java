package com.munna.designpatterns;

public class DesignPatternTest {
    public static void main(String[] args) {
        SizeRange sizeRange =  SizeRange.builder()
               .id(100)
                .name("munna")
                .age(25)
                .size(10000)
                .build();
        System.out.println(sizeRange.toString());
        System.out.println(sizeRange.getAge());

    }
}
