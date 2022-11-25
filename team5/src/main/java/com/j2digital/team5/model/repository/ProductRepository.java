package com.j2digital.team5.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.Product;

public interface ProductRepository extends MongoRepository<Product,String>{
	//Product findByName(String name);
}
