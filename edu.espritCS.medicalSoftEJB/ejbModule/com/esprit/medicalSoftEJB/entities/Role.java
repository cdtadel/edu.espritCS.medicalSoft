package com.esprit.medicalSoftEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Role
 * 
 */
@Entity
public class Role implements Serializable {

	private Long idRole;
	private String libelleRole;

	private static final long serialVersionUID = 1L;

	public Role() {
		super();
	}
	
	@Id
	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getLibelleRole() {
		return libelleRole;
	}

	public void setLibelleRole(String libelleRole) {
		this.libelleRole = libelleRole;
	}

}
