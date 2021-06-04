package com.eya.hotel2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eya.hotel2.entities.Reclamation;
import com.eya.hotel2.repos.ReclamationRepository;

import java.util.List;


@Service
public class ReclamationService {
	@Autowired
	private ReclamationRepository repository;
 
 public Reclamation saveReclamation(Reclamation reclamation) {
	 return repository.save(reclamation);
    }

 public List<Reclamation>getReclamations() {
 return repository.findAll();
}

public Reclamation getReclamationById(long id) {
 return repository.findById(id).orElse(null);
}


public String deleteReclamation(long id) {
repository.deleteById(id);
return "Reclamation supprimé" +id;
}


}
