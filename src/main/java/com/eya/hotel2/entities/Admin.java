package com.eya.hotel2.entities;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@DiscriminatorValue("Admin")
public class Admin extends User {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAdmin;

	public Long getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}

	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + "]";
	}
	
}
