package com.harivemula.springbootmongodbdemo.repository;

import com.harivemula.springbootmongodbdemo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PersonRepository extends MongoRepository<Person, String> {
}
