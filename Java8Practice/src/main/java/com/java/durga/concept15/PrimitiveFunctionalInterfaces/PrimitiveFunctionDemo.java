package com.java.durga.concept15.PrimitiveFunctionalInterfaces;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionDemo {

	public static void main(String[] args) {

		// IntFunction - it takes int as input but can return any type
		IntFunction<Integer> squareFun = n -> n * n;
		System.out.println("Square of 5 = " + squareFun.apply(5));

		// ToIntFunction - it takes any type as input but return int type
		ToIntFunction<String> stringLengthFun = s -> s.length();
		System.out.println("Length of Hello = " + stringLengthFun.applyAsInt("Hello"));

		// IntToDoubleFunction - it takes int as input and return double
		IntToDoubleFunction sqrtFun = n -> Math.sqrt(n);
		System.out.println("Square Root of 25 = " + sqrtFun.applyAsDouble(25));

	}
}