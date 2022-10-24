package com.cuenta.escuela.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cuenta.escuela.entity.Alumno;

@Repository
public interface IAlumnoDao extends CrudRepository<Alumno, Integer> {
	
	public Optional<Alumno> findByNombre(String nombre);
	
	public boolean deleteByNombre(String nombre);
	
	@Query(value="select * from alumno", nativeQuery = true)
	public List<Alumno> listaAlumnos();

}
