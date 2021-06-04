package com.eya.hotel2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eya.hotel2.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
