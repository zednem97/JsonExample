package com.it.demo.model;

public class RangoProfesional {

	Integer aniosDeExperiencia;
	
	String nivel;

	public RangoProfesional() {
	}

	public Integer getAniosDeExperiencia() {
		return aniosDeExperiencia;
	}
	
	public RangoProfesional(Integer aniosDeExperiencia, String nivel) {
		super();
		this.aniosDeExperiencia = aniosDeExperiencia;
		this.nivel = nivel;
	}

	public void setAniosDeExperiencia(Integer aniosDeExperiencia) {
		this.aniosDeExperiencia = aniosDeExperiencia;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}
