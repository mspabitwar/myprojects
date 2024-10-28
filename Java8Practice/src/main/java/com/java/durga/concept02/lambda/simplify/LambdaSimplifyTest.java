package com.java.durga.concept02.lambda.simplify;

public class LambdaSimplifyTest {

	public static void main(String[] args) {
		
		/*Interface1 I1 = () -> {
			System.out.println("Hello from lambda");
		};*/
		
		// If there is single statement in body then curly braces are completely optional
		Interface1 I1 = () -> System.out.println("Hello from lambda");
		I1.m1();

		/*Interface2 I2 = (int a, int b) -> {
			System.out.println("Sum from lambda = " + (a + b));
		};*/
		
		// Argument type can be removed from lambda expression. Compiler can guess types
		// automatically based on context then it is called as type inference
		Interface2 I2 = (a,b) -> System.out.println("Sum from lambda = " + (a + b));
		I2.add(10, 20);

		/*Interface3 I3 = (String s) -> {
			return s.length();
		};*/
		
		// If there is single statement in the body then return statement can be removed
		// If there is only one argument then parenthesis are optional
		Interface3 I3 = s -> s.length();
		System.out.println("Length from lambda = " + I3.length("Hello"));
	}
}