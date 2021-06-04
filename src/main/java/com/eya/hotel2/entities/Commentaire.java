package com.eya.hotel2.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Commentaire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdComm;
	private String commentaire;
	
	@Temporal(TemporalType.DATE)
	private Date dateAjout;
	private String nomC;
	private String prenomC;
	
    @ManyToOne
	private Client client;
	



	public Commentaire() {
		super();
	}


	public Commentaire(String commentaire, Date dateAjout, String nomC, String prenomC, Client client) {
		super();
		this.commentaire = commentaire;
		this.dateAjout = dateAjout;
		this.nomC = nomC;
		this.prenomC = prenomC;
		this.client = client;
	}



	public Long getIdComm() {
		return IdComm;
	}


	public void setIdComm(Long idComm) {
		IdComm = idComm;
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	public Date getDateAjout() {
		return dateAjout;
	}


	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}


	public String getNomC() {
		return nomC;
	}


	public void setNomC(String nomC) {
		this.nomC = nomC;
	}


	public String getPrenomC() {
		return prenomC;
	}


	public void setPrenomC(String prenomC) {
		this.prenomC = prenomC;
	}

	

	@Override
	public String toString() {
		return "Commentaire [IdComm=" + IdComm + ", commentaire=" + commentaire + ", dateAjout=" + dateAjout + ", nomC="
				+ nomC + ", prenomC=" + prenomC + "]";
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
