package com.eya.hotel2.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Statistique {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdStatistique;
	
	@ManyToOne
	private Responsable responsable2;

	public Long getIdStatistique() {
		return IdStatistique;
	}

	public void setIdStatistique(Long idStatistique) {
		IdStatistique = idStatistique;
	}

	@Override
	public String toString() {
		return "Statistique [IdStatistique=" + IdStatistique + "]";
	}
	
}
