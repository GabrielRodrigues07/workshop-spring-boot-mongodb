package com.Gabriel.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Gabriel.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
