package com.aish.java8._01lambdaExpression;


class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child Thread");
		}
	}
}


public class ThreadDemoWithoutLambdaExpression {

//	public static void main(String args[]) {
//		Runnable r=new MyRunnable();
//		Thread t =new Thread(r);
//		t.start();
//		for(int i=0;i<10;i++) {
//			System.out.println("main thread");
//		}
//	}	
}
