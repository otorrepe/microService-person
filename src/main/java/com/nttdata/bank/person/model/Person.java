package com.nttdata.bank.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "persons")
public class Person {
	
	@Id
	private String _id;
	
	private String name;
	
	private String surnames;
	
	private int mobile;
	
	private String email;
	
	private String document;
	
	/* tipo de personas */
	// 1 -> Titular
	// 2 -> Firmante autorizado
	private Byte type;
	
	private String description;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private String customerId;

}
