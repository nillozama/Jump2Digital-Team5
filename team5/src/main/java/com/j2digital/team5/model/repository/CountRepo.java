package com.j2digital.team5.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.Count;

public interface CountRepo extends  MongoRepository<Count,String>{

}
