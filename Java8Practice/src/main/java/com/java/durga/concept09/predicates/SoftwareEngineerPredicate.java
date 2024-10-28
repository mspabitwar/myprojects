package com.java.durga.concept09.predicates;

import java.util.function.Predicate;

class SoftwareEngineer {
	String name;
	int age;
	boolean havingGirlfriend;

	public SoftwareEngineer(String name, int age, boolean havingGirlfriend) {
		super();
		this.name = name;
		this.age = age;
		this.havingGirlfriend = havingGirlfriend;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class SoftwareEngineerPredicate {

	public static void main(String[] args) {

		SoftwareEngineer[] list = {
			new SoftwareEngineer("Durga", 60, false),
			new SoftwareEngineer("Sunny", 25, true),
			new SoftwareEngineer("Sanjay", 26, true),
			new SoftwareEngineer("Kiran", 28, false),
			new SoftwareEngineer("Ravi", 19, true)
		};
		
		Predicate<SoftwareEngineer> allowed = s -> s.age > 18 && s.havingGirlfriend;
		
		System.out.println("The software engineers allowed in the pub are:");
		for(SoftwareEngineer se: list ) {
			if(allowed.test(se)) {
				System.out.println(se);
			}
		}
	}
}