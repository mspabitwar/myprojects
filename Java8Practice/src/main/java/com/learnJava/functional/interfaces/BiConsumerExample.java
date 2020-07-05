package com.learnJava.functional.interfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiConsumerExample {

    public static void printNameAndActivities(){

        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student) -> studentBiConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {


        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println(" a : "  +  a + " b : " + b );
        };
        biConsumer.accept("java7" , "java8");

        BiConsumer<Integer, Integer> multiply = (a,b) -> {
            System.out.println("Multiplication : " + (a * b));
        };


        BiConsumer<Integer, Integer> addition = (a,b) -> {
            System.out.println("Addition : " + (a + b));
        };

        BiConsumer<Integer, Integer> division = (a,b) -> {
            System.out.println("Division : "  + (a / b));
        };

        multiply.andThen(addition).andThen(division).accept(10,5);

        printNameAndActivities();

    }
}