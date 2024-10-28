package com.java.durga.concept07.defaultMethods;

interface defaultMethodInterface {
	default void m1() {
		System.out.println("Hello from default method");
	}
}

public class DefaultMethodDemo implements defaultMethodInterface {
	
	@Override
	public void m1() {
		System.out.println("Hello from overriden default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodDemo demo = new DefaultMethodDemo();
		demo.m1();
	}
}