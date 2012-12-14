package com.esprit.medicalSoftEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: User
 * 
 */
@Entity
public class Utilisateur implements Serializable {
	private Long idUtilisateur;

	private String login;
	private String motDePasse;

	private String nomUtilisateur;
	private String prenomUtilisateur;

	private Role roleUtilisateur;

	private static final long serialVersionUID = 1L;

	public Utilisateur() {
		super();
	}

	@Id
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@ManyToOne
	public Role getRoleUtilisateur() {
		return roleUtilisateur;
	}

	public void setRoleUtilisateur(Role roleUtilisateur) {
		this.roleUtilisateur = roleUtilisateur;
	}

}
