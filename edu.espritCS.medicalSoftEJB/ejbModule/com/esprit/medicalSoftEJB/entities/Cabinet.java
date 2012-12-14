package com.esprit.medicalSoftEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Cabinet
 * 
 */
@Entity
public class Cabinet implements Serializable {

	private Long idCabinet;
	private String nomCabinet;
	private String adresseCabinet;
	private String telCabinet;
	private String faxCabinet;
	private String mailCabinet;
	private String descriptionCabinet;

	private static final long serialVersionUID = 1L;

	public Cabinet() {
		super();
	}

	@Id
	public Long getIdCabinet() {
		return this.idCabinet;
	}

	public void setIdCabinet(Long idCabinet) {
		this.idCabinet = idCabinet;
	}

	public String getNomCabinet() {
		return nomCabinet;
	}

	public void setNomCabinet(String nomCabinet) {
		this.nomCabinet = nomCabinet;
	}

	public String getAdresseCabinet() {
		return adresseCabinet;
	}

	public void setAdresseCabinet(String adresseCabinet) {
		this.adresseCabinet = adresseCabinet;
	}

	public String getTelCabinet() {
		return telCabinet;
	}

	public void setTelCabinet(String telCabinet) {
		this.telCabinet = telCabinet;
	}

	public String getFaxCabinet() {
		return faxCabinet;
	}

	public void setFaxCabinet(String faxCabinet) {
		this.faxCabinet = faxCabinet;
	}

	public String getMailCabinet() {
		return mailCabinet;
	}

	public void setMailCabinet(String mailCabinet) {
		this.mailCabinet = mailCabinet;
	}

	public String getDescriptionCabinet() {
		return descriptionCabinet;
	}

	public void setDescriptionCabinet(String descriptionCabinet) {
		this.descriptionCabinet = descriptionCabinet;
	}

}
