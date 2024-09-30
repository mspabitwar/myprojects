package com.spring.data.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.data.jpa.entity.Course;
import com.spring.data.jpa.entity.CourseMaterial;

@SpringBootTest
class CourseMaterialRepositoryTest {

	@Autowired
	private CourseMaterialRepository repository;

	@Test
	public void SaveCourseMaterial() {
		Course course = Course.builder().title("DSA").credit(6).build();
		CourseMaterial courseMaterial = CourseMaterial.builder().url("www.google.com").course(course).build();
		repository.save(courseMaterial);
	}
	
	@Test
	public void printAllCourseMaterials() {
		List<CourseMaterial> courseMaterials = repository.findAll();
		System.out.println("courseMaterials = " + courseMaterials);
	}
}