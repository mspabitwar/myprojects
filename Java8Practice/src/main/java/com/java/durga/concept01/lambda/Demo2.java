package com.java.durga.concept01.lambda;

interface Interface2 {
	public void add(int a, int b);
}

public class Demo2 implements Interface2 {

	@Override
	public void add(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}
}