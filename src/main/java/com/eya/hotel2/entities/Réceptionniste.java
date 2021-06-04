package com.eya.hotel2.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@DiscriminatorValue("Réceptionniste")
public class Réceptionniste extends User {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idRécep;
	
	
	public Long getIdRécep() {
		return idRécep;
	}
	public void setIdRécep(Long idRécep) {
		this.idRécep = idRécep;
	}
	@Override
	public String toString() {
		return "Réceptionniste [idRécep=" + idRécep + "]";
	}

}
