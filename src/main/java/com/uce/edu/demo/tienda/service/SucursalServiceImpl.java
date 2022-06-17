package com.uce.edu.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tienda.modelo.Sucursal;
import com.uce.edu.demo.tienda.repository.ISucursalRepository;

@Service
public class SucursalServiceImpl implements ISucursalService {

	@Autowired
	ISucursalRepository iSucursalRepository;
	
	@Override
	public void insertar(Sucursal sucursal) {
		// TODO Auto-generated method stub
		this.iSucursalRepository.insertar(sucursal);
	}

	@Override
	public Sucursal buscar(String nombre) {
		// TODO Auto-generated method stub
		return this.iSucursalRepository.buscar(nombre);
	}

	@Override
	public void actualizar(Sucursal materia) {
		// TODO Auto-generated method stub
		this.iSucursalRepository.actualizar(materia);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		this.iSucursalRepository.eliminar(nombre);
	}

}
