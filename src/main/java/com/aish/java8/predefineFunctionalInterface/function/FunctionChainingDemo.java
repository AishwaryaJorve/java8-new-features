package com.aish.java8.predefineFunctionalInterface.function;

import java.util.function.Function;

/**
 * If want to combine two function
 * Function chaining using andThen and compose default method of Function interface
 */
public class FunctionChainingDemo {
    public static void main(String[] args) {

        // first expression
        Function<String, String> f1 = s -> s.toUpperCase();

        // Second expression
        Function<String, String> f2 = s -> s.substring(0, 9);

        System.out.println("The Result of f1:" + f1.apply("AishwaryaAbhi"));
        System.out.println("The Result of f2:" + f2.apply("AishwaryaAbhi"));

        // use andThen method which is default
        System.out.println("The Result of f1.andThen(f2):" + f1.andThen(f2).apply("AishwaryaAbhi"));

        // use compose methos which is default method
        System.out.println("The Result of f1.compose(f2):" + f1.compose(f2).apply("AishwaryaAbhi"));
    }
}
