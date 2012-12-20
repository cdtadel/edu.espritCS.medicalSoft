package edu.espritCS.medicalSoftEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Role
 * 
 */
@Entity
public class Role implements Serializable {

	private Long idRole;
	private String labelRole;

	private static final long serialVersionUID = 1L;

	public Role() {
		super();
	}
	
	@Id
	@GeneratedValue
	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getLabelRole() {
		return labelRole;
	}

	public void setLabelRole(String labelRole) {
		this.labelRole = labelRole;
	}

}
