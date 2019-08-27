package com.reference.sbmongocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reference.sbmongocrud.model.WrestlerCard;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController("/cards")
public class WManiaCardController {
	
	
	@Autowired
	MongoRepository<WrestlerCard, String> wManiaCardRepo;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<WrestlerCard> getAllWrestlers() {
		
		log.info("call getAllWrestlers()");
		return wManiaCardRepo.findAll();
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public WrestlerCard addWrestler(@RequestBody WrestlerCard wrestlerCard) {
		
		log.info("call addWrestler()");
		return wManiaCardRepo.save(wrestlerCard);
	}
	
	

}
