package com.eya.hotel2.repos;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eya.hotel2.entities.ImageModel;


public interface ImageRepository extends JpaRepository<ImageModel, Long> {

	Optional<ImageModel> findByName(String name);



}