package com.aish.java8._03defultAndStaticMethodInInterf;

/**
 * Use of static method inside interface to define general utility method
 * This static method not by default available to implementation class 
 * Can call using interface name only.
 * @author AishwaryaJorve
 *
 */

interface interf2{
	// static method in interface
	public static void m1() {
		System.out.println("interface static method");
	}
}

public class StaticMethodInInterface {

//				public static void main(String[] args) {
//				   	
//			//      m1(); // Directly can't call
//					
//				    StaticMethodInInterface t= new StaticMethodInInterface();
//					 
//			//	    t.m1(); // not allow
//					
//			//	    Test .m1(); // not allow	
//					
//					interf2.m1(); // only one to access 
//					
//				}
	
}
