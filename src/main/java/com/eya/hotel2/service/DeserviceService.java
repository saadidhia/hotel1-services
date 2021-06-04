package com.eya.hotel2.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.eya.hotel2.entities.Deservice;
import com.eya.hotel2.repos.DeserviceRepository;


import java.util.List;


@org.springframework.stereotype.Service

public class DeserviceService {
	
	@Autowired
	private DeserviceRepository repository;
	
	 public Deservice saveService(Deservice serviice) {
		 return repository.save(serviice);
	    }
	 
	    public List<Deservice>getServices() {
		   	 return repository.findAll();
	}
		    

		       public Deservice getServiceById(long id) {
		   	 return repository.findById(id).orElse(null);
		      }
		    

}
