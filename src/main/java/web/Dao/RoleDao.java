package web.Dao;

import web.Model.Role;
import web.Model.User;

import java.util.List;

public interface RoleDao {
	List<Role> getRole();
	void add(Role role);
	void updateRole(Role role);
	void delete(Long id);
	Role getRoleByName(String name);
}
