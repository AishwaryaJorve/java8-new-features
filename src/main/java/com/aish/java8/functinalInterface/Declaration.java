package com.aish.java8.functinalInterface;

/**
 * Functional interface is interface which contains only a single abstract method , and any number of
 * default and static method
 *
 * use of @FunctionalInterface is if did mistake will show error
 */
@FunctionalInterface
public interface Declaration {
    // abstract method
    public void m1();

    default void m2(){

    }
    public static void m3(){

    }
}
