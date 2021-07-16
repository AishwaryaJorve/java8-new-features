package com.aish.java8._07primitiveTypeFunctionalInterfaces;

/**
 * primitive versions for UnaryOperator
 */

import java.util.function.IntUnaryOperator;


/**
 * @author Aishwarya Jorve
 */
public class _06IntUnaryOperatorBasic {
    public static void main(String[] args) {
        IntUnaryOperator f = i -> i * i;
        System.out.println(f.applyAsInt(6));
    }
}
