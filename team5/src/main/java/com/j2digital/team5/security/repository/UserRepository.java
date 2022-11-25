package com.j2digital.team5.security.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.security.domain.Usuario;
import com.j2digital.team5.security.dto.Rol;


public interface UserRepository extends MongoRepository<Usuario, String>{
	Optional<Usuario> findByUsername(String username);
	boolean existsByUsername(String username);
	
	List <Usuario> findByRoles(Rol rol);

}
