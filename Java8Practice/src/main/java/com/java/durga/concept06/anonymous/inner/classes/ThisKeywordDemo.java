package com.java.durga.concept06.anonymous.inner.classes;

interface interf1 {
	public void m1();
}

public class ThisKeywordDemo {

	int x = 888;
	int a = 10;
	
	public static void main(String[] args) {

		ThisKeywordDemo demo = new ThisKeywordDemo();
		demo.m2();

	}

	@SuppressWarnings("unused")
	public void m2() {
		int b = 20;

		interf1 I1 = new interf1() {
			int x = 999;

			@Override
			public void m1() {
				System.out.println("Anonymous Inner Class : " + this.x);
			}
		};
		I1.m1();
		
		interf1 I2 = () -> {
			int x = 999;
			a = 100;
			//b = 200; //Local variable b defined in an enclosing scope must be final or effectively final
			System.out.println("Lambda Expression : " + this.x);
			System.out.println("Lambda Expression : " + a);
			System.out.println("Lambda Expression : " + b);
		};
		I2.m1();
	}
}