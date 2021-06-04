package com.eya.hotel2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eya.hotel2.entities.Commentaire;
import com.eya.hotel2.repos.CommentaireRepository;

import java.util.List;


@Service
public class CommentaireService {
	@Autowired
	private CommentaireRepository repository;
	
	 public Commentaire saveCommentaire(Commentaire commentaire) {
		 return repository.save(commentaire);
	    }
	
	 public List<Commentaire>getCommentaires() {
	 return repository.findAll();
    }

    public Commentaire getCommentaireById(long id) {
	 return repository.findById(id).orElse(null);
   }


    public String deleteCommentaire(long id) {
	repository.deleteById(id);
	return "Commentaire supprimé" +id;
    }

   
}
