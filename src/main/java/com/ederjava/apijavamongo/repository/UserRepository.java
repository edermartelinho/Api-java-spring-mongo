package com.ederjava.apijavamongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ederjava.apijavamongo.dominio.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
