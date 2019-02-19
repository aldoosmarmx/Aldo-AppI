package com.proyecto.aldo.entity;

public class dato {

	int id;
	int emisiones;
	int año;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public dato(){}
	
	
	public dato(int id, int emi, int anio) {
		super();
		this.id = id;
		this.emisiones = emi;
	}

	public int getEmi() {
		return emisiones;
	}
	public void setEmi(int emi) {
		this.emisiones = emi;
	}
	public int getAnio() {
		return año;
	}
	public void setAnio(int anio) {
		this.año = anio;
	}
	
}
