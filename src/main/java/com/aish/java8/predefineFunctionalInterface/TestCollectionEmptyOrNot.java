package com.aish.java8.predefineFunctionalInterface;

import java.util.*;
import java.util.function.Predicate;


/**
 * Test whether collection is empty or not
 * @author AishwaryaJorve
 *
 */
public class TestCollectionEmptyOrNot {

	public static void main(String[] args) {
		
		Predicate<Collection> p=c->c.isEmpty();
		
		
		ArrayList l1=new ArrayList();
		
		l1.add("A");
		
		System.out.println(p.test(l1));
		
		ArrayList l2=new ArrayList();
		
		System.out.println(p.test(l2));	
		
	}
	
	
	
	
}
