package com.example.workshopmongo.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Document
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;	
	private String email;
	
	public User() {};	
	
	public User(String id, String name, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	
	
	

}
