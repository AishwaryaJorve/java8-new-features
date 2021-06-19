package com.aish.java8.prdefineFunctinalInterfaceFunction;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/*
  Find Grade of student using function interface
  @author Aishwarya Jorve
 */


/**
 * Student class
 */
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

/**
 * Main class
 */
public class FindGradeOfStudent {

    public static void main(String[] args) {
        // ArrayList object to store student
        ArrayList<Student> l = new ArrayList<>();

        // populate method add student in arraylist obj.
        populate(l);

        // Lambda expression with Function interface
        Function<Student, String> f = s -> {

            int marks = s.marks;

            if (marks >= 80) {
                return "A[Distinction]";
            } else if (marks >= 60) {
                return "B[First Class]";
            } else if (marks >= 50) {
                return "C[Second Class]";
            } else if (marks >= 35) {
                return "D[Third Class]";
            } else {
                return "E[Failed]";
            }

        };

        Predicate<Student> p=s->s.marks>=60;
        for (Student s:l) {
            if(p.test(s)){
                System.out.println("Student Name:" + s.name);
                System.out.println("Student Marks:" + s.marks);

                // call to apply method of Function interface
                System.out.println("Student Grade:" + f.apply(s));
                System.out.println();
            }
        }

        // Iterate arraylist obj using forEach loop
//        for (Student s : l) {
//            System.out.println("Student Name:" + s.name);
//            System.out.println("Student Marks:" + s.marks);
//
//            // call to apply method of Function interface
//            System.out.println("Student Grade:" + f.apply(s));
//            System.out.println();
//        }
    }

    // Populate method to store students
    public static void populate(ArrayList<Student> l) {
        l.add(new Student("Mahesh", 100));

        l.add(new Student("Aishi", 65));

        l.add(new Student("Shubhi", 55));

        l.add(new Student("Praji", 45));

        l.add(new Student("Smiti", 25));

    }
}
