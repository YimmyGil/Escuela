package com.cuenta.escuela.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuenta.escuela.entity.Alumno;
import com.cuenta.escuela.service.AlumnoService;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@GetMapping("/detail")
	public Alumno datosCliente(String nombre) {
		return alumnoService.detailClientes(nombre);
	}

	
	@PostMapping("/save")
	public String saveCliente(@RequestBody Alumno alumno) {
		return alumnoService.guardarCliente(alumno);
	}
	
	@GetMapping("/listaAlumnos")
	public List<Alumno> alumnos(){
		return alumnoService.mostrarAlumnos();
	}
	
	@GetMapping("/detailAlumno")
	public Optional<Alumno> datosAlumno(String nombre){
		return alumnoService.detailAlumno(nombre);
	}
	
	@DeleteMapping("/eliminar")
	public boolean deleteAlumno(String nombre) {
		return alumnoService.eliminarAlumnoNombre(nombre);
	}
	
	@DeleteMapping("/eliminarById")
	public boolean deleteAlumnoId(Integer id) {
		return alumnoService.eliminarById(id);
	}

	//Inicio de git
	
}
