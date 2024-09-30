package com.spring.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByFirstName(String firstName);

	public List<Student> findByFirstNameContaining(String name);

	public List<Student> findByGuardianName(String guardianName);

	// JPQL
	@Query("select s from Student s where s.emailId = ?1")
	public Student getStudentByEmailAddress(String emailId);

	// JPQL
	@Query("select s.firstName from Student s where s.emailId = ?1")
	public String getStudentFirstNameByEmailAddress(String emailId);

	// Native query
	@Query(nativeQuery = true, value = "select * from tbl_student s where s.email_address = ?1")
	public Student getStudentByEmailAddressNative(String emailId);

	// Native query named param
	@Query(nativeQuery = true, value = "select * from tbl_student s where s.email_address = :emailId")
	public Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String emailId);
}