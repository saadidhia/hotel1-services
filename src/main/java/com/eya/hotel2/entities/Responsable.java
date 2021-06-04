package com.eya.hotel2.entities;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("Responsable")
public class Responsable extends User {

	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idResp;
	
	 @OneToMany (mappedBy = "responsable")
	    private List<Chambre> chambres;
	 
	
	public Long getIdResp() {
		return idResp;
	}
	public void setIdResp(Long idResp) {
		this.idResp = idResp;
	}
	@Override
	public String toString() {
		return "Responsable [idResp=" + idResp + "]";
	}
	public List<Chambre> getChambres() {
		return chambres;
	}
	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}
	
	
}
