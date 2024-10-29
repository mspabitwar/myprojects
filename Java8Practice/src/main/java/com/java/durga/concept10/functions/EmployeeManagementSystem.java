package com.java.durga.concept10.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		List<Employee> employees = populate();
		System.out.println(employees);
		System.out.println("**********************************************************************");

		Function<List<Employee>, Double> totalSalaryCalculator = emps -> {
			double totalSalary = 0;
			for (Employee emp : emps) {
				totalSalary += emp.salary;
			}
			return totalSalary;
		};
		System.out.println("The total salary of this month = " + totalSalaryCalculator.apply(employees));
		System.out.println("**********************************************************************");

		Predicate<Employee> salaryChecker = emp -> emp.salary <= 3500;
		Function<Employee, Employee> salaryIncrementer = emp -> {
			emp.salary += 500;
			return emp;
		};

		System.out.println("Before Increment: " + employees);
		for (Employee employee : employees) {
			if (salaryChecker.test(employee)) {
				salaryIncrementer.apply(employee);
			}
		}
		System.out.println("After Increment: " + employees);

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