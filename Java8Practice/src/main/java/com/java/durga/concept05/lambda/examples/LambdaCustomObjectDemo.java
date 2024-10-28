package com.java.durga.concept05.lambda.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

	int empNo;
	String empName;

	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empNo + ":" + empName;
	}
}

public class LambdaCustomObjectDemo {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(200, "Deepika"), new Employee(400, "Sunny"),
				new Employee(300, "Mallika"), new Employee(100, "Katrina"));

		System.out.println("Before Sorting : " + employees);

		Comparator<Employee> comparator = (e1, e2) -> e2.empNo - e1.empNo;
		Collections.sort(employees, comparator);
		System.out.println("After Custom Sorting : " + employees);

	}
}