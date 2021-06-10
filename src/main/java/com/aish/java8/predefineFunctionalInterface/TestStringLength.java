package com.aish.java8.predefineFunctionalInterface;

import java.util.function.Predicate;

public class TestStringLength {

	public static void main(String[] args) {
		
		Predicate<String> p =s->s.length()>5;
		
		System.out.println(p.test("aishwarya"));
		
	}
	
}
