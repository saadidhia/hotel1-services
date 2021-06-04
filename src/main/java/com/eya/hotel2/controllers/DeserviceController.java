package com.eya.hotel2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.eya.hotel2.entities.Deservice;
import com.eya.hotel2.service.DeserviceService;



@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/deservice/api")

@RestController

public class DeserviceController {
	@Autowired
	private DeserviceService service;

	    
		@PostMapping ("/deservices")
		public Deservice addService(@RequestBody Deservice serviice) {
		return service.saveService(serviice);
		    }

		
		
		@GetMapping("/deservices")
		public List<Deservice>findAllServices() {
		return service.getServices();
		    }


		
		@GetMapping("/deservices/{id}")
		public Deservice findServiceById(@PathVariable Long id) {
		return service.getServiceById(id);
		    }
		

}
