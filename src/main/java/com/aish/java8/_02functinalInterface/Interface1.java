package com.aish.java8._02functinalInterface;

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

/**
 * In child interface contain exactly same abstract method
 */

//public interface Interface1 {
//    public void m1();
//}
//
//@FunctionalInterface
//interface  Child1 extends Interface1{
//    public void m1();
//}

/**
 * In child method we can't define any new abstract method
 * will get ce : Multiple non-overriding abstract methods found in interface
 * com.aish.java8.functinalInterface.Child1
 */

//public interface Interface1 {
//    public void m1();
//}
//
//@FunctionalInterface
//interface  Child1 extends Interface1{
//    public void m2();
//}

