package com.cuenta.escuela.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuenta.escuela.entity.Alumno;
import com.cuenta.escuela.repository.IAlumnoDao;

@Service
public class AlumnoService {

	@Autowired
	IAlumnoDao iAlumnoRepository;
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	public Alumno detailClientes(String nombre){
		return iAlumnoRepository.findByNombre(nombre).orElse(null);
	}
	
	public String guardarCliente(Alumno alumno) {
		try {
			iAlumnoRepository.save(alumno);
			return "Cliente guardado";
		} catch (Exception e) {
			return "Error: "+e;
		}
		
	}
	
	
	public List<Alumno> mostrarAlumnos(){
		return iAlumnoRepository.listaAlumnos();
	}
	
	public Optional<Alumno> detailAlumno(String nombre) {
		return iAlumnoRepository.findByNombre(nombre);
	}
	
	public boolean eliminarAlumnoNombre(String nombre) {
		return iAlumnoRepository.deleteByNombre(nombre);
	}
	
	public boolean eliminarById(Integer id) {
		try {
			  iAlumnoRepository.deleteById(id);
			  return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
