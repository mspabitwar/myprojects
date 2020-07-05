package com.learnJava.functional.interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateAndConsumerExample {

	private static Predicate<Student> gradeFilter = (student) -> student.getGradeLevel() >= 3;
	private static Predicate<Student> gpaFilter = (student) -> student.getGpa() >= 3.9;
	
	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> studentConsumer = (student) -> {
		if(gradeFilter.and(gpaFilter).test(student)) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	};
	
	public void printNameAndActivities(List<Student> studentList) {
		studentList.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(studentList);
	}
}