package com.eya.hotel2.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eya.hotel2.entities.Reclamation;
import com.eya.hotel2.service.ReclamationService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/reclamation/api/")
public class ReclamationController {
	 @Autowired
	    private ReclamationService service;
	 
	    @PostMapping("/reclamations")
	    public Reclamation addReclamation(@RequestBody Reclamation reclamation) {
	        return service.saveReclamation(reclamation);
	    }

	    @GetMapping("/reclamations")
	    public List<Reclamation> findAllReclamations() {
	        return service.getReclamations();
	    }

	    @GetMapping("/reclamations/{id}")
	    public Reclamation findReclamationById(@PathVariable long id) {
	        return service.getReclamationById(id);
	    }

	   

	    @DeleteMapping("/reclamations/{id}")
	    public String deleteReclamation(@PathVariable long id) {
	        return service.deleteReclamation(id);
	    }
}
