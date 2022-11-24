package com.j2digital.team5.security.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.security.domain.User;


public interface UserRepository extends MongoRepository<User, String>{

	Optional<User> findByUsername(String username);

	boolean existsByUsername(String username);

}
