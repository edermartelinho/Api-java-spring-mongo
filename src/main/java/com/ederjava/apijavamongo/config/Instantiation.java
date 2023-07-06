package com.ederjava.apijavamongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ederjava.apijavamongo.dominio.User;
import com.ederjava.apijavamongo.repository.UserRepository;


@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User antonio = new User(null, "Antonio ze", "antonio@gmail.com");
		User maria = new User(null, "Maria cota", "maria@gmail.com");
		User carlos = new User(null, "Carlos dart", "carlos@gmail.com");
		
		userRepository.saveAll(Arrays.asList(antonio, maria, carlos));
		
		
	}

}
