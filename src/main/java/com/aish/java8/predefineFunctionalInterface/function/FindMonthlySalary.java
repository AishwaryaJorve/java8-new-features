package com.aish.java8.predefineFunctionalInterface.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Employee class
 */
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + ":" + salary;
    }
}

public class FindMonthlySalary {
    public static void main(String[] args) {

        // ArrayList object to take multiple employee
        ArrayList<Employee> l = new ArrayList<Employee>();
        populate(l);

        System.out.println("Before Increment:");
        System.out.println(l);

        //predicate to check is salary less than 3500
        Predicate<Employee> p = e -> e.salary < 3500;

        // Add 477 in sal
        Function<Employee, Employee> f = e -> {
            e.salary = e.salary + 477;
            return e;
        };
        System.out.println("After Increment:");
        ArrayList<Employee> l2 = new ArrayList<Employee>();
        for (Employee e : l) {
            //first check salary less than 3500 or not
            if (p.test(e)) {
                // After add 477 in sal add employee in 2nd arrayList obj
                l2.add(f.apply(e));
            }
        }
        System.out.println(l);
        System.out.println("Employees with incremented salary:");
        System.out.println(l2);
    }

    public static void populate(ArrayList<Employee> l) {
        l.add(new Employee("Sunny", 1000));

        l.add(new Employee("Bunny", 2000));

        l.add(new Employee("Chinny", 3000));

        l.add(new Employee("Pinny", 4000));

        l.add(new Employee("Vinny", 5000));

        l.add(new Employee("Durga", 10000));
    }

}
