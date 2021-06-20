package com.aish.java8.predefineFunctionalInterface.function;

import java.util.function.Function;

/**
 * Function interface contains a static method.
 * static <T> Function<T,T> identity()
 * Returns a function that always returns its input argument.
 */
public class IdentityStaticMethodINFunctionInterf {
    public static void main(String[] args) {
        Function<String, String> f1 = Function.identity();
        String s2 = f1.apply("durga");
        System.out.println(s2);
    }
}
