package com.aish.java8._06predefineBiFunctinalInterface;

import java.util.function.BiFunction;

/**
 * BiFunction is exactly same as Function except that it will take 2 input arguments.
 * Accept 2 input values and perform required operation and should return the result.
 */

//                interface BiFunction<T, U, R> {
//                    public R apply(T t, U u);
//                    //default method andThen()
//                }

public class _02BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> f = (a, b) -> a * b;
        System.out.println(f.apply(10, 20));
    }

}
