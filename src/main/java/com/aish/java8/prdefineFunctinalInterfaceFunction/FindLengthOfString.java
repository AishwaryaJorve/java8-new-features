package com.aish.java8.prdefineFunctinalInterfaceFunction;

import java.util.function.Function;

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
