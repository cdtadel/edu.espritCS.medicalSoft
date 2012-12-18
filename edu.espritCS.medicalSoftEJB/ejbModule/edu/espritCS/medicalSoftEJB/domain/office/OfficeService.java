package edu.espritCS.medicalSoftEJB.domain.office;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCS.medicalSoftEJB.entities.Office;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class OfficeService implements OfficeServiceLocal, OfficeServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public OfficeService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createOffice(Office office) {
		entityManager.persist(office);
	}

	@Override
	public void updateOffice(Office office) {
		entityManager.merge(office);
	}

	@Override
	public void removeOffice(Office office) {
		entityManager.remove(office);
	}

	@Override
	public void findOfficeById(Long id) {
		entityManager.find(Office.class, id);
	}
}
