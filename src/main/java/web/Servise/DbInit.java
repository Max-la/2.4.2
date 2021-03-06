package web.Servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;
import web.Model.Role;
import web.Model.User;

import javax.annotation.PostConstruct;
import java.util.HashSet;

@Configuration
@Transactional
public class DbInit {

	public final UserService userService;
	private final RoleService roleService;

	@Autowired
	public DbInit(@Qualifier("userServiceImpl") UserService userService, RoleService roleService) {
		this.userService = userService;
		this.roleService = roleService;
	}

	@PostConstruct
	public void Init(){
		HashSet<Role> Adminrole = new HashSet<>();
		HashSet<Role> Userrole = new HashSet<>();


		User userAdmin = new User("admin","admin","admin");
		Adminrole.add(new Role(1L,"ADMIN"));
		userAdmin.setRoles(Adminrole);
		Role role = new Role("ADMIN");
		roleService.add(role);
		userService.add(userAdmin);

		User user = new User("user","user","user");
		Userrole.add(new Role(2L,"USER"));
		user.setRoles(Userrole);
		Role role1 = new Role("USER");
		roleService.add(role1);
		userService.add(user);
	}
}
