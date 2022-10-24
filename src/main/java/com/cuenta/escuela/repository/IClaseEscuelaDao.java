package com.cuenta.escuela.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cuenta.escuela.entity.ClaseEscuela;

public interface IClaseEscuelaDao extends CrudRepository<ClaseEscuela, Integer>{
	
	public Optional<ClaseEscuela> findByDescripcion(String nombre);

}
