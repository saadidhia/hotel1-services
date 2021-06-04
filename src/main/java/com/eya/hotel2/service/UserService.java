package com.eya.hotel2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eya.hotel2.entities.User;
import com.eya.hotel2.repos.UserRepository;

import java.util.List;


@Service
public class UserService {
	 @Autowired
		private UserRepository repository;
		
	    public User saveUser(User user) {
		 return repository.save(user);
	    }

	    

	    public List<User>getUsers() {
		 return repository.findAll();
	    }

	    public User getUserById(long id) {
		 return repository.findById(id).orElse(null);
	   }


	    public String deleteUser(long id) {
	    	repository.deleteById(id);
			return "User supprimé" +id;
	    }

	    public User updateUser(User user) {
	    	User existingUser=repository.findById(user.getId()).orElse(null);
		    existingUser.setUsername(user.getUsername());
		    existingUser.setPassword(user.getPassword());
		    existingUser.setEmail(user.getEmail());
		    existingUser.setRoles(user.getRoles());
		    return repository.save(existingUser);
	    }
}
