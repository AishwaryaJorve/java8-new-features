package com.aish.java8.predefineFunctionalInterface;

import java.util.function.Predicate;


/**
 * Predicate is functionalInterface which contains test(T t) method
 * @author AishwaryaJorve
 *
 */
public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> p=I->I>10;
		
		System.out.println(p.test(100));
	}
	
}
