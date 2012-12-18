package edu.espritCS.medicalSoftEJB.domain.appointment;

import javax.ejb.Local;

import edu.espritCS.medicalSoftEJB.entities.Appointment;

@Local
public interface AppointmentServiceLocal {

	void createAppointment(Appointment appointment);

	void updateAppointment(Appointment appointment);

	void removeAppointment(Appointment appointment);

	void findAppointmentById(Long id);

}