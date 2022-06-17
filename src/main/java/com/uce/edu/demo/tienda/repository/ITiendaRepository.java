package com.uce.edu.demo.tienda.repository;

import com.uce.edu.demo.tienda.modelo.Tienda;

public interface ITiendaRepository {

	public void insertar(Tienda tienda);

	public Tienda buscar(String numero);

	public void actualizar(Tienda tienda);

	public void eliminar(String numero);
}
