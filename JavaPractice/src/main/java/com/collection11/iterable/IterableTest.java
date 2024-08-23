package com.collection11.iterable;

public class IterableTest {

	public static void main(String[] args) {

		UrlLibrary urlLibrary = new UrlLibrary();

		for (String html : urlLibrary) {
			System.out.println(html.length());
			//System.out.println(html);
			System.out.println("------------------------");
		}
	}
}