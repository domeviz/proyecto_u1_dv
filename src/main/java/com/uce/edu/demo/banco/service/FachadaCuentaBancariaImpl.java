package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaImpl implements IFachadaCuentaBancaria {

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaAService;
	
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		BigDecimal interes=null;
		CuentaBancaria cta=this.bancariaRepository.buscar(numeroCta);
		if(cta.getTipo().equals("A")) {
			//Ahorros
			interes=this.bancariaAService.calcularInteres(numeroCta, cta.getSaldo());
		} else {
			//Corriente
			interes=this.bancariaService.calcularInteres(numeroCta, cta.getSaldo());
		}
		return interes;
	}

}
