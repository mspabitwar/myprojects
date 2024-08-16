package com.spring.security.jwt;

import org.springframework.stereotype.Component;

import com.spring.security.jwt.model.User;
import com.spring.security.jwt.repository.UserRepository;

@Component
public class InitialUserLoader {

	private UserRepository userRepository;
	
	public InitialUserLoader(UserRepository userRepository) {
		this.userRepository = userRepository;
		LoadUsers();
	}

	private void LoadUsers() {
		userRepository.save(new User(1,"admin","admin","admin"));
	}
}