package com.reference.sbmongocrud.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reference.sbmongocrud.model.WrestlerCard;
import com.reference.sbmongocrud.service.WrestleManiaCardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/cards", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class WrestleManiaCardController {
	
	@Autowired
	public WrestleManiaCardController(WrestleManiaCardService wManiaService) {
		super();
		this.wManiaService = wManiaService;
	}
	
	private WrestleManiaCardService wManiaService;
	
	@GetMapping
	public Collection<WrestlerCard> getAllWrestlers() {
		
		log.info("call getAllWrestlers()");
		return wManiaService.getAllCards();
	}
	
	@GetMapping("/{id}")
    public Optional<WrestlerCard> getWrestlerByID(@PathVariable String id) {
        
		log.info("call getEmployeeById()");
		return wManiaService.getCardByID(id);
    }
	
	@PostMapping
	public WrestlerCard addWrestler(@RequestBody WrestlerCard wrestlerCard) {
		
		log.info("call addWrestler()");
		return wManiaService.saveCard(wrestlerCard);
	}
	
	

}
