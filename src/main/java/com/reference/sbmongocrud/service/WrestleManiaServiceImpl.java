package com.reference.sbmongocrud.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reference.sbmongocrud.model.WrestlerCard;
import com.reference.sbmongocrud.repository.WrestleManiaCardRepository;

@Service
public class WrestleManiaServiceImpl implements WrestleManiaCardService {

	
	@Autowired
	WrestleManiaCardRepository wManiaCardRepo;

	@Override
	public Collection<WrestlerCard> getAllCards() {
		return wManiaCardRepo.findAll();
	}

	
	@Override
	public WrestlerCard saveCard(WrestlerCard wc) {
		return null;
	}


	@Override
	public Optional<WrestlerCard> getCardByID(String id) {
		return wManiaCardRepo.findById(id);
	}

}
