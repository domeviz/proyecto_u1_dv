package com.uce.edu.demo.banco;

import org.springframework.stereotype.Component;

//IoC Component
@Component
public class Cliente {

	private String nombre;
	private String apellido;
	private Integer cuenta;

	// SET Y GET
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

	public Integer getCuenta() {
		return cuenta;
	}

	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}

}
