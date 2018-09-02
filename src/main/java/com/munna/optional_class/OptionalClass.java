package com.munna.optional_class;

import com.munna.util.Employee;

import java.util.Optional;

public class OptionalClass {


    public static void main(String[] args) {
        String s = "AmmiAbba";
    Employee employee = new Employee(26,"Munna");
        //creating empty Optional
        Optional<String> emptyOptional = Optional.empty();

        //creating Optional using of()
        //writing for git training.

        Optional<Employee> stringOptional = Optional.of(employee);

        System.out.println(stringOptional.get());
    }
}
