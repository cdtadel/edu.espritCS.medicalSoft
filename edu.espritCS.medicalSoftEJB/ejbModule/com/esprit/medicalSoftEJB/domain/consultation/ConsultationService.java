package com.esprit.medicalSoftEJB.domain.consultation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.medicalSoftEJB.entities.Consultation;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class ConsultationService implements ConsultationServiceLocal,
		ConsultationServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public ConsultationService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createConsultation(Consultation consultation) {
		entityManager.persist(consultation);
	}

	@Override
	public void updateConsultation(Consultation consultation) {
		entityManager.merge(consultation);
	}

	@Override
	public void removeConsultation(Consultation consultation) {
		entityManager.remove(consultation);
	}

	@Override
	public void findConsultationById(Long id) {
		entityManager.find(Consultation.class, id);
	}
}
