package edu.espritCS.medicalSoftEJB.domain.userManagement;

import java.util.List;

import javax.ejb.Remote;

import edu.espritCS.medicalSoftEJB.entities.Role;
import edu.espritCS.medicalSoftEJB.entities.User;

@Remote
public interface UserManagementServiceRemote {
	
	void createUser(User user);

	void updateUser(User user);

	void removeUser(User user);

	User findUserById(Long id);

	void createRole(Role role);

	void updateRole(Role role);

	void removeRole(Role role);
	
	Role findRoleById(Long id);
	
	List<Role> getRoles();
	
	User login(String login, String pwd);
}
