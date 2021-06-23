package com.aish.java8._07primitiveTypeFunctionalInterfaces;

/**
 * IntPredicate-->always accepts input value of int type
 */

//                        interface IntPredicate {
//                            public boolean test(int i);
//                            //default methods: and(),or(),negate()
//                        }

import java.util.function.IntPredicate;

/**
 * @author  Aishwarya Jorve
 */
public class _01IntPredicateBasic {

    public static void main(String[] args) {

        int[] x = {0, 5, 10, 15, 20, 25};

        // IntPredicate never take any Argument type it always take int
        // autoboxing and autounboxing won't be performed internally.Hence performance wise improvements are there.
        IntPredicate p = i -> i % 2 == 0;
        for (int x1 : x) {
            if (p.test(x1)) {
                System.out.println(x1);
            }
        }
    }
}
