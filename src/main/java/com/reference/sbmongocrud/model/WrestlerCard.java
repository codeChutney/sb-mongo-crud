package com.reference.sbmongocrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class WrestlerCard {

	@Id
	private String wrestlerID;
	private String wrestlerName;
	
}
