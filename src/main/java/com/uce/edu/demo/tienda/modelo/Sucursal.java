package com.uce.edu.demo.tienda.modelo;

public class Sucursal {

	private String nombre;
	private String ciudad;
	private String direccion;
	
	@Override
	public String toString() {
		return "Sucursal [nombre=" + nombre + ", ciudad=" + ciudad + ", direccion=" + direccion + "]";
	}
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
