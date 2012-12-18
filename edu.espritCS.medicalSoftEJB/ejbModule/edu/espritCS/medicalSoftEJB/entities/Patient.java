package edu.espritCS.medicalSoftEJB.entities;

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
	private String firstNamePatient;
	private String namePatient;
	private String adressPatient;
	private String mailPatient;
	private String telPatient;
	private Date dateBirthPatient;

	private List<Consultation> consultations;
	private List<Appointment> appointments;

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

	@OneToMany(mappedBy = "patient")
	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	public String getFirstNamePatient() {
		return firstNamePatient;
	}

	public void setFirstNamePatient(String firstNamePatient) {
		this.firstNamePatient = firstNamePatient;
	}

	public String getNamePatient() {
		return namePatient;
	}

	public void setNamePatient(String namePatient) {
		this.namePatient = namePatient;
	}

	public String getAdressPatient() {
		return adressPatient;
	}

	public void setAdressPatient(String adressPatient) {
		this.adressPatient = adressPatient;
	}

	public Date getDateBirthPatient() {
		return dateBirthPatient;
	}

	public void setDateBirthPatient(Date dateBirthPatient) {
		this.dateBirthPatient = dateBirthPatient;
	}
	
	@OneToMany(mappedBy = "patient")
	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	
}
