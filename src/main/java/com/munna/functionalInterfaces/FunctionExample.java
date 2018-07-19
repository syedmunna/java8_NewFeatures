package com.munna.functionalInterfaces;

import com.munna.util.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by munna.syed on 7/10/2018.
 */
public class FunctionExample {
    //Function Example
   static Function<Employee,String> employeeStringFunction = e -> e.getName();
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<String> employeeTostrings = new ArrayList<>();
        employees.add(new Employee(18,"munna"));
        employees.add(new Employee(19,"Buddu"));
        employees.add(new Employee(20,"Ammi"));
        employees.add(new Employee(21,"Abbu"));
        for (Employee e:employees){
            employeeTostrings.add(employeeStringFunction.apply(e));
        }
        employeeTostrings.forEach(e -> System.out.println(e));
        //BiFunction example
        BiFunction<String,Integer,String> stringIntegerStringBiFunction = (s,i) -> s+"-"+i;
        for (Employee e:employees){
            employeeTostrings.add(stringIntegerStringBiFunction.apply(e.getName(),e.getAge()));
        }
        employeeTostrings.forEach(e -> System.out.println(e));
        //Using andThen()
        Function<Employee,String> andThenFunction1 = e -> e.getName();
        Function<String,String> andThenFunction2 = e -> e.substring(0,1);
        Function<Employee,String> andthenFunction = andThenFunction1.andThen(andThenFunction2);
        for (Employee e:employees){
            employeeTostrings.add(andthenFunction.apply(e));
        }
        employeeTostrings.forEach(e -> System.out.println(e));
        //Using Compose()
        
    }
}
