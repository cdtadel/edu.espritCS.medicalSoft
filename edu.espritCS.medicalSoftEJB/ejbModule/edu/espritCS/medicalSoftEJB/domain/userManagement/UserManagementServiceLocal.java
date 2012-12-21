package edu.espritCS.medicalSoftEJB.domain.userManagement;

import java.util.List;

import javax.ejb.Local;

import edu.espritCS.medicalSoftEJB.entities.Role;
import edu.espritCS.medicalSoftEJB.entities.User;

@Local
public interface UserManagementServiceLocal {

	void createUser(User user);

	void updateUser(User user);

	void removeUser(User user);

	User findUserById(Long id);

	void createRole(Role role);

	void updateRole(Role role);

	void removeRole(Role role);

	User login(String login, String pwd);

	List<Role> getRoles();
}
