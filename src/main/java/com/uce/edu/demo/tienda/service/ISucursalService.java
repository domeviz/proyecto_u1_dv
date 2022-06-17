package com.uce.edu.demo.tienda.service;

import com.uce.edu.demo.tienda.modelo.Sucursal;

public interface ISucursalService {

	public void insertar(Sucursal sucursal);

	public Sucursal buscar(String nombre);

	public void actualizar(Sucursal materia);

	public void eliminar(String nombre);
}
