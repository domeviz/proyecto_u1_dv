package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresar(Matricula mt);

	public Matricula buscar(String a);
	
	public void actualizar(Matricula mt);

	public void eliminar(String a);
}
