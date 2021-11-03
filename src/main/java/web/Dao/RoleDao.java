package web.Dao;

import web.Model.Role;
import web.Model.User;

import java.util.List;

public interface RoleDao {
	List<Role> getRole();
	void add(Role role);
	void updateRole(Role role);

	Role getRoleByName(String name);
}
