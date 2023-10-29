package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/porId/{id}")
	@ResponseBody
	public List<Account> listaPorId(@PathVariable("id") int id){
		return service.listaCuentaPorId(id);
	}
	
	@GetMapping("/porLimit/{desde}-{hasta}")
	@ResponseBody
	public List<Account> porLimit(@PathVariable("desde") int desde, @PathVariable("hasta") int hasta){
		return service.listaCuentaPorLimitRango(desde, hasta);
	}
	
	@GetMapping("/porProducto/{producto}")
	@ResponseBody
	public List<Account> porProducto(@PathVariable("producto") String producto){
		return service.listaArrayProducto(producto);
	}
	
	@GetMapping("/cantidadPorProducto/{producto}")
	@ResponseBody
	public Integer cantidadPorProducto(@PathVariable("producto") String producto){
		return service.cuentaArrayProducto(producto);
	}
}
