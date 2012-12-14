package com.esprit.medicalSoftClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.esprit.medicalSoftEJB.domain.patient.PatientServiceRemote;
import com.esprit.medicalSoftEJB.entities.Patient;

public class TestPatient {

	public static PatientServiceRemote patientServiceRemote;

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			patientServiceRemote = (PatientServiceRemote) context
					.lookup("ejb:com.esprit.medicalSoft/com.esprit.medicalSoftEJB/PatientService!com.esprit.medicalSoftEJB.domain.patient.PatientServiceRemote");
			// createPatientTest();
			//updatePatientTest();
			//removePatientTest();
			findByIdPatientTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createPatientTest() {

		Patient patient = new Patient();

		patient.setNomPatient("El Ouefni");
		patient.setPrenomPatient("Jamila");
		patient.setAdressePatient("3 rue test");

		patientServiceRemote.createPatient(patient);

	}

	private static void updatePatientTest() {

		Patient patient = new Patient();
		patient.setIdPatient(1L);
		patient.setTelPatient("22222222");

		patientServiceRemote.updatePatient(patient);
	}

	private static void removePatientTest() {

		Patient patient = new Patient();
		patient.setIdPatient(1L);
		patientServiceRemote.removePatient(patient);
	}

	private static void findByIdPatientTest() {

		Patient patient = (Patient)patientServiceRemote.findPatientById(1L);
	}

}
