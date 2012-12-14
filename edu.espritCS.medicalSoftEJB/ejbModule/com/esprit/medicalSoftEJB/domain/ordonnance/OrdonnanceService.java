package com.esprit.medicalSoftEJB.domain.ordonnance;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.medicalSoftEJB.entities.Ordonnance;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class OrdonnanceService implements OrdonnanceServiceLocal,
		OrdonnanceServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public OrdonnanceService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createOrdonnance(Ordonnance ordonnance) {
		entityManager.persist(ordonnance);

	}

	@Override
	public void updateOrdonnance(Ordonnance ordonnance) {
		entityManager.merge(ordonnance);
	}

	@Override
	public void removeOrdonnance(Ordonnance ordonnance) {
		entityManager.remove(ordonnance);
	}

	@Override
	public void findOrdonnanceById(Long id) {
		entityManager.find(Ordonnance.class, id);
	}

}
