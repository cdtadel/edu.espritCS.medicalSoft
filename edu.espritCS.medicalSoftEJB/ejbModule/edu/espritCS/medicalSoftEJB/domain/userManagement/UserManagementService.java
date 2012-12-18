package edu.espritCS.medicalSoftEJB.domain.userManagement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCS.medicalSoftEJB.entities.Role;
import edu.espritCS.medicalSoftEJB.entities.User;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class UserManagementService implements UserManagementServiceLocal,
		UserManagementServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	public UserManagementService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
	}

	@Override
	public void removeUser(User user) {
		entityManager.remove(user);
	}

	@Override
	public User findUserById(Long id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public void createRole(Role role) {
		entityManager.persist(role);
	}

	@Override
	public void updateRole(Role role) {
		entityManager.merge(role);
	}

	@Override
	public void removeRole(Role role) {
		entityManager.remove(role);
	}

	@Override
	public User login(String login, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}
}
