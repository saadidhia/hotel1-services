package com.eya.hotel2.entities;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@DiscriminatorValue("Client")
public class Client extends User {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	private String prenom;
	    
	    @Temporal(TemporalType.DATE)
	    private Date dateNaiss;
	    private String adresse;
	    private Long telephone;
	    @Lob
	    @Column(name="image",columnDefinition = "TEXT")
	    private String image;
	    
	    public Long getIdClient() {
			return idClient;
		}
		public void setIdClient(Long idClient) {
			this.idClient = idClient;
		}
		
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public Date getDateNaiss() {
			return dateNaiss;
		}
		public void setDateNaiss(Date dateNaiss) {
			this.dateNaiss = dateNaiss;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public Long getTelephone() {
			return telephone;
		}
		public void setTelephone(Long telephone) {
			this.telephone = telephone;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		@Override
		public String toString() {
			return "Client [idClient=" + idClient + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss + ", adresse="
					+ adresse + ", telephone=" + telephone + ", image=" + image + "]";
		}
		public Client(Long idClient,String prenom, Date dateNaiss, String adresse, Long telephone, String image) {
			super();
			this.idClient = idClient;
			this.prenom = prenom;
			this.dateNaiss = dateNaiss;
			this.adresse = adresse;
			this.telephone = telephone;
			this.image = image;
		}
		public Client() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Client(String username, String email, String password) {
			super(username, email, password);
			// TODO Auto-generated constructor stub
		}
	    
		
	  
}



