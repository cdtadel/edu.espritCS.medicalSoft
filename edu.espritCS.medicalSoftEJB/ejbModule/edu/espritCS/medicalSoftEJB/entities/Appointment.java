package edu.espritCS.medicalSoftEJB.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Appointment
 * 
 */
@Entity
public class Appointment implements Serializable {

	private Long idAppointment;
	private String FirstNamePatient;
	private String namePatient;
	private String mailPatient;
	private String telPatient;
	private Date dateAppointment;
	private Boolean isAlreadyPatient;
	private Patient patient;

	private static final long serialVersionUID = 1L;

	public Appointment() {
		super();
	}

	@Id
	public Long getIdAppointment() {
		return idAppointment;
	}

	public void setIdAppointment(Long idAppointment) {
		this.idAppointment = idAppointment;
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

	@ManyToOne
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getFirstNamePatient() {
		return FirstNamePatient;
	}

	public void setFirstNamePatient(String firstNamePatient) {
		FirstNamePatient = firstNamePatient;
	}

	public String getNamePatient() {
		return namePatient;
	}

	public void setNamePatient(String namePatient) {
		this.namePatient = namePatient;
	}

	public Date getDateAppointment() {
		return dateAppointment;
	}

	public void setDateAppointment(Date dateAppointment) {
		this.dateAppointment = dateAppointment;
	}

	public Boolean getIsAlreadyPatient() {
		return isAlreadyPatient;
	}

	public void setIsAlreadyPatient(Boolean isAlreadyPatient) {
		this.isAlreadyPatient = isAlreadyPatient;
	}

}
