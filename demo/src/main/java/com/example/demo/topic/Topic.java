package com.example.demo.topic;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TOPICS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Topic implements Serializable{
	
	/*
	 *	@NoArgConstructor will create default constructor.
	 *	@Data will create getter,setter,toString,EqualsAndHashCode,RequiredArgsConstructor methods. 
	 *	@AllArgsConstructor will create constructor with all arguments.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;
	private String description;
	
}
