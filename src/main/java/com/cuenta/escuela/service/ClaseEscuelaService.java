package com.cuenta.escuela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuenta.escuela.entity.ClaseEscuela;
import com.cuenta.escuela.repository.IClaseEscuelaDao;

@Service
public class ClaseEscuelaService {
	
	@Autowired
	IClaseEscuelaDao iClaseEscuela;
	
	public String saveClase(ClaseEscuela clase) {
		try {
			 iClaseEscuela.save(clase);
			 return "Clase creada";
		} catch (Exception e) {
			return "error"+e;
		}
		
	}

}
