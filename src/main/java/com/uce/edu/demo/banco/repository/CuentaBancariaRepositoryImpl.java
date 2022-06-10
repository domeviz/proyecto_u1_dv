package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	@Override
	public void actualizar(CuentaBancaria c) {
		// Aqui hay que construir los SQL's
		System.out.println("Cuenta bancaria actualizada: "+c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria: "+numero);
		CuentaBancaria cta=new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		return cta;
	}

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base de datos la cuenta: " + c);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base de datos la cuenta con numero: " + numero);
	}

}
