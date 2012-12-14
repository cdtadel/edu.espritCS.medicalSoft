package com.esprit.medicalSoftEJB.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Patient
 * 
 */
@Entity
public class Patient implements Serializable {

	private Long idPatient;
	private String nomPatient;
	private String prenomPatient;
	private String adressePatient;
	private String mailPatient;
	private String telPatient;
	private Date dateNaissancePatient;

	private List<Consultation> consultations;
	private List<RendezVous> rdvs;

	private static final long serialVersionUID = 1L;

	public Patient() {
		super();
	}

	@Id
	@GeneratedValue
	public Long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(Long idPatient) {
		this.idPatient = idPatient;
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

	public String getAdressePatient() {
		return adressePatient;
	}

	public void setAdressePatient(String adressePatient) {
		this.adressePatient = adressePatient;
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

	public Date getDateNaissancePatient() {
		return dateNaissancePatient;
	}

	public void setDateNaissancePatient(Date dateNaissancePatient) {
		this.dateNaissancePatient = dateNaissancePatient;
	}

	@OneToMany(mappedBy="patient")
	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	@OneToMany(mappedBy="patient")
	public List<RendezVous> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<RendezVous> rdvs) {
		this.rdvs = rdvs;
	}

}
