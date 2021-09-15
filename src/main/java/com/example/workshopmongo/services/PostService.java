package com.example.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.repository.PostRepository;
import com.example.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;	
	
	
	public Post findById(String id) {
		Post user = repo.findById(id).orElse(null);
		if(user == null) {
			throw new ObjectNotFoundException("Usuário não encontrado!");
		}		
		return user;		
	}
	
	public List<Post> finByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}

}
