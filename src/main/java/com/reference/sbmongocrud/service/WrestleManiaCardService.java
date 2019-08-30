package com.reference.sbmongocrud.service;

import java.util.Collection;
import java.util.Optional;

import com.reference.sbmongocrud.model.WrestlerCard;

public interface WrestleManiaCardService {

	public Collection<WrestlerCard> getAllCards();
	public Optional<WrestlerCard> getCardByID(String id);
	public WrestlerCard saveCard(WrestlerCard wc);
	
}
