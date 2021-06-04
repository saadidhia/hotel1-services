package com.eya.hotel2.entities;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Planning {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long IdPlanning;
	 @Temporal (TemporalType.DATE)
	  private Date date;

	  private LocalTime timein;
	 
	 
	  private LocalTime timeout;
	  
	  private String nomEmp;
	  private String prenomEmp;
    
    @ManyToOne
	private Responsable responsable1;

    
    
	public Planning() {
		super();
	}
	
	

	public Planning(Date date, LocalTime timein, LocalTime timeout, String nomEmp, String prenomEmp) {
		super();
		this.date = date;
		this.timein = timein;
		this.timeout = timeout;
		this.nomEmp = nomEmp;
		this.prenomEmp = prenomEmp;
	}



	public Long getIdPlanning() {
		return IdPlanning;
	}

	public void setIdPlanning(Long idPlanning) {
		IdPlanning = idPlanning;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public LocalTime getTimein() {
		return timein;
	}

	public void setTimein(LocalTime timein) {
		this.timein = timein;
	}

	public LocalTime getTimeout() {
		return timeout;
	}

	public void setTimeout(LocalTime timeout) {
		this.timeout = timeout;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public String getPrenomEmp() {
		return prenomEmp;
	}

	public void setPrenomEmp(String prenomEmp) {
		this.prenomEmp = prenomEmp;
	}



	@Override
	public String toString() {
		return "Planning [IdPlanning=" + IdPlanning + ", date=" + date + ", timein=" + timein + ", timeout=" + timeout
				+ ", nomEmp=" + nomEmp + ", prenomEmp=" + prenomEmp + "]";
	}
    
}
