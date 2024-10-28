package com.java.durga.concept04.functionalinterface.inheritance;

@FunctionalInterface
public interface Child3 extends Parent {

	// this is invalid functional interface as it contains total 2 abstract methods
	// one from child and another from parent
	//public void m2();
}