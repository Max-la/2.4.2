package web.Dao;

import org.springframework.stereotype.Repository;
import web.Model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

	@PersistenceContext
	public EntityManager entityManager;

	@Override
	public List<User> getAllUser() {
		return entityManager.createQuery("from User",User.class).getResultList();
	}

	@Override
	public void add(User user) {
		entityManager.persist(user);
	}

	@Override
	public User getUser(Long id) {
		return  entityManager.find(User.class,id);
	}

	@Override
	public void delete(Long id) {
		entityManager.createQuery("delete from User where id = :id").setParameter("id",id).executeUpdate();
	}

	@Override
	public void updateUser(User user) {
		 entityManager.merge(user);
	}
}
