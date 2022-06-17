package com.uce.edu.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tienda.modelo.Empleado;
import com.uce.edu.demo.tienda.modelo.Encargado;
import com.uce.edu.demo.tienda.modelo.Tienda;
import com.uce.edu.demo.tienda.repository.ITiendaRepository;

@Service
public class TiendaServiceImpl implements ITiendaService{

	@Autowired
	private ITiendaRepository iTiendaRepository;
	
	@Autowired
	private Encargado encargado;
	
	@Autowired
	private Empleado empleado;
	
	@Override
	public void ingresar(Tienda tienda) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON "+this.encargado);
		System.out.println("DI desde Service PROTOTYPE "+this.empleado);
		this.iTiendaRepository.insertar(tienda);
	}

	@Override
	public Tienda buscar(String numero) {
		// TODO Auto-generated method stub
		return this.iTiendaRepository.buscar(numero);
	}

	@Override
	public void actualizar(Tienda tienda) {
		// TODO Auto-generated method stub
		this.iTiendaRepository.actualizar(tienda);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.iTiendaRepository.eliminar(numero);
	}

}
