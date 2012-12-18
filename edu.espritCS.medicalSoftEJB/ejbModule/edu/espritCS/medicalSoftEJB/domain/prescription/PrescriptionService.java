package edu.espritCS.medicalSoftEJB.domain.prescription;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCS.medicalSoftEJB.entities.Prescription;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class PrescriptionService implements PrescriptionServiceLocal,
		PrescriptionServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public PrescriptionService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPrescription(Prescription prescription) {
		entityManager.persist(prescription);

	}

	@Override
	public void updatePrescription(Prescription prescription) {
		entityManager.merge(prescription);
	}

	@Override
	public void removePrescription(Prescription prescription) {
		entityManager.remove(prescription);
	}

	@Override
	public void findPrescriptionById(Long id) {
		entityManager.find(Prescription.class, id);
	}

}
