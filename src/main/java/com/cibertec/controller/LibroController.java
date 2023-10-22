package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Libro;
import com.cibertec.service.LibroService;

@RestController
@RequestMapping("/rest/libro")
public class LibroController {

	@Autowired
	private LibroService service;
	
	@GetMapping
	@ResponseBody
	public List<Libro> lista(){
		return service.listaLibro();
	}
	
	@GetMapping("/porIsbn/{isbn}")
	@ResponseBody
	public List<Libro> listaPorIsbn(@PathVariable("isbn") String isbn){
		List<Libro> lstSalida = service.listaLibroPorIsbn(isbn);
		return lstSalida;
	}
	
}
