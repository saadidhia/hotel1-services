package com.eya.hotel2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eya.hotel2.entities.Client;
import com.eya.hotel2.repos.ClientRepository;

import java.util.List;


@Service
public class ClientService {
	@Autowired
	private ClientRepository repository;
	
    public Client saveClient(Client client) {
	 return repository.save(client);
    }

    

    public List<Client>getClients() {
	 return repository.findAll();
    }

    public Client getClientById(long id) {
	 return repository.findById(id).orElse(null);
   }


    public String deleteClient(long id) {
    	repository.deleteById(id);
		return "Client supprimé" +id;
    }

    public Client updateClient(Client client) {
	Client existingClient=repository.findById(client.getId()).orElse(null);
	existingClient.setUsername(client.getUsername());
	existingClient.setPrenom(client.getPrenom());
	existingClient.setDateNaiss(client.getDateNaiss());
	existingClient.setAdresse(client.getAdresse());
	existingClient.setTelephone(client.getTelephone());
	existingClient.setImage(client.getImage());
	return repository.save(existingClient);
    }

}
