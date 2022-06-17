package com.uce.edu.demo.tienda.modelo;

import java.util.List;

public class Tienda {

	private String numero;
	private Propietario propietario;
	private List<Sucursal> sucursal;
	
	@Override
	public String toString() {
		return "\n Tienda [numero=" + numero + "\n propietario=" + propietario + "\n sucursal=" + sucursal + "]";
	}
	
	//SET y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public List<Sucursal> getSucursal() {
		return sucursal;
	}
	public void setSucursal(List<Sucursal> sucursal) {
		this.sucursal = sucursal;
	}
}
