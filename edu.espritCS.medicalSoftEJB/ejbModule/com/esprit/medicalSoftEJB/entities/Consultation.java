package com.esprit.medicalSoftEJB.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Consultation
 * 
 */
@Entity
public class Consultation implements Serializable {

	private Long idConsultation;
	private Date dateConsultation;
	private String maladie;
	private String symptomes;
	private String remarques;
	private List<Ordonnance> ordonnances;
	private Patient patient;
	private static final long serialVersionUID = 1L;

	public Consultation() {
		super();
	}

	@Id
	public Long getIdConsultation() {
		return idConsultation;
	}

	public void setIdConsultation(Long idConsultation) {
		this.idConsultation = idConsultation;
	}

	public Date getDateConsultation() {
		return dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

	public String getMaladie() {
		return maladie;
	}

	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}

	@OneToMany(mappedBy="consultation")
	public List<Ordonnance> getOrdonnances() {
		return ordonnances;
	}

	public void setOrdonnances(List<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}

	public String getSymptomes() {
		return symptomes;
	}

	public void setSymptomes(String symptomes) {
		this.symptomes = symptomes;
	}

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	@ManyToOne
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
