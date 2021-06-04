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
public class Reclamation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdRecl;

	 private String type;
	    private String description;
	    
	    @Temporal(TemporalType.DATE)
	    private Date dateRecl;
	    private String nomC;
		private String prenomC;
	    
	    @ManyToOne
		private Client client1;
	    
	    

		public Reclamation() {
			super();
		}

		public Reclamation(String type, String description, Date dateRecl, String nomC, String prenomC) {
			super();
			this.type = type;
			this.description = description;
			this.dateRecl = dateRecl;
			this.nomC = nomC;
			this.prenomC = prenomC;
		}


		public Long getIdRecl() {
			return IdRecl;
		}

		public void setIdRecl(Long idRecl) {
			IdRecl = idRecl;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Date getDateRecl() {
			return dateRecl;
		}

		public void setDateRecl(Date dateRecl) {
			this.dateRecl = dateRecl;
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
			return "Réclamation [IdRecl=" + IdRecl + ", type=" + type + ", description=" + description + ", dateRecl="
					+ dateRecl + ", nomC=" + nomC + ", prenomC=" + prenomC + "]";
		}

}
