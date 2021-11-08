package web.Dao;

import org.springframework.stereotype.Repository;
import web.Model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<User> getAllUser() {
		return entityManager.createQuery("select distinct u from User u left join fetch u.roles",User.class).getResultList();
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
		entityManager.createQuery("delete from User u where u.id = :id")
				.setParameter("id",id).executeUpdate();
	}

	@Override
	public void updateUser(User user) {
		 entityManager.merge(user);
	}

	@Override
	public User getUserByName(String name) {
		try {
			return entityManager.createQuery("select u from User u inner join fetch u.roles where u.name = :name",User.class)
					.setParameter("name",name).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
