package com.java.durga.concept14.BiFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employees {
	String name;
	double salary;

	Employees(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", salary=" + salary + "]";
	}
}

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + s2);
		System.out.print("Concatenation of durga and soft is ");
		biConsumer.accept("durga", "soft");
		
		BiConsumer<Employees, Double> salaryIncrement = (emp, increment) -> emp.salary += increment;
		List<Employees> employees = populate();

		for (Employees emp : employees) {
			salaryIncrement.accept(emp, 500.0);
			System.out.println(emp);
		}
	}
	
	public static List<Employees> populate(){
		
		BiFunction<String, Double, Employees> empFunction = (name, salary) -> new Employees(name, salary);

		return Arrays.asList(
			empFunction.apply("Durga", 1000.0),
			empFunction.apply("Sunny", 2000.0),
			empFunction.apply("Bunny", 3000.0),
			empFunction.apply("Chinny", 4000.0)
		);
	}
}