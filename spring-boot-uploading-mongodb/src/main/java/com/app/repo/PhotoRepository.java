package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.document.Photo;

public interface PhotoRepository extends MongoRepository<Photo, String> {

}
