package com.aish.java8._05predefineFunctionalInterface.function;

import java.util.function.Function;
/**
 * Function interface is work like Predicate interface but Function interface return any type value
 * Function interface take two types one is input parameter and another is Return type
 */

/**
 * Find length of string using Function interface
 */
public class FindLengthOfString {

    public static void main(String[] args) {
        Function<String,Integer> f=s->s.length();

        System.out.println(f.apply("Aishwarya"));
        System.out.println(f.apply("Monali"));
    }
}
