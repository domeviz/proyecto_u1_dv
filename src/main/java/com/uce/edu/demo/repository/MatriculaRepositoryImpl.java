package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula mt) {
		// TODO Auto-generated method stub
		//Aqui se realiza la insercion en la base de datos
		System.out.println("Se ha insertado en la base la matricula: "+mt);
	}

	@Override
	public Matricula buscar(String matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la matricula: "+matricula);
		Matricula mt=new Matricula();
		mt.setNumero(matricula);
		return mt;
	}

	@Override
	public void actualizar(Matricula mt) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula: "+mt);
	}

	@Override
	public void eliminar(String matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la matricula: "+matricula);
	}

}
