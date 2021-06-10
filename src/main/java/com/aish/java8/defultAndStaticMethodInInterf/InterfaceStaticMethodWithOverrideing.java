package com.aish.java8.defultAndStaticMethodInInterf;


/**
 * Defining same static method in child class but it is not overriding.
 * @author AishwaryaJorve
 *
 */
//			interface interf3{
//				public static void m1() {
//					
//				}
//			}
//			public class InterfaceStaticMethodWithOverrideing implements interf3{
//			    // same static method like interf3
//				public static void m1() {
//					
//				}	
//			}


/**
 * In normal class if parent class method static if try to write non static method in child class will get 
 * compile time error (can't overrride static method as non static method)
 * 
 * but its valid here
 * @author AishwaryaJorve
 *
 */
//			interface interf3{
//			public static void m1() {
//				
//			}
//			}
//			public class InterfaceStaticMethodWithOverrideing implements interf3{
//			// 
//			public void m1() {
//				
//			}	
//			}
//			
			
	
/**
 * valid .. not overriding so can change access modifier
 * @author AishwaryaJorve
 *
 */
//			interface interf3{
//				public static void m1() {
//					
//				}
//			}
//			public class InterfaceStaticMethodWithOverrideing implements interf3{
//			    
//				private static void m1() {
//					
//				}	
//			}
			
			