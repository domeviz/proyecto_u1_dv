package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);
	
	public Transferencia buscar(String numeroCuentaOrigen);
	
	public void actualizar(LocalDateTime fechaTransferencia);
	
	public void eliminar(String numeroCuentaDestino);
}
