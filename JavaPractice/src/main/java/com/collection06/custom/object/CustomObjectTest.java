package com.collection06.custom.object;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person {
	
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}

public class CustomObjectTest {

	public static void main(String[] args) {

		Person p1 = new Person(1, "mahesh");
		Person p2 = new Person(2, "nirved");
		Person p3 = new Person(1, "mahesh");

		Map<Person, String> map = new HashMap<>();
		map.put(p1, "mahesh");
		map.put(p2, "mahesh");
		map.put(p3, "maheshNew");
		
		System.out.println(map);
		
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set);
	}
}