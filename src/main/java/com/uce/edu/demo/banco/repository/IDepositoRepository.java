package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	public void insertarDeposito(Deposito d);
	
	public Deposito buscarDeposito(String numeroCuentaDestino);
	
	public void actualizarFechaDeposito(LocalDateTime fecha);
	
	public void eliminarDeposito(String numeroCuentaDestino);
}
