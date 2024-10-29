package com.java.durga.concept10.functions;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {

		Function<String, String> uppercaseFun = s -> s.toUpperCase();
		Function<String, String> substringFun = s -> s.substring(0, 9);

		System.out.println("The result of uppercaseFun = " + uppercaseFun.apply("AishwaryaAbhi"));
		System.out.println("The result of substringFun = " + substringFun.apply("AishwaryaAbhi"));
		System.out.println("The result of uppercaseFun.andThen(substringFun) = "
				+ uppercaseFun.andThen(substringFun).apply("AishwaryaAbhi"));
		System.out.println("The result of uppercaseFun.componse(substringFun) = "
				+ uppercaseFun.compose(substringFun).apply("AishwaryaAbhi"));

		Function<Integer, Integer> dounbleFun = n -> 2 * n;
		Function<Integer, Integer> cubeFun = n -> n * n * n;
		System.out.println(
				"The result of dounbleFun.andThen(cubeFun).apply(2) = " + dounbleFun.andThen(cubeFun).apply(2));//64
		System.out.println(
				"The result of dounbleFun.compose(cubeFun).apply(2) = " + dounbleFun.compose(cubeFun).apply(2));//16
	}
}