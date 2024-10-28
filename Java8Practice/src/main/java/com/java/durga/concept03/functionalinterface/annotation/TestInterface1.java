package com.java.durga.concept03.functionalinterface.annotation;

@FunctionalInterface
public interface TestInterface1 {

	public void m1();
	
	// This is valid as this abstract is coming from Object class and considered as overriding abstract method
	// multiple non-overriding methods are not allowed in functional interface
	public boolean equals(Object o);
	
	// uncommenting below method will give compile time error as interface will
	// contain multiple abstract methods hence it will no longer will be functional interface
	//public void m4();

	// you can have any number of default methods in functional interface
	default void m2() {

	}

	// you can have any number of public methods in functional interface
	public static void m3() {

	}
}