package edu.espritCS.medicalSoftEJB.domain.userManagement;

import java.util.List;

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
		List list = entityManager.createQuery(
				"select u from User u where u.login='" + login
						+ "' and u.password='" + pwd+"'").getResultList();
		if (list != null && (!list.isEmpty())) {
			return (User)list.get(0);
		}
		return null;
	}

	@Override
	public Role findRoleById(Long id) {
		return entityManager.find(Role.class, id);
	}

	@Override
	public List<Role> getRoles() {

		return entityManager.createQuery("select r from Role r")
				.getResultList();
	}
}
