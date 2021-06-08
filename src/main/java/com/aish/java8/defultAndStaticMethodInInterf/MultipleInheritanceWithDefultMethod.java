package com.aish.java8.defultAndStaticMethodInInterf;

interface Left{
	default void m1() {
		System.out.println("Left default method");
	}
}

interface Right{
	default void m2() {
		System.out.println("Right default method");
	}
}

public class MultipleInheritanceWithDefultMethod implements Right,Left{

	 public void m1() {
		 System.out.println("My own implementation");
	 }
	
	public static void main(String[] args) {
		
		MultipleInheritanceWithDefultMethod m= new MultipleInheritanceWithDefultMethod();
		m.m1();
		 
		
	}
	
}
