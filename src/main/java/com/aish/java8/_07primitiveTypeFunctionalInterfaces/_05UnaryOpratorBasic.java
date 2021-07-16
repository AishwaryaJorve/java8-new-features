package com.aish.java8._07primitiveTypeFunctionalInterfaces;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author Aishwarya Jorve
 */
//class TestFunction {
//    public static void main(String[] args) {
//        Function<Integer, Integer> f = i -> i * i;
//        System.out.println(f.apply(5));
//    }
//}


/**
 * If input and output are same type then we should go for UnaryOperator
 * It is child of Function<T,T>
 */
public class _05UnaryOpratorBasic {
    public static void main(String[] args) {
        UnaryOperator<Integer> f = i -> i * i;
        System.out.println(f.apply(6));
    }
}
