package com.j2digital.team5.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.Order;

public interface OrderRepository extends MongoRepository<Order,String>{

}
