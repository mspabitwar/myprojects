package com.java.durga.concept11.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class Movie {
	String name;
	String hero;
	String heroine;

	Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}

public class MovieConsumer {

	public static void main(String[] args) {

		List<Movie> movies = populate();

		Consumer<Movie> movieConsumer = moview -> {
			System.out.println("Movie Name: " + moview.name);
			System.out.println("Movie Hero: " + moview.hero);
			System.out.println("Movie Heroine: " + moview.heroine);
			System.out.println();
		};

		for (Movie movie : movies) {
			movieConsumer.accept(movie);
		}
	}
	
	private static List<Movie> populate() {
		return Arrays.asList(
			new Movie("Bahubali","Prabhas","Anushka"),
			new Movie("Rayees","Sharukh","Sunny"),
			new Movie("Dangal","Ameer","Ritu"),
			new Movie("Sultan","Salman","Anushka")
		);
	}
}