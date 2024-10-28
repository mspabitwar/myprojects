package com.java.durga.concept07.defaultMethods;

interface Left {
	default void m1() {
		System.out.println("Left default method");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right default method");
	}
}

public class DefaltMethodMultipleInheritanceDemo implements Left, Right {

	public static void main(String[] args) {
		DefaltMethodMultipleInheritanceDemo demo = new DefaltMethodMultipleInheritanceDemo();
		demo.m1();
	}

	@Override
	public void m1() {
		System.out.println("My own custom implementation");
		Left.super.m1();
		Right.super.m1();
	}
}