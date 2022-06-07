package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {

	public void ingresar(Materia materia);

	public Materia buscar(String nombre);
	
	public void actualizar(Materia materia);

	public void eliminar(String nombre);
}
