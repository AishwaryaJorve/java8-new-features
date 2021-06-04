package com.aish.java8.thisExplanation;


/**
 * 
 * @author AishwaryaJorve
 * 
 * Inside lambda expression this always refer outer class member only
 *
 */


interface TestInterf{
	public void m1();
}

public class ThisInLambdaExpression {
     
	int x=999;
	 
    public void m2() {
    	TestInterf i=()->{
    		int x=888;  // variable in lambda function is always lacal variable of lambda expression
    		System.out.println(this.x); //this always refer instance variable here is outer class instance
    	};
    	i.m1();
    }
    
//    public static void main(String[] args) {
//    	ThisInLambdaExpression t=new ThisInLambdaExpression();
//    	t.m2();
//	}
}
