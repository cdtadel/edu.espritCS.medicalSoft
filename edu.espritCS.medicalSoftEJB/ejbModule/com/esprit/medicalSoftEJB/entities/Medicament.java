package com.esprit.medicalSoftEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Medicament
 * 
 */
@Entity
public class Medicament implements Serializable {

	private Long idMedicament;
	private String nomMedicament;
	private String descriptionMedicament;
	private String posologieMedicament;

	private static final long serialVersionUID = 1L;

	public Medicament() {
		super();
	}

	@Id
	public Long getIdMedicament() {
		return this.idMedicament;
	}

	public void setIdMedicament(Long idMedicament) {
		this.idMedicament = idMedicament;
	}

	public String getNomMedicament() {
		return nomMedicament;
	}

	public void setNomMedicament(String nomMedicament) {
		this.nomMedicament = nomMedicament;
	}

	public String getDescriptionMedicament() {
		return descriptionMedicament;
	}

	public void setDescriptionMedicament(String descriptionMedicament) {
		this.descriptionMedicament = descriptionMedicament;
	}

	public String getPosologieMedicament() {
		return posologieMedicament;
	}

	public void setPosologieMedicament(String posologieMedicament) {
		this.posologieMedicament = posologieMedicament;
	}

}
