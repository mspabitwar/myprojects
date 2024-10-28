package com.java.durga.concept06.anonymous.inner.classes;

public class AnonymousInnerClassDemo {

	interface InterfaceContainingMultipleAbstractMethods {
		public void m1();
		public void m2();
	}

	interface InterfaceContainingSingleAbstractMethods {
		public void m1();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		class ConcreteClass {
		}
		
		abstract class AbstractClass {
			public abstract void m1();
		}

		// Case-1
		ConcreteClass concreteClass = new ConcreteClass() {};
		
		// Case-2
		AbstractClass abstractClass = new AbstractClass() {public void m1(){}};

		// Case-3
		InterfaceContainingMultipleAbstractMethods interface1 = new InterfaceContainingMultipleAbstractMethods() {
			public void m1(){}
			public void m2(){}
		};

		// Case-4
		InterfaceContainingSingleAbstractMethods interface2 = new InterfaceContainingSingleAbstractMethods() {
			public void m1(){}
		};
		
		// Only in case-4, we can replace it with lambda expression hence
		// 1. anonymous inner classes and lambda are completely different concepts
		// 2. anonymous inner classes are more powerful than lambda
	}
}