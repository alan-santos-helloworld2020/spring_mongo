package com.base.spring_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.base.spring_mongo.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente,String>{

}
