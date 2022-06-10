package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	public Transferencia buscar(String numeroCuentaOrigen);
	
	public void actualizar(LocalDateTime fechaTransferencia);
	
	public void eliminar(String numeroCuentaDestino);
	
}
