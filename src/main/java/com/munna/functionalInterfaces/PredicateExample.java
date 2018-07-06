package com.munna.functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,8,10,12);
        List<Integer> newIntegers = new ArrayList<>();
        Predicate<Integer> predicate = p -> p > 6;
        Predicate<Integer> integerPredicate = p -> (p%2==0);
        for (Integer integer:integerList) {
            if (predicate.test(integer)){
                newIntegers.add(integer);
            }
        }
        System.out.println(newIntegers);
        //Predicate and() method
        System.out.println("Predicate and() method");
        Predicate andPredicate = predicate.and(integerPredicate);
        integerList.stream().filter(andPredicate).forEach(System.out::println);

        System.out.println("Predicate OR() method");
        Predicate orPredicate = predicate.or(integerPredicate);
        integerList.stream().filter(orPredicate).forEach(System.out::println);

        System.out.println("Predicate negate() method");
        Predicate negatePredicate = orPredicate.negate();
        integerList.stream().filter(negatePredicate).forEach(System.out::println);
        System.out.println("Predicate isEqual() method");
        Predicate isEqualPredicate = Predicate.isEqual(1);
        integerList.stream().filter(isEqualPredicate).forEach(System.out::println);
    }

}
