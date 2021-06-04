package com.eya.hotel2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eya.hotel2.entities.User;
import com.eya.hotel2.service.UserService;

import java.util.List;
@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/user/api")
public class UserController {
	@Autowired
	private UserService service;

	

	
	@GetMapping("/users")
	public List<User>findAllUsers() {
	return service.getUsers();
	    }
	
	

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
	return service.saveUser(user);
	    }

	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable Long id) {
	return service.getUserById(id);
	    }
	

	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
	return service.updateUser(user);
	    }

	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable Long id) {
	return service.deleteUser(id);
	    }

}
