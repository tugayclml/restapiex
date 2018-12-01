package com.example.demo.course;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.topic.Topic;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="COURSE")
@NoArgsConstructor
@Data
public class Course implements Serializable{

	/*
	 *	@NoArgConstructor will create default constructor.
	 *	@Data will create getter,setter,toString,EqualsAndHashCode,RequiredArgsConstructor methods. 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;
	private String description;

	@ManyToOne
	private Topic topic;
	
	public Course(String id, String name, String description,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId,"","");
	}
	
}
