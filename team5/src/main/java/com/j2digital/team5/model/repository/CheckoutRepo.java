package com.j2digital.team5.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.Checkout;

public interface CheckoutRepo extends  MongoRepository<Checkout,String>{

}
