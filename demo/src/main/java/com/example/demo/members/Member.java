package com.example.demo.members;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="member")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	private String memberUserName;
	private String name;
	private String surname;
	private String city;
	private String address;
	private String password;
	private int enabled;
	
}
