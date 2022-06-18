package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profeM=new ProfesorMateria();
		profeM.setNombre("Jose");
		profeM.setApellido("Tapia");
		return profeM;
	}

	@Override
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON " + this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE " + this.profesorMateria);
		
		System.out.println("DI un metodo General: " + this.obtenerProfesorG());
		System.out.println("DI un metodo Materia: " + this.obtenerProfesorM());
		
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
