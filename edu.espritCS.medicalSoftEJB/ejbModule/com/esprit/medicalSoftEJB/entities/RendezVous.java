package com.esprit.medicalSoftEJB.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: RendezVous
 * 
 */
@Entity
public class RendezVous implements Serializable {

	
	private Long idRdv;
	private String nomPatient;
	private String prenomPatient;
	private String mailPatient;
	private String telPatient;
	private Date dateRdv;
	private Boolean estDejaPatient;
	private Patient patient;
	
	private static final long serialVersionUID = 1L;

	public RendezVous() {
		super();
	}
	
	@Id
	public Long getIdRdv() {
		return this.idRdv;
	}

	public void setIdRdv(Long idRdv) {
		this.idRdv = idRdv;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public String getPrenomPatient() {
		return prenomPatient;
	}

	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}

	public String getMailPatient() {
		return mailPatient;
	}

	public void setMailPatient(String mailPatient) {
		this.mailPatient = mailPatient;
	}

	public String getTelPatient() {
		return telPatient;
	}

	public void setTelPatient(String telPatient) {
		this.telPatient = telPatient;
	}

	public Date getDateRdv() {
		return dateRdv;
	}

	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}

	public Boolean getEstDejaPatient() {
		return estDejaPatient;
	}

	public void setEstDejaPatient(Boolean estDejaPatient) {
		this.estDejaPatient = estDejaPatient;
	}
	
	@ManyToOne
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
