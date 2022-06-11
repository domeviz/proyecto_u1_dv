package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base de datos el retiro: "+r);
	}

	@Override
	public Retiro buscar(String idRetiro) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base de datos el retiro: "+idRetiro);
		Retiro r=new Retiro();
		r.setIdRetiro(idRetiro);
		return r;
	}

	@Override
	public void actualizar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base de datos el retiro con cuenta destino: "+numeroCuentaDestino);
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado de la base de datos el retiro con fecha: "+fecha);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRet=new ArrayList<>();
		
		Retiro ret1=new Retiro();
		ret1.setFecha(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		ret1.setMonto(new BigDecimal(25));
		ret1.setNumeroCuentaDestino("1239");
		
		listaRet.add(ret1);
		
		return listaRet;
	}


}
