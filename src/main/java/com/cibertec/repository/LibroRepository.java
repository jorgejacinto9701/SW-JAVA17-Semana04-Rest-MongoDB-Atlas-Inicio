package com.cibertec.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cibertec.entity.Libro;

public interface LibroRepository extends MongoRepository<Libro, Integer>{

	@Query("{isbn: ?0}")
	public abstract List<Libro> listaCursoPorIsbn(String isbn);
	
}
