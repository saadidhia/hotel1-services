package com.eya.hotel2.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Chambre {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdChambre;
  
    private Long numChambre;

    private String typeChambre;

    private String description;
 
    private String etat;
    
    @Lob
	@Column(name="image",columnDefinition = "TEXT")
	private String image;
    
    @ManyToOne
	private Responsable responsable;
 
	public Chambre() {
		super();
	}
	
	

	public Chambre(Long numChambre, String typeChambre, String description,
			String etat, String nomClient, String image) {
		super();
		this.numChambre = numChambre;
		this.typeChambre = typeChambre;
		this.description = description;
		this.etat = etat;
		this.image = image;
		
	}



	public Long getIdChambre() {
		return IdChambre;
	}

	public void setIdChambre(Long idChambre) {
		IdChambre = idChambre;
	}

	public Long getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(Long numChambre) {
		this.numChambre = numChambre;
	}

	public String getTypeChambre() {
		return typeChambre;
	}

	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}



	@Override
	public String toString() {
		return "Chambre [IdChambre=" + IdChambre + ", numChambre=" + numChambre + ", typeChambre=" + typeChambre
				+ ", description=" + description + ", etat=" + etat + ", image=" + image + "]";
	}

}
