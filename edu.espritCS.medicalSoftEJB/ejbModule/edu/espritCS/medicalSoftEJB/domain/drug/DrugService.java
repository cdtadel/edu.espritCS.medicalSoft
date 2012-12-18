package edu.espritCS.medicalSoftEJB.domain.drug;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCS.medicalSoftEJB.entities.Drug;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class DrugService implements DrugServiceLocal,
		DrugServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public DrugService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createDrug(Drug drug) {
		entityManager.persist(drug);
	}

	@Override
	public void updateDrug(Drug drug) {
		entityManager.merge(drug);
	}

	@Override
	public void removeDrug(Drug drug) {
		entityManager.remove(drug);
	}

	@Override
	public void findDrugById(Long id) {
		entityManager.find(Drug.class, id);
	}

}
