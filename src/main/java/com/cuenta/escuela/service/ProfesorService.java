package com.cuenta.escuela.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuenta.escuela.entity.Profesor;
import com.cuenta.escuela.repository.IProfesorDao;

@Service
public class ProfesorService {
	
	@Autowired
	IProfesorDao iProfesorDao;
	
	public String guardarProfesor(Profesor profesor) {
		try {
			iProfesorDao.save(profesor);
			return "Profesor Creado";
		} catch (Exception e) {
			return "Error"+e;
		}
	}
	
	public Optional<Profesor> detalleProfesor(String nombre) {
		return iProfesorDao.findByNombre(nombre);
	}
	
	public Optional<Profesor> detalleProfesorId(Integer id) {
		return iProfesorDao.findById(id);
	}
	
	//Nueva Prueba de git

}
