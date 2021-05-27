package com.aish.java8.functinalInterface;

/**
 * if interface extends functional Interface and child interface not contains any abstract method
 * then child interface always functional interface
 */
public interface Interface1 {
    public void m1();
}

@FunctionalInterface
interface  Child1 extends Interface1{

}
