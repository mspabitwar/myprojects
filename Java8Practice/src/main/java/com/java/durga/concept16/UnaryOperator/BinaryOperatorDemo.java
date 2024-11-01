package com.java.durga.concept16.UnaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {

		// BinaryOperator<T> - it is special customization of BiFunction where both
		// input and output type will be same. It is a child of BiFunction<T,T,T>
		BinaryOperator<Integer> multiFun = (n1, n2) -> n1 * n2;
		System.out.println("Multiplication of 10 & 15 = " + multiFun.apply(10, 15));

		// IntBinaryOperator is primitive version of BinaryOperator if both input and
		// output type is int
		IntBinaryOperator multiPrimitiveFun = (n1, n2) -> n1 * n2;
		System.out.println("Multiplication of 10 & 15 = " + multiPrimitiveFun.applyAsInt(10, 15));

		// Similarly there are LongBinaryOperator & DoubleBinaryOperator for long and
		// double primitive type respectively

	}
}