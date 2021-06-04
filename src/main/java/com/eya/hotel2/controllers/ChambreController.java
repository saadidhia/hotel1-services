package com.eya.hotel2.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eya.hotel2.entities.Chambre;
import com.eya.hotel2.service.ChambreService;

import java.util.List;
@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/chambre/api")


public class ChambreController {
	@Autowired
	private ChambreService service;

	

	
	@GetMapping("/chambres")
	public List<Chambre>findAllChambres() {
	return service.getChambres();
	    }
	
	

	@PostMapping("/chambres")
	public Chambre addChambre(@RequestBody Chambre chambre) {
	return service.saveChambre(chambre);
	    }

	@GetMapping("/chambres/{id}")
	public Chambre findChambreById(@PathVariable Long id) {
	return service.getChambreById(id);
	    }
	

	@PutMapping("/chambres")
	public Chambre updateChambre(@RequestBody Chambre chambre) {
	return service.updateChambre(chambre);
	    }

	@DeleteMapping("/chambres/{id}")
	public String deleteChambre(@PathVariable Long id) {
	return service.deleteChambre(id);
	    }
}


