package com.java.durga.concept16.UnaryOperator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		// UnaryOperator<T> - it is special customization of function where input and
		// output type will be same. It is a child of Function<T,T>
		UnaryOperator<Integer> squareFun = n -> n * n;
		System.out.println("Square of 10 = " + squareFun.apply(10));

		// IntUnaryOperator is primitive version of UnaryOperator if input and output
		// type is int
		IntUnaryOperator squarePrimitiveFun = n -> n * n;
		System.out.println("Square of 10 = " + squarePrimitiveFun.applyAsInt(10));

		// Similarly there are LongUnaryOperator & DoubleUnaryOperator for long and
		// double primitive type respectively

	}
}