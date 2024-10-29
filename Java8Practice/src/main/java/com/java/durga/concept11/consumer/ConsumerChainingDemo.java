package com.java.durga.concept11.consumer;

import java.util.function.Consumer;

class Moviee {
	String name;
	String result;

	Moviee(String name, String result) {
		this.name = name;
		this.result = result;
	}
}

public class ConsumerChainingDemo {

	public static void main(String[] args) {

		new Moviee("Bahubali", "Hit");

		Consumer<Moviee> consumer1 = m -> System.out.println("Movie: " + m.name + " is ready to release");
		Consumer<Moviee> consumer2 = m -> System.out.println("Movie: " + m.name + " is just Released and it is:" + m.result);
		Consumer<Moviee> consumer3 = m -> System.out.println("Movie: " + m.name + " information storing in the database");

		Consumer<Moviee> chainedConsumer = consumer1.andThen(consumer2).andThen(consumer3);

		Moviee movie1 = new Moviee("Bahubali", "Hit");
		chainedConsumer.accept(movie1);
		System.out.println();
		Moviee movie2 = new Moviee("Spider", "Flop");
		chainedConsumer.accept(movie2);
	}
}