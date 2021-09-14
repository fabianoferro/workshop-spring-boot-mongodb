package com.example.workshopmongo.domain;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String id;
	private String email;
	
	public User() {};	
	
	public User(String name, String id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	
	
	

}
