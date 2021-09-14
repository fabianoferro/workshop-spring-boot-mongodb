package com.example.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User alex = new User(null, "Alex Santos", "alexsantos@gmail.com");
		User maria = new User(null, "Maria Santos", "mariasantos@gmail.com");
		User robinho = new User(null, "Robinho Santos", "robinhosantos@gmail.com");
		
		userRepository.saveAll(Arrays.asList(alex, maria, robinho));
		
		
	}

}
