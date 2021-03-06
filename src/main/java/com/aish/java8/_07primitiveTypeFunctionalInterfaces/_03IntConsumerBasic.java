package com.aish.java8._07primitiveTypeFunctionalInterfaces;

import java.util.function.IntConsumer;

/**
 * Consumer Basic demo
 * (Increase performance)
 * @author Aishwarya Jorve
 */
public class _03IntConsumerBasic {

    public static void main(String[] args) {
        IntConsumer c = i -> System.out.println("The Square of i:" + (i * i));
        c.accept(10);
    }

}

/**
 * The Square of i:100
 */
