package com.java.durga.concept10.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	
	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> strLengthFun = s -> s.length();
		System.out.println("Length of Durgasoft = " + strLengthFun.apply("Durgasoft"));

		Function<Integer, Integer> squareFun = n -> n * n;
		System.out.println("Square of 5 = " + squareFun.apply(5));

		Function<String, String> spaceRemoverFun = s -> s.replaceAll(" ", "");
		System.out.println("String after removing spaces: " + spaceRemoverFun.apply("abc pqr xyz"));

		Function<String, Integer> spaceCounFun = s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println("Blank spaces count = " + spaceCounFun.apply("abc pqr xyz"));
		
		List<Student> students = populate();
		Function<Student, String> gradeCalculator = s -> {
			int marks = s.marks;
			String grade = null;
			if (marks >= 80) {
				grade = "A[Dictinction]";
			} else if (marks >= 60) {
				grade = "B[First class]";
			} else if (marks >= 50) {
				grade = "C[Second class]";
			} else if (marks >= 35) {
				grade = "D[Third class]";
			} else {
				grade = "E[Failed]";
			}
			return grade;
		};
		Predicate<Student> marksPredicate = s -> s.marks >= 60;

		for (Student student : students) {
			if (marksPredicate.test(student)) {
				System.out.println("Student Name: " + student.name + ", Makrs: " + student.marks + ", Grade: "
						+ gradeCalculator.apply(student));
			}
		}

	}
	
	public static List<Student> populate() {
		return Arrays.asList(
			new Student("Sunny",100),
			new Student("Bunny",65),
			new Student("Chinny",55),
			new Student("Vinny",45),
			new Student("Pinny",25)
		);
	}
}