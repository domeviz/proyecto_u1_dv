package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {

	public void insertar(Materia materia);

	public Materia buscar(String nombre);

	public void actualizar(Materia materia);

	public void eliminar(String nombre);
}
