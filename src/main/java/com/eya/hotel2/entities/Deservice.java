package com.eya.hotel2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "deservice")
public class Deservice {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long IdSer;
	 
		private String name;
		
		private String description;

		private String nomC;
		private String prenomC;
		
		
		
		public Deservice() {
			super();
		}
		
		
		public Deservice(String name, String description, String nomC, String prenomC) {
			super();
			this.name = name;
			this.description = description;
			this.nomC = nomC;
			this.prenomC = prenomC;
		}


		public Long getIdSer() {
			return IdSer;
		}
		public void setIdSer(Long idSer) {
			IdSer = idSer;
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
			return "Deservice [IdSer=" + IdSer + ", name=" + name + ", description=" + description + ", nomC="
					+ nomC + ", prenomC=" + prenomC + "]";
		}
		
		

}
