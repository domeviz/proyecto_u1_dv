package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {

	public void ingresar(Materia m);

	public Materia buscar(String a);
	
	public void actualizar(Materia m);

	public void eliminar(String a);
}
