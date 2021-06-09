package com.aish.java8.defultAndStaticMethodInInterf;


interface interf2{
	// static method in interface
	public static void m1() {
		System.out.println("interface static method");
	}
}

public class StaticMethodInInterface {

	public static void main(String[] args) {
	   // Directly can't call	
       // m1(); 
		
		StaticMethodInInterface t= new StaticMethodInInterface();
		 
//	    t.m1(); // not allow
		
//	   Test .m1(); // not allow	
		
		interf2.m1(); // only one to access 
		
	}
	
}
