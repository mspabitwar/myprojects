package com.spring.security.jwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "custom_user")
public class User {

	@Id
	private Integer userId;
	private String name;
	private String surname;
	private String password;
	
	public User() {
	}
	
	public User(Integer userId, String name, String surname, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.surname = surname;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", surname=" + surname + ", password=" + password + "]";
	}
}