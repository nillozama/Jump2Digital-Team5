package com.j2digital.team5.model.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.CenterInfo;

public interface CenterRepository extends MongoRepository<CenterInfo,String>{

}
