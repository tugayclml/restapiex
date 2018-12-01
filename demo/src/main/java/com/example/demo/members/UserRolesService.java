package com.example.demo.members;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRolesService {
	
	@Autowired
	private UserRolesRepository repository;
	
	public void addUserRoles(UserRoles roles) {
		repository.save(roles);
	}
	
	public List<UserRoles> getAllUserRoles(){
		List<UserRoles> userroles = new ArrayList<>();
		repository.findAll().forEach(userroles::add);
		return userroles;
	}
	
}
