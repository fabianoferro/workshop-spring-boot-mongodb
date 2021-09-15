package com.example.workshopmongo.dto;

import java.io.Serializable;

import com.example.workshopmongo.domain.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDto() {}
	
	public AuthorDto(User obj) {
		
		id = obj.getId();
		name = obj.getName();
	}

}
