package com.eya.hotel2.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eya.hotel2.entities.Commentaire;
import com.eya.hotel2.service.CommentaireService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/commentaire/api/")
public class CommentaireController {
	@Autowired
    private CommentaireService service;
 
    @PostMapping("/commentaires")
    public Commentaire addCommentaire(@RequestBody Commentaire commentaire) {
        return service.saveCommentaire(commentaire);
    }


    @GetMapping("/commentaires")
    public List<Commentaire> findAllCommentaires() {
        return service.getCommentaires();
    }

    @GetMapping("/commentaires/{id}")
    public Commentaire findCommentaireById(@PathVariable long id) {
        return service.getCommentaireById(id);
    }


    @DeleteMapping("/commentaires/{id}")
    public String deleteCommentaire(@PathVariable long id) {
        return service.deleteCommentaire(id);
    }

}
