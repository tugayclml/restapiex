package com.example.demo.members;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRolesController {

	@Autowired
	private UserRolesService rolesService;
	
	@RequestMapping(method=RequestMethod.POST,value="/addroles")
	public void addUserRoles(@RequestBody UserRoles roles) {
		rolesService.addUserRoles(roles);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="getroles")
	public List<UserRoles> getAllUserRoles() {
		return rolesService.getAllUserRoles();
	}
	
}
