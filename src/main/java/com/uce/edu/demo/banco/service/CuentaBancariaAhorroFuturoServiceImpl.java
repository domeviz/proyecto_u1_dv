package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorro futuro")
public class CuentaBancariaAhorroFuturoServiceImpl implements ICuentaBancariaService{

	@Override
	public void actualizarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscarCuenta(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCuenta(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		//Interes del 5%
		BigDecimal interes=new BigDecimal(200).multiply(new BigDecimal(5)).divide(new BigDecimal(100));
		//Al interes le sumo el 10% del saldo
		interes=interes.add(saldo.divide(new BigDecimal(10)));
		return interes;
	}

}
