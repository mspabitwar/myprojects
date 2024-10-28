package com.java.durga.concept04.functionalinterface.inheritance;

@FunctionalInterface
public interface Child2 extends Parent {

	//this is valid functional interface as it contains exact same abstract method as parent
	public void m1();
}