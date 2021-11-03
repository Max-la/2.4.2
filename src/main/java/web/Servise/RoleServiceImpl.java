package web.Servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.Dao.RoleDao;
import web.Model.Role;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

	public final RoleDao roleDao;

	@Autowired
	public RoleServiceImpl(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public List<Role> getRole() {
		return roleDao.getRole();
	}

	@Override
	public void add(Role role) {
		roleDao.add(role);
	}

	@Override
	public void updateRole(Role role) {
		roleDao.updateRole(role);
	}



	@Override
	public Role getRoleByName(String name) {
		return roleDao.getRoleByName(name);
	}
}
