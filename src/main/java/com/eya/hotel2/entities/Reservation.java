package com.eya.hotel2.entities;
import java.time.LocalDate;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdResrv;
	 @Temporal(TemporalType.DATE)
	private Date dateDebut;
	 @Temporal(TemporalType.DATE)
	private Date dateFin;
	private Long numChambre;
	
	 @ManyToOne
		private Client client;

	public Long getIdResrv() {
		return IdResrv;
	}

	public void setIdResrv(Long idResrv) {
		IdResrv = idResrv;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Long getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(Long numChambre) {
		this.numChambre = numChambre;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Reservation [IdResrv=" + IdResrv + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", numChambre="
				+ numChambre + ", client=" + client + "]";
	}

	public Reservation(Long idResrv, Date dateDebut, Date dateFin, Long numChambre, Client client) {
		super();
		IdResrv = idResrv;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.numChambre = numChambre;
		this.client = client;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	 
}
