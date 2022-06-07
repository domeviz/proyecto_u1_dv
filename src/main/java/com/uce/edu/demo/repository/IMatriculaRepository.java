package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
//CRUD
	// C: crear/insertar
	public void insertar(Matricula e);

	// R: leer/buscar
	public Matricula buscar(String a);

	// U: actualizar
	public void actualizar(Matricula e);

	// D: leer/buscar
	public void eliminar(String a);
}
