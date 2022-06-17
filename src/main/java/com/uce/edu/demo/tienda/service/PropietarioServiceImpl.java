package com.uce.edu.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tienda.modelo.Propietario;
import com.uce.edu.demo.tienda.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void ingresar(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(p);
	}

	@Override
	public Propietario buscar(String apellido) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscar(apellido);
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(cedula);
	}

}
