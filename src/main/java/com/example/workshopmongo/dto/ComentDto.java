package com.example.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComentDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String texto;
	private Date date;
	private AuthorDto author;
	
	public ComentDto() {}

	public ComentDto(String texto, Date date, AuthorDto author) {
		super();
		this.texto = texto;
		this.date = date;
		this.author = author;
	}
}
