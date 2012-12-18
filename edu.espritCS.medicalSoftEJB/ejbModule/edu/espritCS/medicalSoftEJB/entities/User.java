package edu.espritCS.medicalSoftEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: User
 * 
 */
@Entity
public class User implements Serializable {
	
	private Long idUser;
	private String login;
	private String password;
	private String firstNameUser;
	private String nameUser;
	private Role roleUser;

	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	@Id
	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@ManyToOne
	public Role getRoleUser() {
		return roleUser;
	}

	public void setRoleUser(Role roleUser) {
		this.roleUser = roleUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstNameUser() {
		return firstNameUser;
	}

	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

}
