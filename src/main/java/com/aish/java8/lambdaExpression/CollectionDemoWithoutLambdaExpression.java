package com.aish.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2) {
		return (i1>i2)?-1:(i1<i2)?1:0;
	}
}


public class CollectionDemoWithoutLambdaExpression {

//	public static void main(String[] args) {
//		ArrayList<Integer> i=new ArrayList<>();
//		i.add(10);
//		i.add(5);
//		i.add(11);
//		i.add(7);
//		i.add(2);
//		System.out.println("Before"+i);
//		Collections.sort(i,new MyComparator());
//		System.out.println("After"+i);
//	}
	
}
