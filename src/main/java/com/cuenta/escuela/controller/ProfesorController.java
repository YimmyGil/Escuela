package com.cuenta.escuela.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuenta.escuela.entity.Profesor;
import com.cuenta.escuela.service.ProfesorService;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
	
	@Autowired
	ProfesorService profesorService;
	
	@PostMapping("/guardar")
	public String saveProfesor(@RequestBody Profesor profesor) {
		return profesorService.guardarProfesor(profesor);
	}
	
	@GetMapping("/detalleProfesor")
	public Optional<Profesor> datosProfesor(String nombre){
		return profesorService.detalleProfesor(nombre);
	}
	
	@GetMapping("/detalleProfesorId")
	public Optional<Profesor> detailProfesor(Integer id){
		return profesorService.detalleProfesorId(id);
	}

}
