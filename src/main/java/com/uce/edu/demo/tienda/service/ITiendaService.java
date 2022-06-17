package com.uce.edu.demo.tienda.service;

import com.uce.edu.demo.tienda.modelo.Tienda;

public interface ITiendaService {

	public void ingresar(Tienda tienda);

	public Tienda buscar(String numero);
	
	public void actualizar(Tienda tienda);

	public void eliminar(String numero);
}
