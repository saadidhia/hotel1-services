package com.eya.hotel2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eya.hotel2.entities.Employé;

public interface EmployéRepository extends JpaRepository<Employé, Long> {

}
