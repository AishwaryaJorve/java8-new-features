package com.aish.java8.notes;

import com.aish.java8.lambdaExpression.Test1;

/**
 * Annonymous inner class and lambda expression both are not equal anonymous inner class more powerful 
 * than lambda expression
 * Only in perticular case anonymous inner class we can replace with lambda expression
 * 
 * (for lambda expression we want function interface only which contain one method)
 */

/**
 * Anonymous inner class that extends normal class
 */
//			class Test {

//			
//			}
//			
//			class MainClass {
//				public static void main(String[] args) {
//					Test t = new Test() {
//			
//					};
//				}
//			}



/**
 * Anonymous inner class that extends abstract method
 */
//			abstract class Test {
//			
//			}
//			
//			class MainClass {
//				public static void main(String[] args) {
//					Test t = new Test() {
//			
//					};
//				}
//			}




/**
 * Anonymous inner class that implements an interface which contains multiple
 * methods
 */
//			interface Test{
//				public void m1();
//				public void m2();
//				public void m3();
//			}
//			
//			class MainClass {
//				public static void main(String[] args) {
//					Test t = new Test() {
//						
//						@Override
//						public void m3() {
//							// TODO Auto-generated method stub
//							
//						}
//						
//						@Override
//						public void m2() {
//							// TODO Auto-generated method stub
//							
//						}
//						
//						@Override
//						public void m1() {
//							// TODO Auto-generated method stub
//							
//						}
//					};
//				}
//			}


/**
 * Anonymous inner class that implements interface which contains only one method
 */
//			interface Test{
//				public void m1();
//			}
//			
//			public class AnonymousInnerVsLambdaEx {
//			      public static void main(String[] args) {
//					Test t=new Test() {
//						
//						@Override
//						public void m1() {
//							// TODO Auto-generated method stub
//							
//						}
//					};
//				}
//			}
