package com.uce.edu.demo.tienda.repository;

import com.uce.edu.demo.tienda.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar(Propietario p);

	public Propietario buscar(String apellido);

	public void actualizar(Propietario p);

	public void eliminar(String cedula);
}
