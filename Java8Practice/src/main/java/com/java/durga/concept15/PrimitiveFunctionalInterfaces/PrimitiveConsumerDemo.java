package com.java.durga.concept15.PrimitiveFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + ":" + salary;
	}
}

public class PrimitiveConsumerDemo {

	public static void main(String[] args) {

		// IntConsumer - it takes int as input
		IntConsumer consumer = n -> System.out.println("The square of " + n + " is " + n * n);
		consumer.accept(10);
		// Similarly there are LongConsumer & DoubleConsumer
		
	
		List<Employee> employees = populate();
		ObjDoubleConsumer<Employee> salaryIncrementer = (emp, increment) -> emp.salary += increment;

		System.out.println("Before Increment: " + employees);
		for (Employee employee : employees) {
			salaryIncrementer.accept(employee, 500.0);
		}
		System.out.println("After Increment: " + employees);
		// Similarly there are ObjIntConsumer & ObjLongConsumer

	}
	
	private static List<Employee> populate() {
		return Arrays.asList(
			new Employee("Sunny",1000),
			new Employee("Bunny",2000),
			new Employee("Chinny",3000),
			new Employee("Pinny",4000),
			new Employee("Vinny",5000)
		);
	}
}