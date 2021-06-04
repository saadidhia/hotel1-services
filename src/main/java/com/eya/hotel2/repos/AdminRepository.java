package com.eya.hotel2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eya.hotel2.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
