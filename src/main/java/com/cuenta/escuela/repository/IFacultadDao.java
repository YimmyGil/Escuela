package com.cuenta.escuela.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cuenta.escuela.entity.Facultad;

@Repository
public interface IFacultadDao extends CrudRepository<Facultad, Integer>{
	
	

}
