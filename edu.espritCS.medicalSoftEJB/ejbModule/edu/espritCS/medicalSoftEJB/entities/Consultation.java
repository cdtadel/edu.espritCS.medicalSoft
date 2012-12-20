package edu.espritCS.medicalSoftEJB.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	private String diseaseName;
	private String symptoms;
	private String notes;
	private List<Prescription> prescriptions;
	private Patient patient;
	private static final long serialVersionUID = 1L;

	public Consultation() {
		super();
	}

	@Id
	@GeneratedValue
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

	@OneToMany(mappedBy = "consultation")
	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	@ManyToOne
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
