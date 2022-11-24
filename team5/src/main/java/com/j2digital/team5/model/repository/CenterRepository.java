package com.j2digital.team5.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.Center;

public interface CenterRepository extends MongoRepository<Center,String>{
	List<Center> findByCity_code(String city_code);
	List<Center> findByCenter_type(String center_type);
}
