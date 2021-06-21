package com.aish.java8._02functinalInterface;

/**
 * Functional interface is interface which contains only a single abstract method , and any number of
 * default and static method
 *
 * use of functional interface to invoke and to call lambda expression
 *
 * use of @FunctionalInterface is if did mistake will show error
 */
@FunctionalInterface
public interface Declaration {
    // abstract method
    public void m1();

    default void m2(){
        System.out.println("Hello");
    }
    public static void m3(){

    }

    // if declare multiple abstract method
    // public void m4();
    /**
     * ce: Multiple non-overriding abstract methods found in interface
     * com.aish.java8.functinalInterface.Declaration
     */


}
