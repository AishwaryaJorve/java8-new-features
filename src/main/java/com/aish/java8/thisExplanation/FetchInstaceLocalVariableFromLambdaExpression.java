package com.aish.java8.thisExplanation;


interface Interf3{
	public void m1();
}

public class FetchInstaceLocalVariableFromLambdaExpression {

	int x=10;
	
	public void m2() {
		
		int y=20;
		
		Interf3 i=()->{
			System.out.println(x); // can access instance 
			System.out.println(y); // can access local
		};
		 
		i.m1();
	    	
	}
	
	public static void main(String[] args) {
		
		FetchInstaceLocalVariableFromLambdaExpression t=new FetchInstaceLocalVariableFromLambdaExpression();
		
		t.m2();
		
	}
	
}
