package com.eya.hotel2.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eya.hotel2.entities.Client;
import com.eya.hotel2.service.ClientService;

import java.util.List;
@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClientController {
	@Autowired
	private ClientService service;

	

	
	@GetMapping("/clients")
	public List<Client>findAllClients() {
	return service.getClients();
	    }
	
	

	@PostMapping("/clients")
	public Client addlient(@RequestBody Client client) {
	return service.saveClient(client);
	    }

	@GetMapping("/clients/{id}")
	public Client findClientById(@PathVariable Long id) {
	return service.getClientById(id);
	    }
	

	@PutMapping("/clients")
	public Client updateClient(@RequestBody Client client) {
	return service.updateClient(client);
	    }

	@DeleteMapping("/clients/{id}")
	public String deleteClient(@PathVariable Long id) {
	return service.deleteClient(id);
	    }

}
