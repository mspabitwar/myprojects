package com.spring.security.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.security.jwt.model.User;
import com.spring.security.jwt.model.UserPrincipal;
import com.spring.security.jwt.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User createUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByName(username);
		
		if(user == null) {
			System.out.println("user not found!!!");
			throw new UsernameNotFoundException("user not found!!!");
		}
		
		return new UserPrincipal(user);
	}
}