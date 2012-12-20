package edu.espritCS.medicalSoftClient.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCS.medicalSoftEJB.domain.userManagement.UserManagementServiceRemote;
import edu.espritCS.medicalSoftEJB.entities.Role;
import edu.espritCS.medicalSoftEJB.entities.User;

public class TestUserManagement {
	private static UserManagementServiceRemote userManagementServiceRemote;

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			userManagementServiceRemote = (UserManagementServiceRemote) context
					.lookup("ejb:edu.espritCS.medicalSoft/edu.espritCS.medicalSoftEJB/"
							+ "UserManagementService!edu.espritCS.medicalSoftEJB.domain.userManagement.UserManagementServiceRemote");

			
			//createUserTest();
			//updateUserTest();
			// removeUserTest();
			// findByIdUserTest();
			//createRoleTest();
			login();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void createUserTest() {
		User user=new User();
		user.setLogin("elouefnijamila");
		user.setPassword("123");
		user.setNameUser("Jamila");
		user.setFirstNameUser("El Ouefni");
		userManagementServiceRemote.createUser(user);
	}

	private static void updateUserTest() {
		User user=userManagementServiceRemote.findUserById(1L);
		user.setRoleUser(userManagementServiceRemote.findRoleById(3L));
		userManagementServiceRemote.updateUser(user);
	}

	private static void removeUserTest() {

	}

	private static void findByIdUserTest() {
		User user=userManagementServiceRemote.findUserById(1L);
	}

	private static void createRoleTest() {
		Role role=new Role();
		role.setLabelRole("Medical Staff");
		userManagementServiceRemote.createRole(role);
	}
	
	private static void getRoles() {
		List<Role> roles=userManagementServiceRemote.getRoles();
		System.out.println(roles.size());
	}
	
	private static void login() {
		User user=userManagementServiceRemote.login("elouefnijamila", "123");
		if(user!=null){
			
			System.out.println("OK");
		}
	}

}
