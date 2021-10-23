package web.Servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.UserDAOImpl;
import web.Model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAOImpl userDAO;

	@Override
	public List<User> getAllUser() {
		return userDAO.getAllUser();
	}

	@Override
	public void add(User user) {
		userDAO.add(user);
	}

	@Override
	public User getUser(Long id) {
		return userDAO.getUser(id);
	}

	@Override
	public void delete(Long id) {
		userDAO.delete(id);
	}

	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}
}
