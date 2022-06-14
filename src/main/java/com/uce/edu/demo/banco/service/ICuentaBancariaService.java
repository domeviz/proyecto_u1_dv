package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void actualizarCuenta(CuentaBancaria c);
	
	public CuentaBancaria buscarCuenta(String numero);
	
	public void insertarCuenta(CuentaBancaria c);
	
	public void borrarCuenta(String numero);

	BigDecimal calcularInteres(String numeroCta, BigDecimal saldo);
}
