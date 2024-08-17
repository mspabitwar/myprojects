package com.spring.security.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.jwt.model.User;
import com.spring.security.jwt.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.register(user);
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	@PostMapping("/loginn")
	public String login(@RequestBody User user) {
		return userService.verify(user);
	}
}