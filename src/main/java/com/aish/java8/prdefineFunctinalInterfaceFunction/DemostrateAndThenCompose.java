package com.aish.java8.prdefineFunctinalInterfaceFunction;

import java.util.function.Function;

/**
 * Demonstrate the difference between andThen() and compose()
 */
public class DemostrateAndThenCompose {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i + i;
        Function<Integer, Integer> f2 = i -> i * i * i;
        System.out.println(f1.andThen(f2).apply(2));  //64
        System.out.println(f1.compose(f2).apply(2));  //16
    }
}
