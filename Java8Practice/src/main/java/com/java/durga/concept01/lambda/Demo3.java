package com.java.durga.concept01.lambda;

interface Interface3 {
	public int length(String s);
}

public class Demo3 implements Interface3 {

	@Override
	public int length(String s) {
		return s.length();
	}
}