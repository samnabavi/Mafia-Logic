package com.aras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aras.model.User;
import com.aras.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/api/users")
	public List<User> getAllUsers() {
		return service.findAllUsers();
	}
	
	@PostMapping("/api/users")
	public User addNewUser(@RequestBody User user) {
		service.saveUser(user);
		return user;
	}
	
	@PutMapping("/api/users/{id}")
	public User editUser(@PathVariable long id, @RequestBody User user) {
		user.setId(id);
		service.saveUser(user);
		return user;
	}

}
