package com.java.durga.concept06.anonymous.inner.classes;

interface interf1 {
	public void m1();
}

public class ThisKeywordDemo {

	int x = 888;
	
	public static void main(String[] args) {

		ThisKeywordDemo demo = new ThisKeywordDemo();
		demo.m2();

	}

	@SuppressWarnings("unused")
	public void m2() {

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
			System.out.println("Lambda Expression : " + this.x);
		};
		I2.m1();
	}
}