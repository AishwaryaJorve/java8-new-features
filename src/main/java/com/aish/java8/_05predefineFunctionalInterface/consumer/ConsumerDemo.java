package com.aish.java8._05predefineFunctionalInterface.consumer;

import java.util.function.Consumer;

/**
 * Consumer interface used to perform task it take one input not return anything and it contains accept() method
 * @author Aishwarya Jorve
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello");
        c.accept("DURGASOFT");
    }
}
