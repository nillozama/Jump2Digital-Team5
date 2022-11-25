package com.j2digital.team5.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.Center;

public interface CenterRepository extends MongoRepository<Center,String>{
	List<Center> findByCityCode(String cityCode);
	List<Center> findByCenterType(String centerType);
}
