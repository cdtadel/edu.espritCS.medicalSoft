package com.esprit.medicalSoftEJB.domain.rendezVous;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.medicalSoftEJB.entities.RendezVous;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class RendezVousService implements RendezVousServiceLocal,
		RendezVousServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public RendezVousService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createRendezVous(RendezVous rdv) {
		entityManager.persist(rdv);
	}

	@Override
	public void updateRendezVous(RendezVous rdv) {
		entityManager.merge(rdv);
	}

	@Override
	public void removeRendezVous(RendezVous rdv) {
		entityManager.remove(rdv);
	}

	@Override
	public void findRendezVousById(Long id) {
		entityManager.find(RendezVous.class, id);
	}

}
