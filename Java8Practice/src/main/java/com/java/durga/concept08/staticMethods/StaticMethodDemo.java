package com.java.durga.concept08.staticMethods;

interface staticMethodInterface {
	public static void m1() {
		System.out.println("Hello from static method");
	}
}

public class StaticMethodDemo implements staticMethodInterface {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StaticMethodDemo demo = new StaticMethodDemo();
		//demo.m1(); //compile time error
		//StaticMethodDemo.m1(); //compile time error
		staticMethodInterface.m1();
	}
}