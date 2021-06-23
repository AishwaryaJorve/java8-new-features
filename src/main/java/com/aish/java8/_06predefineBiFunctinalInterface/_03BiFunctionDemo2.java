package com.aish.java8._06predefineBiFunctinalInterface;

/**
 * create Student Object by taking name and rollno as input by using BiFunction
 */

import java.util.ArrayList;
import java.util.function.BiFunction;

/**
 * @author Aishwarya Jorve
 */
class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}

public class _03BiFunctionDemo2 {

    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();

        // BiFunction with passing name and rollno two arg and return Student obj
        BiFunction<String, Integer, Student> f = (name, rollno) -> new Student(name, rollno);

        l.add(f.apply("Mahesh", 100));
        l.add(f.apply("Shubhi", 200));
        l.add(f.apply("Aishi", 300));

        for(Student s:l){
            System.out.println("Student Name:"+s.name);
            System.out.println("Student Rollno:"+s.rollno);
            System.out.println();
        }
    }

}
