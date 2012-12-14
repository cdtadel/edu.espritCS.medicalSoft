package com.esprit.medicalSoftEJB.domain.patient;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.medicalSoftEJB.entities.Patient;

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

}
