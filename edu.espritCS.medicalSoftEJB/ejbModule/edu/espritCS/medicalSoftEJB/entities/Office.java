package edu.espritCS.medicalSoftEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Office
 */
@Entity
public class Office implements Serializable {

	private Long idOffice;
	private String nameOffice;
	private String adressOffice;
	private String telOffice;
	private String faxOffice;
	private String mailOffice;
	private String descriptionOffice;

	private static final long serialVersionUID = 1L;

	public Office() {
		super();
	}

	@Id
	@GeneratedValue
	public Long getIdOffice() {
		return this.idOffice;
	}

	public void setIdOffice(Long idOffice) {
		this.idOffice = idOffice;
	}

	public String getNameOffice() {
		return nameOffice;
	}

	public void setNameOffice(String nameOffice) {
		this.nameOffice = nameOffice;
	}

	public String getAdressOffice() {
		return adressOffice;
	}

	public void setAdressOffice(String adressOffice) {
		this.adressOffice = adressOffice;
	}

	public String getTelOffice() {
		return telOffice;
	}

	public void setTelOffice(String telOffice) {
		this.telOffice = telOffice;
	}

	public String getFaxOffice() {
		return faxOffice;
	}

	public void setFaxOffice(String faxOffice) {
		this.faxOffice = faxOffice;
	}

	public String getMailOffice() {
		return mailOffice;
	}

	public void setMailOffice(String mailOffice) {
		this.mailOffice = mailOffice;
	}

	public String getDescriptionOffice() {
		return descriptionOffice;
	}

	public void setDescriptionOffice(String descriptionOffice) {
		this.descriptionOffice = descriptionOffice;
	}

}
