package com.eya.hotel2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eya.hotel2.entities.Planning;
import com.eya.hotel2.repos.PlanningRepository;

import java.util.List;


@Service

public class PlanningService {
	@Autowired
	private PlanningRepository repository;
	
    public Planning savePlanning(Planning planning) {
	 return repository.save(planning);
    }

    public String deletePlanning(long id) {
	repository.deleteById(id);
	return "Planning supprimé" +id;
    }

    public Planning updatePlanning(Planning planning) {
	Planning existingPlanning=repository.findById(planning.getIdPlanning()).orElse(null);
	existingPlanning.setDate(planning.getDate());
	existingPlanning.setNomEmp(planning.getNomEmp());
	existingPlanning.setPrenomEmp(planning.getPrenomEmp());
	existingPlanning.setTimein(planning.getTimein());
	existingPlanning.setTimeout(planning.getTimeout());
	return repository.save(existingPlanning);
    }
    
    public List<Planning>getPlannings() {
		 return repository.findAll();
	    }

	    public Planning getPlanningById(long id) {
		 return repository.findById(id).orElse(null);
	   }
}
