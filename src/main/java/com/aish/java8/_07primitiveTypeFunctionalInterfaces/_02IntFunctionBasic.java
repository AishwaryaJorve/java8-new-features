package com.aish.java8._07primitiveTypeFunctionalInterfaces;

import java.util.function.IntFunction;

/**
 * @author Aishwarya Jorve
 */
public class _02IntFunctionBasic {

    public static void main(String[] args) {

        // Passed Integer is Return type, Always take int as input .. performance wise good
        IntFunction<Integer> f = i -> i * i;
        System.out.println(f.apply(4));
    }

}
