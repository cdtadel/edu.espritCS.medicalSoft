package com.esprit.medicalSoftEJB.domain.habilitation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.medicalSoftEJB.entities.Role;
import com.esprit.medicalSoftEJB.entities.Utilisateur;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class HabilitationService implements HabilitationServiceLocal,
		HabilitationServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public HabilitationService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createUtilisateur(Utilisateur user) {
		entityManager.persist(user);
	}

	@Override
	public void updateUtilisateur(Utilisateur user) {
		entityManager.merge(user);
	}

	@Override
	public void removeUtilisateur(Utilisateur user) {
		entityManager.remove(user);
	}

	@Override
	public Utilisateur findUtilisateurById(Long id) {
		return entityManager.find(Utilisateur.class,id);
	}
	
	@Override
	public void createRole(Role role) {
		entityManager.persist(role);
	}

	@Override
	public void updateRole(Role role) {
		entityManager.merge(role);
	}

	@Override
	public void removeRole(Role role) {
		entityManager.remove(role);
	}
}
