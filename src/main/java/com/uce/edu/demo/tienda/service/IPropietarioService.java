package com.uce.edu.demo.tienda.service;

import com.uce.edu.demo.tienda.modelo.Propietario;

public interface IPropietarioService {

	public void ingresar(Propietario p);

	public Propietario buscar(String apellido);
	
	public void actualizar(Propietario p);

	public void eliminar(String cedula);
}
