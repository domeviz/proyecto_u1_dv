package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

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


}