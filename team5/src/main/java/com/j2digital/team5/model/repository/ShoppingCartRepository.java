package com.j2digital.team5.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.ShoppingCart;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart,String>{
	ShoppingCart findByClienteId(String clienteId);
	ShoppingCart findByCenterId(String centerId);
}
