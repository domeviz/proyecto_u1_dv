package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: "+d);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el deposito con numero de cuenta: "+numeroCuentaDestino);
		Deposito d=new Deposito();
		d.setNumeroCuentaDestino(numeroCuentaDestino);
		return d;
	}

	@Override
	public void actualizarFechaDeposito(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el deposito con fecha: "+fecha);
	}

	@Override
	public void eliminarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el deposito con numero de cuenta: "+numeroCuentaDestino);
	}

}
