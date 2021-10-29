package web.Dao;

import org.springframework.stereotype.Repository;
import web.Model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Role> getRole() {
		return entityManager.createQuery("select r from Role r",Role.class).getResultList();
	}

	@Override
	public void add(Role role) {
		entityManager.persist(role);
	}

	@Override
	public void updateRole(Role role) {
		entityManager.merge(role);
	}

	@Override
	public void delete(Long id) {
		entityManager.createQuery("delete from Role r where r.id = :id")
				.setParameter("id",id).executeUpdate();
	}

	@Override
	public Role getRoleByName(String name) {
		TypedQuery<Role> query = entityManager.createQuery("select u from Role u where u.name = :role",Role.class)
				.setParameter("role",name);
		return query.getSingleResult();
	}
}
