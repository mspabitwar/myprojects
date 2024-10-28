package com.java.durga.concept09.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	String username;
	String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
}

public class AuthenticationPredicate {

	public static void main(String[] args) {

		Predicate<User> authenticator = s -> s.username.equals("durga") && s.password.equals("java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = sc.next();
		System.out.println("Enter password:");
		String password = sc.next();
		User user = new User(username, password);
		if (authenticator.test(user)) {
			System.out.println("Authentication successful");
		} else {
			System.out.println("Authentication failed");
		}
		sc.close();
	}
}