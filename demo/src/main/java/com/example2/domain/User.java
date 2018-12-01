package com.example2.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",nullable=false,updatable=false)
	private Long id;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@Getter(onMethod = @__(@JsonIgnore))
	@JsonManagedReference
	private UserCredentials credentials;
	
	@Column(name="email",nullable=false,unique=true)
	private String email;
	
	
	
	
}
