package com.eya.hotel2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eya.hotel2.entities.Chambre;
import com.eya.hotel2.repos.ChambreRepository;

import java.util.List;


@Service
public class ChambreService {
    @Autowired
	private ChambreRepository repository;
	
    public Chambre saveChambre(Chambre chambre) {
	 return repository.save(chambre);
    }

    

    public List<Chambre>getChambres() {
	 return repository.findAll();
    }

    public Chambre getChambreById(long id) {
	 return repository.findById(id).orElse(null);
   }


    public String deleteChambre(long id) {
    	repository.deleteById(id);
		return "Chambre supprimé" +id;
    }

    public Chambre updateChambre(Chambre chambre) {
	Chambre existingChambre=repository.findById(chambre.getIdChambre()).orElse(null);
	existingChambre.setNumChambre(chambre.getNumChambre());
	existingChambre.setTypeChambre(chambre.getTypeChambre());
	existingChambre.setDescription(chambre.getDescription());
	existingChambre.setEtat(chambre.getEtat());
	existingChambre.setImage(chambre.getImage());
	return repository.save(existingChambre);
    }
}

