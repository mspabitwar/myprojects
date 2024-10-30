package com.java.durga.concept14.BiFunctionalInterfaces;

import java.util.function.BiFunction;

class Student {
	String name;
	int rollNumber;

	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
}

class Employee {
	int eno;
	String name;
	double dailyWage;

	Employee(int eno, String name, double dailyWage) {
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
}

class TimeSheet {
	int eno;
	int days;

	TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}

public class BiFunctionDemo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> numberMultiplier = (n1, n2) -> n1 * n2;
		System.out.println("Product of 5 and 11 is " + numberMultiplier.apply(5, 11));

		BiFunction<String, Integer, Student> studentFunction = (name, rollNumber) -> new Student(name, rollNumber);
		System.out.println(studentFunction.apply("durga", 100));

		BiFunction<Employee, TimeSheet, Double> salaryFunction = (emp, timesheet) -> emp.dailyWage * timesheet.days;
		Employee emp = new Employee(100, "durga", 1500);
		TimeSheet timesheet = new TimeSheet(100, 25);
		System.out.println("Salary = " + salaryFunction.apply(emp, timesheet));
	}
}