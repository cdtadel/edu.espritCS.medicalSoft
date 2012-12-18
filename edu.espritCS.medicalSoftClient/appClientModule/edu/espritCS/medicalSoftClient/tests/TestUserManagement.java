package edu.espritCS.medicalSoftClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCS.medicalSoftEJB.domain.userManagement.UserManagementServiceRemote;

public class TestUserManagement {
	private static UserManagementServiceRemote userManagementServiceRemote;

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			userManagementServiceRemote = (UserManagementServiceRemote) context
					.lookup("");
			//
			// User user = new User();
			// user.setIdUser(14);
			// user.setNameUser("foulen");
			//
			// managementServicesRemote.createUser(user);
			// createUserTest();
			// updateUserTest();
			// removeUserTest();
			// findByIdUserTest();
			// createRoleTest();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void createUserTest() {
		// habilitationServiceRemote.
	}

	private static void updateUserTest() {

	}

	private static void removeUserTest() {

	}

	private static void findByIdUserTest() {

	}

	private static void createRoleTest() {

	}
}
