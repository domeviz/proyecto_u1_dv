package com.uce.edu.demo.tienda.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tienda.modelo.Tienda;

@Repository
public class TiendaRepositoryImpl implements ITiendaRepository {

	@Override
	public void insertar(Tienda tienda) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la tienda: "+tienda);
	}

	@Override
	public Tienda buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la tienda: "+numero);
		Tienda t=new Tienda();
		t.setNumero(numero);
		return t;
	}

	@Override
	public void actualizar(Tienda tienda) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la tienda: "+tienda);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la tienda: "+numero);
	}

}
