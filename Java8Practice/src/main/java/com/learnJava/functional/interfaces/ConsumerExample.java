package com.learnJava.functional.interfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerExample {

	private static Consumer<Student> consumer2 = student -> System.out.println(student);
	private static Consumer<Student> consumer3 = student -> System.out.print(student.getName().toUpperCase());
	private static Consumer<Student> consumer4 = student -> System.out.println(student.getActivities());

	public static void printName() {
		System.out.println("printName : ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(consumer2);
	}

	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities : ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(consumer3.andThen(consumer4));
	}

	public static void printNameAndActivitiesUsingCondition() {
		System.out.println("printNameAndActivitiesUsingCondition : ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				consumer3.andThen(consumer4).accept(student);
			}
		});
	}

	public static void main(String[] args) {

		Consumer<String> consumer1 = (str) -> System.out.println(str.toUpperCase());
		consumer1.accept("java8");

		printName();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}
}
