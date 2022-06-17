package com.uce.edu.demo.tienda.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tienda.modelo.Sucursal;

@Repository
public class SucursalRepositoryImpl implements ISucursalRepository {

	@Override
	public void insertar(Sucursal sucursal) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la sucursal: "+sucursal);
	}

	@Override
	public Sucursal buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la sucursal: "+nombre);
		Sucursal s=new Sucursal();
		s.setNombre(nombre);
		return s;
	}

	@Override
	public void actualizar(Sucursal materia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		
	}

}
