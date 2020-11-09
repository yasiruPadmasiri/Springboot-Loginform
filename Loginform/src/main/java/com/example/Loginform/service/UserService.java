package com.example.Loginform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Loginform.domain.User;
import com.example.Loginform.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User login(String username, String password) {
		User user=repo.findByUsernameAndPassword(username,password);
		return user;
	}
}
