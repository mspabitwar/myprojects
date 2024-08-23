package com.collection08.sorting.natural;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person person) {
		//int result = this.name.compareTo(person.name);
		int result = Integer.compare(this.name.length(), person.name.length());
		result = result != 0 ? result : this.name.compareTo(person.name);
		return result;
	}
}

public class NaturalSortingTest {

	public static void main(String[] args) {

		List<Person> personsList = new ArrayList<>();
		SortedSet<Person> personsSet = new TreeSet<>();

		addElements(personsList);
		addElements(personsSet);

		Collections.sort(personsList);

		showElements(personsList);
		System.out.println();
		showElements(personsSet);
	}

	private static void addElements(Collection<Person> collection) {
		collection.add(new Person("mahesh"));
		collection.add(new Person("nirved"));
		collection.add(new Person("swati"));
		collection.add(new Person("vijaya"));
		collection.add(new Person("shankar"));
	}

	private static void showElements(Collection<Person> collection) {
		for(Person element : collection) {
			System.out.println(element);
		}
	}
}