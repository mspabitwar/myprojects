package com.java.durga.concept17.ColonOperator;

class TestClass {

	String message = "Hello";

	TestClass() {
		System.out.println("Constructor execution and object creation");
	}
	
	public void printMessage() {
		System.out.println(this.message);
	}
}

interface TestInterf1 {
	public TestClass getTestClassObject();
}

public class ConstructorReferenceDemo {

	public static void main(String[] args) {

		TestInterf1 test = TestClass::new;
		TestClass object = test.getTestClassObject();
		object.printMessage();
	}
}