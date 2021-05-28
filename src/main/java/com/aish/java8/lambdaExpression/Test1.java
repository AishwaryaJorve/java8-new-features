package com.aish.java8.lambdaExpression;

interface Interf{
//	public void m1();
	
//	public void add(int a,int b);
	 
	public int getLength(String s);
	
}


public class Test1 {
    public static void main(String args[]){
      
//    	Interf i=()->System.out.println("Lambda implementation");
//    	i.m1();

//    	Interf i=(a,b)->System.out.println("sum byLambda implementation"+(a+b));
//    	i.add(10,20);
    	
    	Interf i=(s)->s.length();
    	System.out.println(i.getLength("Aishwarya"));
    	
    }
}
