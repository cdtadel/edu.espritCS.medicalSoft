package com.esprit.medicalSoftEJB.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Ordonnance
 * 
 */
@Entity
public class Ordonnance implements Serializable {

	private Long idOrdonnance;
	private Date dateOrdonnance;

	private Consultation consultation;
	private List<Medicament> medicaments;

	private static final long serialVersionUID = 1L;

	public Ordonnance() {
		super();
	}

	@Id
	public Long getIdOrdonnance() {
		return this.idOrdonnance;
	}

	public void setIdOrdonnance(Long idOrdonnance) {
		this.idOrdonnance = idOrdonnance;
	}

	public Date getDateOrdonnance() {
		return dateOrdonnance;
	}

	public void setDateOrdonnance(Date dateOrdonnance) {
		this.dateOrdonnance = dateOrdonnance;
	}

	@OneToMany
	public List<Medicament> getMedicaments() {
		return medicaments;
	}

	public void setMedicaments(List<Medicament> medicaments) {
		this.medicaments = medicaments;
	}

	@ManyToOne
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

}
