package com.spring.security.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.security.jwt.model.User;
import com.spring.security.jwt.model.UserPrincipal;
import com.spring.security.jwt.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByName(username);
		if (user == null) {
			System.out.println("user not found!!!");
			throw new UsernameNotFoundException("user not found!!!");
		}
		return new UserPrincipal(user);
	}
}