package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Account;
import com.cibertec.service.AccountService;

@RestController
@RequestMapping("/rest/accounts")
public class AccountController {

	@Autowired
	private AccountService service;
	
	@GetMapping
	@ResponseBody
	public List<Account> lista(){
		return service.listaAccount();
	}
}
