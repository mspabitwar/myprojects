package com.java.durga.concept10.functions;

import java.util.Scanner;
import java.util.function.Function;

public class AuthenticationFunctionChaining {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = sc.next();

		System.out.println("Enter password:");
		String password = sc.next();

		Function<String, String> substringFun = s -> s.substring(0, 5);
		Function<String, String> lowercaseFun = s -> s.toLowerCase();

		if (substringFun.andThen(lowercaseFun).apply(username).equals("durga") && password.equals("java")) {
			System.out.println("Authentication successful");
		} else {
			System.out.println("Authentication failed");
		}
		sc.close();
	}
}