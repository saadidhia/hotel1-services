package com.eya.hotel2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eya.hotel2.entities.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
