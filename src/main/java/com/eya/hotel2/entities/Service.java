package com.eya.hotel2.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

@Entity(name = "services")

public class Service {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long IdService;
	 
		private String name;
		
		private String description;
		
		private int  price;
		
		private Date dateDispo;
		
		@Column(columnDefinition = "MEDIUMTEXT")
		@Type(type = "org.hibernate.type.TextType")
		private String image;
		
		//@Column(name = "picByte", length = 1000)
	    //private byte[] picByte;
		
		private String nomC;
		
		private String prenomC;
		
		  @ManyToOne
			private Client client2;
		  @ManyToOne
			private Employé employe;
		  
		  
		  
		public Service() {
			super();
		}


		public Service(String name, String description, int price, Date dateDispo, String image, String nomC,
				String prenomC) {
			super();
			this.name = name;
			this.description = description;
			this.price = price;
			this.dateDispo = dateDispo;
			 
			 this.image = image;
			this.nomC = nomC;
			this.prenomC = prenomC;
		}



		public Long getIdService() {
			return IdService;
		}



		public void setIdService(Long idService) {
			IdService = idService;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public int getPrice() {
			return price;
		}



		public void setPrice(int price) {
			this.price = price;
		}



		public Date getDateDispo() {
			return dateDispo;
		}



		public void setDateDispo(Date dateDispo) {
			this.dateDispo = dateDispo;
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
			return "Service [IdService=" + IdService + ", name=" + name + ", description=" + description + ", price="
					+ price + ", dateDispo=" + dateDispo + ", =" + prenomC + ", nomC=" + nomC + ", prenomC=" + prenomC
					+ "]";
		}


		public String getImage() {
			return image;
		}


		public void setImage(String image) {
			this.image = image;
		}


		
		
		
}
