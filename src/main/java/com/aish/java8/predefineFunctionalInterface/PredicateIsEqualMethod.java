package com.aish.java8.predefineFunctionalInterface;

import java.util.function.Predicate;

/**
 * Predicate interface isEqual() Method
 */
public class PredicateIsEqualMethod {

    public static void main(String[] args) {
        Predicate<String> p1=Predicate.isEqual("Aishwarya");
        System.out.println(p1.test("Aishwarya")); //true
        System.out.println(p1.test("Shubhangi")); //false
    }
}
