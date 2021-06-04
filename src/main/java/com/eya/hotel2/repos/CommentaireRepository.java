package com.eya.hotel2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eya.hotel2.entities.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

}
