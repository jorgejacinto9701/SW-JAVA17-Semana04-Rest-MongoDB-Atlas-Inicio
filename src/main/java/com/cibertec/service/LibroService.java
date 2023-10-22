package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Libro;

public interface LibroService {

	public abstract List<Libro> listaLibro();
	public abstract List<Libro> listaLibroPorIsbn(String isbn);
}
