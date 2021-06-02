package com.aish.java8.lambdaExpression;

// Anonymous inner class VS Lambda Expression with Runnable

/**
 * Using Anonymous Inner class
 * @author AishwaryaJorve
 *
 */
//public class AnonymousInnerVSLambdaExpression {
//
//	public static void main(String[] args) {
//      //Anonymous inner class
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("child Thread");
//				}
//
//			}
//		};
//
//		Thread t = new Thread(r);
//		t.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main thread");
//		}
//	}
//
//}

/**
 * Using lambda expression
 * @author AishwaryaJorve
 *
 */
//public class AnonymousInnerVSLambdaExpression {
//
//	public static void main(String[] args) {
//		Runnable r = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("child Thread");
//			}
//
//		};
//
//		Thread t = new Thread(r);
//		t.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main thread");
//		}
//	}
//
//}

/**
 * Using lamda expression (Another way) 
 * @author AishwaryaJorve
 *
 */
public class AnonymousInnerVSLambdaExpression {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("child Thread");
			}

		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

}
