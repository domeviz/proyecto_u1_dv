package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService iCuentaBancariaService;

	@Autowired
	private IRetiroRepository iRetiroRepository;
	
	@Override
	public void realizarRetiro(String idRetiro, String numeroCuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.iCuentaBancariaService.buscarCuenta(numeroCuentaDestino);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.iCuentaBancariaService.actualizarCuenta(cOrigen);

		Retiro r = new Retiro();
		r.setIdRetiro(idRetiro);
		r.setNumeroCuentaDestino(numeroCuentaDestino);
		r.setMonto(monto);
		r.setFecha(LocalDateTime.now());

		this.iRetiroRepository.insertar(r);
	}

	@Override
	public Retiro buscarPorId(String idRetiro) {
		// TODO Auto-generated method stub
		return this.iRetiroRepository.buscar(idRetiro);
	}

	@Override
	public void actualizarCuentaRetiro(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.actualizar(numeroCuentaDestino);
	}

	@Override
	public void eliminarRetiroDeFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.eliminar(fecha);
	}

}
