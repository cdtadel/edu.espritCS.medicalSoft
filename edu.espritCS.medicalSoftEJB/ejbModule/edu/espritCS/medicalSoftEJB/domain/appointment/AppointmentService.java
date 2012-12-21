package edu.espritCS.medicalSoftEJB.domain.appointment;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCS.medicalSoftEJB.entities.Appointment;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class AppointmentService implements AppointmentServiceLocal,
		AppointmentServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public AppointmentService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createAppointment(Appointment appointment) {
		entityManager.persist(appointment);
	}

	@Override
	public void updateAppointment(Appointment appointment) {
		entityManager.merge(appointment);
	}

	@Override
	public void removeAppointment(Appointment appointment) {
		entityManager.remove(appointment);
	}

	@Override
	public void findAppointmentById(Long id) {
		entityManager.find(Appointment.class, id);
	}

	@Override
	public List<Appointment> findAllAppointment() {
		List list = entityManager.createQuery("select a from Appointment a")
				.getResultList();

		return list;
	}

}
