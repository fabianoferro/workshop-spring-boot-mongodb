package com.example.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.dto.AuthorDto;
import com.example.workshopmongo.repository.PostRepository;
import com.example.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User alex = new User(null, "Alex Santos", "alexsantos@gmail.com");
		User maria = new User(null, "Maria Santos", "mariasantos@gmail.com");
		User robinho = new User(null, "Robinho Santos", "robinhosantos@gmail.com");	
		
		userRepository.saveAll(Arrays.asList(alex, maria, robinho));
		
		Post post1 = new Post(null, sdf.parse("15/09/2021"), "Partiu viagem!", "Estou indo pra São Paulo!", new AuthorDto(maria));
		Post post2 = new Post(null, sdf.parse("15/09/2021"), "Bom dia!", "Acordei muito bem hoje!", new AuthorDto(maria));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(maria);
		
	}

}
