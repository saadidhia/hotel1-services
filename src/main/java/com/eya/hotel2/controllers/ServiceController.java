package com.eya.hotel2.controllers;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.eya.hotel2.entities.Service;
import com.eya.hotel2.service.ServiceService;


@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/service/api")

@RestController

public class ServiceController {
	
	@Autowired
	private ServiceService service;

	    
		@PostMapping ("/services")
		public Service addService(@RequestBody Service serviice) {
		return service.saveService(serviice);
		    }

		
		
		@GetMapping("/services")
		public List<Service>findAllServices() {
		return service.getServices();
		    }


		
		@GetMapping("/services/{id}")
		public Service findServiceById(@PathVariable Long id) {
		return service.getServiceById(id);
		    }
		
	@PutMapping("/services")
	public Service updateService(@RequestBody Service service) {
	        return this.service.updateServiice(service);
	       }


	@DeleteMapping("/services/{id}")
		public String deleteSercie(@PathVariable long id) {
		        return service.deleteService(id);
		    }
}
