package com.esprit.medicalSoftEJB.domain.medicament;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.medicalSoftEJB.entities.Medicament;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class MedicamentService implements MedicamentServiceLocal,
		MedicamentServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public MedicamentService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createMedicament(Medicament medicament) {
		entityManager.persist(medicament);
	}

	@Override
	public void updateMedicament(Medicament medicament) {
		entityManager.merge(medicament);
	}

	@Override
	public void removeMedicament(Medicament medicament) {
		entityManager.remove(medicament);
	}

	@Override
	public void findMedicamentById(Long id) {
		entityManager.find(Medicament.class, id);
	}

}
