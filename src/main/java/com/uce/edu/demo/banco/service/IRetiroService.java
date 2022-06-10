package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String idRetiro, String numeroCuentaDestino, BigDecimal monto);

	public Retiro buscarPorId(String idRetiro);
	
	public void actualizarCuentaRetiro(String numeroCuentaDestino);

	public void eliminarRetiroDeFecha(LocalDateTime fecha);
}
