package edu.espritCS.medicalSoftEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Drug
 * 
 */
@Entity
public class Drug implements Serializable {

	private Long idDrug;
	private String nameDrug;
	private String descriptionDrug;
	private String dosageDrug;

	private static final long serialVersionUID = 1L;

	public Drug() {
		super();
	}

	@Id
	@GeneratedValue
	public Long getIdDrug() {
		return this.idDrug;
	}

	public void setIdDrug(Long idDrug) {
		this.idDrug = idDrug;
	}

	public String getDescriptionDrug() {
		return descriptionDrug;
	}

	public void setDescriptionDrug(String descriptionDrug) {
		this.descriptionDrug = descriptionDrug;
	}

	public String getNameDrug() {
		return nameDrug;
	}

	public void setNameDrug(String nameDrug) {
		this.nameDrug = nameDrug;
	}

	public String getDosageDrug() {
		return dosageDrug;
	}

	public void setDosageDrug(String dosageDrug) {
		this.dosageDrug = dosageDrug;
	}

}
