package com.example.demo.members;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRoles implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String role;
	private String memberUserName;
	
}
