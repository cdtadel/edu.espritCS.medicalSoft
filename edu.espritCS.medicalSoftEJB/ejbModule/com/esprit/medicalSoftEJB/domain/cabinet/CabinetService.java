package com.esprit.medicalSoftEJB.domain.cabinet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.medicalSoftEJB.entities.Cabinet;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class CabinetService implements CabinetServiceLocal,
		CabinetServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public CabinetService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createCabinet(Cabinet cabinet) {
		entityManager.persist(cabinet);
	}

	@Override
	public void updateCabinet(Cabinet cabinet) {
		entityManager.merge(cabinet);
	}

	@Override
	public void removeCabinet(Cabinet cabinet) {
		entityManager.remove(cabinet);
	}

	@Override
	public void findCabinetById(Long id) {
		entityManager.find(Cabinet.class, id);
	}
}
