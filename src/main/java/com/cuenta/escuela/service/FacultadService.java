package com.cuenta.escuela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuenta.escuela.entity.Facultad;
import com.cuenta.escuela.repository.IFacultadDao;

@Service
public class FacultadService {

	@Autowired
	IFacultadDao iFacultadDao;
	
	public String guardarFacultad(Facultad facultad) {
		try {
			iFacultadDao.save(facultad);
			return "Facultad Creada";
		} catch (Exception e) {
			return "Error"+e;
		}
	}
	
}
