package edu.espritCS.medicalSoftEJB.domain.appointment;

import java.util.List;

import javax.ejb.Local;

import edu.espritCS.medicalSoftEJB.entities.Appointment;
import edu.espritCS.medicalSoftEJB.entities.Consultation;

@Local
public interface AppointmentServiceLocal {

	void createAppointment(Appointment appointment);

	void updateAppointment(Appointment appointment);

	void removeAppointment(Appointment appointment);

	void findAppointmentById(Long id);

	List<Appointment> findAllAppointment();
}