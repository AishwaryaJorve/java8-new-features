package com.aish.java8.thisExplanation;



/**
 * The local variable referenced lambda expression are declare final (whether declare or not)
 * @author AishwaryaJorve
 *
 */

interface Interf3{
	public void m1();
}

public class FetchInstaceLocalVariableFromLambdaExpression {

	int x=10;
	
	public void m2() {
		
		int y=20;
		
		Interf3 i=()->{
			System.out.println(x); // can access instance 
			
			//if we are using local variable it became final
			System.out.println(y); 
			
			// so we can't reassign local variable ( will get compile time error)
			// ce: local variable referenced from lambda expression must be final or effectively final
			// y=30;
			
			// can reassign instance variable
			x=30;
		};
		 
		i.m1();
	    	
	}
	
	public static void main(String[] args) {
		
		FetchInstaceLocalVariableFromLambdaExpression t=new FetchInstaceLocalVariableFromLambdaExpression();
		
		t.m2();
		
	}
	
}
