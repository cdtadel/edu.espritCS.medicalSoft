package edu.espritCS.medicalSoftEJB.domain.patient;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCS.medicalSoftEJB.entities.Patient;
import edu.espritCS.medicalSoftEJB.entities.User;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class PatientService implements PatientServiceLocal,
		PatientServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public PatientService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPatient(Patient patient) {
		entityManager.persist(patient);
	}

	@Override
	public void updatePatient(Patient patient) {
		try {
			entityManager.merge(patient);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removePatient(Patient patient) {
		try {
			entityManager.remove(patient);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Patient findPatientById(Long id) {
		return entityManager.find(Patient.class, id);
	}

	@Override
	public List<Patient> findAllPatient() {
		
		List list = entityManager.createQuery(
				"select p from Patient p").getResultList();
		
		return list;
	}

}
