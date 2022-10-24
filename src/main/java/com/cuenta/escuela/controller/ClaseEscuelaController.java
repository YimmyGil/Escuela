package com.cuenta.escuela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuenta.escuela.entity.ClaseEscuela;
import com.cuenta.escuela.service.ClaseEscuelaService;

@RestController
@RequestMapping("/api/clase")
public class ClaseEscuelaController {
	
	@Autowired
	ClaseEscuelaService claseEscuelaService;

	@PostMapping("/save")
	public String guardarClase(@RequestBody ClaseEscuela clase) {
		return claseEscuelaService.saveClase(clase);
	}
	
}
