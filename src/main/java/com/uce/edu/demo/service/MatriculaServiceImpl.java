package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matRepository;

	@Override
	public void ingresar(Matricula mt) {
		// TODO Auto-generated method stub
		this.matRepository.insertar(mt);
		
	}

	@Override
	public Matricula buscar(String a) {
		// TODO Auto-generated method stub
		return this.buscar(a);
	}

	@Override
	public void actualizar(Matricula mt) {
		// TODO Auto-generated method stub
		this.matRepository.actualizar(mt);
	}

	@Override
	public void eliminar(String a) {
		// TODO Auto-generated method stub
		this.matRepository.eliminar(a);
	}
	
	

}
