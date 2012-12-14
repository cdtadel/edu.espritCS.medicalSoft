package com.esprit.medicalSoftEJB.domain.habilitation;

import javax.ejb.Local;

import com.esprit.medicalSoftEJB.entities.Role;
import com.esprit.medicalSoftEJB.entities.Utilisateur;

@Local
public interface HabilitationServiceLocal {
	void createUtilisateur(Utilisateur user);

	void updateUtilisateur(Utilisateur user);

	void removeUtilisateur(Utilisateur user);

	Utilisateur findUtilisateurById(Long id);

	void createRole(Role role);

	void updateRole(Role role);

	void removeRole(Role role);
}
