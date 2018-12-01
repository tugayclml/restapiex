package com.example2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example2.domain.UserCredentials;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials , Long>{
	
	public UserCredentials getByUsername(String username);
	
}
