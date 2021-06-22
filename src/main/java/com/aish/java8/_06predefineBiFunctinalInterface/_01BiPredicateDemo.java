package com.aish.java8._06predefineBiFunctinalInterface;

import java.util.function.BiPredicate;

/**
 * BiPredicate is exactly same as Predicate except that it will take 2 input arguments.
 * And perform some conditional check, for this requirement we should go for BiPredicate.
 */

//            interface BiPredicate<T1, T2>
//            {
//                public boolean test(T1 t1, T2 t2);
//                //remaining default methods: and(), or() , negate()
//            }

public class _01BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
        System.out.println(p.test(10, 20));
    }
}
