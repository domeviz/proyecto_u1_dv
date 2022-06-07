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
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matRepository.insertar(matricula);
		
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		return this.matRepository.buscar(numero);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matRepository.actualizar(matricula);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.matRepository.eliminar(numero);
	}
	
	

}
