package com.reference.sbmongocrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.reference.sbmongocrud.model.WrestlerCard;

@Repository
public interface WManiaCardRepository extends MongoRepository<WrestlerCard, String> {

}
