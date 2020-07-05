package com.learnJava.functional.interfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateStudentExample {

	private static Predicate<Student> gradeFilter = (student) -> student.getGradeLevel() >= 3;
	private static Predicate<Student> gpaFilter = (student) -> student.getGpa() >= 3.9;
	
	public static void filterStudentsByGrades() {
		System.out.println("filterStudentsByGrades : ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach((student)-> {
			if(gradeFilter.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudentsByGPA() {
		System.out.println("filterStudentsByGPA : ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach((student)-> {
			if(gpaFilter.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudentsByGradesAndGPA() {
		System.out.println("filterStudentsByGradesAndGPA : ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach((student)-> {
			if(gradeFilter.and(gpaFilter).test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void main(String[] args) {

		filterStudentsByGrades();
		filterStudentsByGPA();
		filterStudentsByGradesAndGPA();
	}
}
