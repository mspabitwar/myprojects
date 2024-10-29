package com.java.durga.concept10.functions;

import java.util.function.Function;

public class FunctionIdentityDemo {

	public static void main(String[] args) {

		Function<String, String> identityFun = Function.identity();
		System.out.print(identityFun.apply("durga")); // durga
	}
}