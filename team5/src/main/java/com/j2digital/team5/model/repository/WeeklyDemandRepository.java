package com.j2digital.team5.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.j2digital.team5.model.domain.WeeklyDemand;

public interface WeeklyDemandRepository extends MongoRepository<WeeklyDemand,String>{

}
