package com.aras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aras.dao.UserRepository;
import com.aras.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> findAllUsers() {
		return (List<User>) repo.findAll();
	}
	
	public User saveUser(User user) {
		return repo.save(user);
	}
}
