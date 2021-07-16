package com.aish.java8._07primitiveTypeFunctionalInterfaces;


/**
 * The primitive versions for BinaryOperator:
 */


import java.util.function.BinaryOperator;

/**
 * @author Aishwarya Jorve
 */
public class IntBinaryOperatorBasic {
    public static void main(String[] args) {
        BinaryOperator<Integer> b = (i1, i2) -> i1 + i2;
        System.out.println(b.apply(10, 20));
    }
}
