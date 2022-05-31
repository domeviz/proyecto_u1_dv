package com.uce.edu.demo.banco;

import org.springframework.stereotype.Component;

//IoC Component
@Component
public class Cajero {

	private Integer idCajero;
	private String ciudad;

	// SET Y GET
	public Integer getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(Integer idCajero) {
		this.idCajero = idCajero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
