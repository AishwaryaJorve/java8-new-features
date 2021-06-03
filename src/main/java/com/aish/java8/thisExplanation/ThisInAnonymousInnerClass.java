package com.aish.java8.thisExplanation;


/**
 * 
 * @author AishwaryaJorve
 * 
 * Inside anonymous inner class this always refer current class object.
 *
 */

interface Interf{
	public void m1();
}


public class ThisInAnonymousInnerClass {

	int x=888;  //instance variable of ThisInAnonymousInnerClass 
	
	public void m2() {
		Interf i=new Interf() {
			
			int x=999;  // instance variable of anonymous inner class.
			
			@Override
			public void m1() {
				System.out.println(this.x); // this refer current class instance variable.
				// will print ThisInAnonymousInnerClass class instance variable
				System.out.println(ThisInAnonymousInnerClass.this.x);  
			}
		};  
		i.m1();
	}
	
//	public static void main(String[] args) {
//		ThisInAnonymousInnerClass t=new ThisInAnonymousInnerClass();
//		t.m2();
//				
//	}
	
}
