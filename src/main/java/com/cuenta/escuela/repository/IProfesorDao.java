package com.cuenta.escuela.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cuenta.escuela.entity.Alumno;
import com.cuenta.escuela.entity.Profesor;

@Repository
public interface IProfesorDao extends CrudRepository<Profesor, Integer>{
	
	public Optional<Profesor> findByNombre(String nombre);

}
