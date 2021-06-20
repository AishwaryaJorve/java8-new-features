package com.aish.java8.predefineFunctionalInterface.consumer;


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Student class
 * @author Aishwarya Jorve
 */
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}


public class ConsumerPredicateFunction {

    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        populate(l);

        // Predicate to check is student mark greater than 60 or not
        Predicate<Student> p = s -> s.marks >= 60;

        // Function to find grad of students
        Function<Student, String> f = s -> {
            int mark = s.marks;
            if (mark >= 60)
                return "Distinction";
            else if (mark >= 50)
                return "Secondary class";
            else
                return "fail";
        };

        // Consumer to display info
        Consumer<Student> c = s -> {
            System.out.println("Name of student :  " + s.name);
            System.out.println("Mark of student :  " + s.marks);

            // apply() method to find grad of student
            System.out.println("Grad of student :  " + f.apply(s));
            System.out.println();
        };

        for (Student s : l) {
            // test()
            if (p.test(s)) {
                // accept()
                c.accept(s);
            }
        }

    }


    public static void populate(ArrayList<Student> l) {
        l.add(new Student("Aishwarya", 90));
        l.add(new Student("Mahesh", 100));
        l.add(new Student("Shubhangi", 85));
        l.add(new Student("Sunny", 45));
        l.add(new Student("bunny", 55));
    }
}

/*
  Output
  Name of student :  Aishwarya
  Mark of student :  90
  Grad of student :  Distinction

  Name of student :  Mahesh
  Mark of student :  100
  Grad of student :  Distinction

  Name of student :  Shubhangi
  Mark of student :  85
  Grad of student :  Distinction
 */