package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresar(Matricula matricula);

	public Matricula buscar(String numero);
	
	public void actualizar(Matricula matricula);

	public void eliminar(String numero);
}
