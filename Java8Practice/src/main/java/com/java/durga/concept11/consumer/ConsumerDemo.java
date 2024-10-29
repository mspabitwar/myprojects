package com.java.durga.concept11.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("hello");
		consumer.accept("world");
	}
}