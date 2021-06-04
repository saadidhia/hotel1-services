package com.eya.hotel2.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.eya.hotel2.entities.Service;
import com.eya.hotel2.repos.ServiceRepository;

import java.util.List;


@org.springframework.stereotype.Service
public class ServiceService {
	@Autowired
	private ServiceRepository repository;
	
	 public Service saveService(Service serviice) {
		 return repository.save(serviice);
	    }

	    
	    public List<Service>getServices() {
	   	 return repository.findAll();
}
	    

	       public Service getServiceById(long id) {
	   	 return repository.findById(id).orElse(null);
	      }
	    
	    
	    public String deleteService(long id) {
		repository.deleteById(id);
		return "Service supprimé" +id;
	    }
	    
	    
    public Service updateServiice(Service service) {
	Service existingService =repository.findById(service.getIdService()).orElse(null);
	existingService.setImage(service.getImage());
	existingService.setDateDispo(service.getDateDispo());
	existingService.setPrice(service.getPrice());
	existingService.setDescription(service.getDescription());
	existingService.setName(service.getName());
	existingService.setNomC(service.getNomC());
	existingService.setPrenomC(service.getPrenomC());
	return repository.save(existingService);
    }
    
}
