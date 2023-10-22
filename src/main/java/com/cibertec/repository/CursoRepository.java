package com.cibertec.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cibertec.entity.Curso;

public interface CursoRepository extends MongoRepository<Curso, Integer>{

}
