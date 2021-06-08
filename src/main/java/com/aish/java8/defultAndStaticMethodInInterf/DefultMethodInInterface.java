package com.aish.java8.defultAndStaticMethodInInterf;


/**
 * Default method have already implementation can use same implementaion and can override  
 * @author AishwaryaJorve
 *
 */

interface Interf{
	
	//with 'default' keyword can define default method in interface
	default void m1() {
		System.out.println("I am Default method in interface");
	}
}


public class DefultMethodInInterface implements Interf{

	public void m1() {
		System.out.println("new implementation");
	}
	
//	public static void main(String[] args) {
//		DefultMethodInInterface t=new DefultMethodInInterface();
//		
//		t.m1();
//	}
	
}
