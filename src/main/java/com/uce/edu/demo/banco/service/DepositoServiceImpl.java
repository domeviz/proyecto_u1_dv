package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino= this.bancariaService.buscarCuenta(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal=saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizarCuenta(ctaDestino);
		
		Deposito deposito=new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(monto);
		this.depositoRepository.insertarDeposito(deposito);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscarDeposito(numeroCuentaDestino);
	}

	@Override
	public void actualizarFechaDeposito(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.depositoRepository.actualizarFechaDeposito(fecha);
	}

	@Override
	public void eliminarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminarDeposito(numeroCuentaDestino);
	}

}
