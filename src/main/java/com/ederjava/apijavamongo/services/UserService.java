package com.ederjava.apijavamongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ederjava.apijavamongo.dominio.User;
import com.ederjava.apijavamongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		
	    return repo.findAll();
		
	}
	
	

}
