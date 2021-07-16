package com.aish.java8._07primitiveTypeFunctionalInterfaces;


import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//class TestBiFunctional {
//    public static void main(String[] args) {
//        BiFunction<String, String, String> f = (s1, s2) -> s1 + s2;
//        System.out.println(f.apply("Aishwarya", "Jorve"));
//    }
//}


/**
 * It is the child of BiFunction<T,T,T>
 * BinaryOperator<T>
 * public T apply(T,T)
 */


public class _07BinaryOpratorBasic {
    public static void main(String[] args) {
        BinaryOperator<String> b =(s1,s2)->s1+s2;
        System.out.println(b.apply("Aishwarya", "Jorve"));
    }
}
