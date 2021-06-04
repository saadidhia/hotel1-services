package com.eya.hotel2.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@DiscriminatorValue("Employé")
public class Employé extends User {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idEmpl;
	

	public Long getIdEmpl() {
		return idEmpl;
	}
	public void setIdEmpl(Long idEmpl) {
		this.idEmpl = idEmpl;
	}
	@Override
	public String toString() {
		return "Employé [idEmpl=" + idEmpl + "]";
	}
	
	

}

