package com.munna.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class ConsumerExample {

    public void printList(List<Integer> integers,Consumer<Integer> list){
        for (Integer integer:integers) {
            list.accept(integer);
        }

    }
    Consumer<Integer> integerConsumer1 = integer -> System.out.println(integer);
    Consumer<Integer> integerConsumer2 = integer -> System.out.println(integer*10);

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        ConsumerExample consumerExample =new ConsumerExample();
        consumerExample.printList(integerList,integer -> System.out.println(integer));
        System.out.println("andThen() example");
        integerList.forEach(new ConsumerExample().integerConsumer1.andThen(new ConsumerExample().integerConsumer2));
        //DoubleConsumer Example
        System.out.println("DoubleConsumer ");
        DoubleConsumer doubleConsumer = a-> System.out.println(a);
        doubleConsumer.accept(20);
        DoubleConsumer doubleConsumer1 = a -> System.out.println(a*10);
        doubleConsumer.andThen(doubleConsumer1).accept(10);
        //IntConsumer Example
        IntConsumer intConsumer = a -> System.out.println(a);
        intConsumer.accept(10);
        //LongConsumer Example
        LongConsumer longConsumer = a -> System.out.println(a);
        longConsumer.accept(10l);
        //ObjDoubleConsumer
        ObjDoubleConsumer<Double> objDoubleConsumer = (a,b) -> System.out.println(a+b);
        objDoubleConsumer.accept(10.8,20);
        BiConsumer<Integer,Double> biConsumer = (a,b) ->System.out.println(a.doubleValue()+b);
        biConsumer.accept(10,20.45d);


        ObjDoubleConsumer<String> objDoubleConsumer1 = (a,b) -> System.out.println(a+b);
        objDoubleConsumer1.accept("this is String",20);

    }
}
