package edu.espritCS.medicalSoftEJB.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Prescription
 * 
 */
@Entity
public class Prescription implements Serializable {

	private Long idPrescription;
	private Date datePrescription;

	private Consultation consultation;
	private List<Drug> drugs;

	private static final long serialVersionUID = 1L;

	public Prescription() {
		super();
	}

	@Id
	public Long getIdPrescription() {
		return idPrescription;
	}

	public void setIdPrescription(Long idPrescription) {
		this.idPrescription = idPrescription;
	}

	@OneToMany
	public List<Drug> getDrugs() {
		return drugs;
	}

	public void setDrugs(List<Drug> drugs) {
		this.drugs = drugs;
	}

	@ManyToOne
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public Date getDatePrescription() {
		return datePrescription;
	}

	public void setDatePrescription(Date datePrescription) {
		this.datePrescription = datePrescription;
	}

}
