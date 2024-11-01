package com.java.durga.concept17.ColonOperator;

interface TestInterf {
	public void m1();
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// Method reference is alternative to lambda expression
		// Instead of providing new implementation, we can refer to existing method
		// implementation
		// Only one condition for using method reference is that both methods i.e.
		// calling method and target method both should have same argument type
		// Advantage is code reusability

		// We can refer static method using class name
		TestInterf test = MethodReferenceDemo::m2;
		test.m1();

		// We can refer non static method using instance variable
		MethodReferenceDemo obj = new MethodReferenceDemo();
		TestInterf test2 = obj::m3;
		test2.m1();
	}

	public static void m2() {
		System.out.println("static m2 method implementation");
	}

	public void m3() {
		System.out.println("non static m3 method implementation");
	}
}