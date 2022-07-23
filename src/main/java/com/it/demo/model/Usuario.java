package com.it.demo.model;

import java.util.List;

public class Usuario {

	String nombre;
	
	String profesion;
	
	Integer edad;
	
	List<String> lenguajes;
	
	boolean disponibilidadParaViajar;
	
	RangoProfesional rangoProfesional;

	public Usuario() {
	}

	
	public Usuario(String nombre, String profesion, Integer edad, List<String> lenguajes,
			boolean disponibilidadParaViajar, RangoProfesional rangoProfesional) {
		this.nombre = nombre;
		this.profesion = profesion;
		this.edad = edad;
		this.lenguajes = lenguajes;
		this.disponibilidadParaViajar = disponibilidadParaViajar;
		this.rangoProfesional = rangoProfesional;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public List<String> getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(List<String> lenguajes) {
		this.lenguajes = lenguajes;
	}

	public boolean isDisponibilidadParaViajar() {
		return disponibilidadParaViajar;
	}

	public void setDisponibilidadParaViajar(boolean disponibilidadParaViajar) {
		this.disponibilidadParaViajar = disponibilidadParaViajar;
	}

	public RangoProfesional getRangoProfesional() {
		return rangoProfesional;
	}


	public void setRangoProfesional(RangoProfesional rangoProfesional) {
		this.rangoProfesional = rangoProfesional;
	}
	
}
