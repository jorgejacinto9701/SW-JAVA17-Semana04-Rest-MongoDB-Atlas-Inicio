package com.cibertec.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "accounts")
public class Account {

	private int account_id;
	private int limit;
	private List<String> products;
	
}



