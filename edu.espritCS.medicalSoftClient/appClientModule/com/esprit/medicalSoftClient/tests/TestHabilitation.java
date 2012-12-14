package com.esprit.medicalSoftClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.esprit.medicalSoftEJB.domain.habilitation.HabilitationServiceRemote;

public class TestHabilitation {
	private static HabilitationServiceRemote habilitationServiceRemote;

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			habilitationServiceRemote = (HabilitationServiceRemote) context
					.lookup("ejb:edu.espritCs.rakza/edu.espritCs.rakzaEJB/ManagementServices!edu.espritCs.rakzaEJB.domain.management.ManagementServicesRemote");
			//
			// User user = new User();
			// user.setIdUser(14);
			// user.setNameUser("foulen");
			//
			// managementServicesRemote.createUser(user);
			// createUtilisateurTest();
			// updateUtilisateurTest();
			// removeUtilisateurTest();
			// findByIdUtilisateurTest();
			// createRoleTest();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void createUtilisateurTest() {
		//habilitationServiceRemote.
	}

	private static void updateUtilisateurTest() {

	}

	private static void removeUtilisateurTest() {

	}

	private static void findByIdUtilisateurTest() {

	}

	private static void createRoleTest() {

	}
}
