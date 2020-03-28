package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.document.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
