package com.eya.hotel2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eya.hotel2.entities.ERole;
import com.eya.hotel2.entities.Role;
import com.eya.hotel2.repos.RoleRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
	private RoleRepository roleRepo;
	
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/roles")
	public Role getRoles() {
		return roleRepo.findByName(ERole.ROLE_EMPLOYE).get();
	}
	
	@GetMapping("/responsable")
	@PreAuthorize("hasRole('RESPONSABLE')")
	public String responableAccess() {
		return "Responsable Board.";
	}

	@GetMapping("/receptionniste")
	@PreAuthorize("hasRole('RECEPTIONNISTE')")
	public String receptionnisteAccess() {
		return "Receptionniste Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	
	@GetMapping("/client")
	@PreAuthorize("hasRole('CLIENT')")
	public String clientAccess() {
		return "Client Board.";
	}
	@GetMapping("/employe")
	@PreAuthorize("hasRole('EMPLOYE')")
	public String employeAccess() {
		return "Employe Board.";
	}
}
