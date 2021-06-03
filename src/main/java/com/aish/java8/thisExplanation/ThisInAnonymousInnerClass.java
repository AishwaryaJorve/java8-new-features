package com.aish.java8.thisExplanation;


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
				System.out.println(this.x);
				
			}
		};  
		i.m1();
	}
	
	public static void main(String[] args) {
		ThisInAnonymousInnerClass t=new ThisInAnonymousInnerClass();
		t.m2();
				
	}
	
}
