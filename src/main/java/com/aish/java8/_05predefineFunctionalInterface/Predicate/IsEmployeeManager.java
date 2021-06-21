package com.aish.java8._05predefineFunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Display Manager Employee
 *
 * @author Aishwarya Jorve
 */

//Employee class
class Employee {
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}


public class IsEmployeeManager {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        //Method to add employee object in array list
        populate(list);

        Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
        System.out.println("Managers Information:");
        display(p1, list);

    }

    public static void populate(ArrayList<Employee> list) {

        list.add(new Employee("Durga", "CEO", 30000, "Hyderabad"));

        list.add(new Employee("Sunny", "Manager", 20000, "Hyderabad"));

        list.add(new Employee("Mallika", "Manager", 20000, "Bangalore"));

        list.add(new Employee("Kareena", "Lead", 15000, "Hyderabad"));
    }

    public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
        for (Employee e : list) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
    }

}
