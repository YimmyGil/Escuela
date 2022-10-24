package com.cuenta.escuela.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Alumno")
public class Alumno implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private long identiticacion;
	private long telefono;
	
	@JsonIgnoreProperties({"alumno","hibernateLazyInitializer","handler"})
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "alumno", cascade = CascadeType.ALL)
	private List<ClaseEscuela> clases;
	
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getIdentiticacion() {
		return identiticacion;
	}
	public void setIdentiticacion(long identiticacion) {
		this.identiticacion = identiticacion;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public List<ClaseEscuela> getClases() {
		return clases;
	}
	public void setClases(List<ClaseEscuela> clases) {
		this.clases = clases;
	}
	
	
	
	
	
	

}
