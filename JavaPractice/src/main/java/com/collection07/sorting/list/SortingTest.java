package com.collection07.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparitor implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();

		if (length1 < length2) {
			return -1;
		} else if (length1 > length2) {
			return 1;
		}

		return 0;
	}

}

class StringReverseComparitor implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return str2.compareTo(str1);
	}

}

class Person {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		//return "Person [id=" + id + ", name=" + name + "]";
		return id + ":" + name;
	}
}

public class SortingTest {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<>();
		animals.add("tiger");
		animals.add("cockroach");
		animals.add("cat");
		animals.add("dog");
		animals.add("donkey");

		System.out.println("Before Sorting : " + animals);
		Collections.sort(animals);
		System.out.println("After Sorting without comparitor : " + animals);
		Collections.sort(animals, new StringLengthComparitor());
		System.out.println("After Sorting with StringLengthComparitor : " + animals);
		Collections.sort(animals, new StringReverseComparitor());
		System.out.println("After Sorting with StringReverseComparitor : " + animals);

		List<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(8);
		numbers.add(11);
		numbers.add(16);
		numbers.add(15);

		System.out.println("Before Sorting : " + numbers);
		Collections.sort(numbers);
		System.out.println("After Sorting without comparitor : : " + numbers);
		Collections.sort(numbers, (num1, num2) -> num2.compareTo(num1));
		System.out.println("After Sorting with IntegerReverseComparitor : : " + numbers);
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(5, "mahesh"));
		persons.add(new Person(1, "nirved"));
		persons.add(new Person(3, "swati"));
		persons.add(new Person(4, "vijaya"));
		persons.add(new Person(2, "shankar"));
		
		System.out.println("Before Sorting : " + persons);
		Collections.sort(persons, (person1, person2) -> person1.getName().compareTo(person2.getName()));
		System.out.println("After Sorting with name comparitor : : " + persons);
		Collections.sort(persons, (person1, person2) -> Integer.compare(person1.getId(), person2.getId()));
		System.out.println("After Sorting with id comparitor : : " + persons);
	}
}