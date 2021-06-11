package com.aish.java8.predefineFunctionalInterface;

import java.util.function.Predicate;

public class TestPredicateJoining {

	
	public static void main(String[] args) {

		int[] x= {0,5,10,15,20,25,30};

		Predicate<Integer> p1=i->i>10;  // should be greater than 10

		Predicate<Integer> p2=i->i%2==0; //should be Even

		System.out.println("the number greater than 10 are: ");

	}
	
	// method to iterate array 
	
	public static void m1(Predicate<Integer> p,int[] x) {
		
	}
	
}
