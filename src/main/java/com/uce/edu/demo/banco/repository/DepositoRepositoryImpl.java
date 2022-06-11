package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDep=new ArrayList<>();
		
		Deposito depo1=new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("2345");
		
		listaDep.add(depo1);
		
		Deposito depo2=new Deposito();
		depo2.setFecha(LocalDateTime.of(2022, 3, 15, 9, 20, 12));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("1234");
		
		listaDep.add(depo2);
		
		return listaDep;
	}

}
