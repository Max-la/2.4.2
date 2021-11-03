package web.Servise;

import web.Model.Role;

import java.util.List;

public interface RoleService {
	List<Role> getRole();
	void add(Role role);
	void updateRole(Role role);
	Role getRoleByName(String name);
}
