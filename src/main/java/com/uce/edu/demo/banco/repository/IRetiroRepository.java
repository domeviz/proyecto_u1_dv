package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void insertar(Retiro r);
	
	public Retiro buscar(String idRetiro);
	
	public void actualizar(String numeroCuentaDestino);
	
	public void eliminar(LocalDateTime fecha);
}
