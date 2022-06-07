package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		//Aqui se realiza la insercion en la base de datos
		System.out.println("Se ha insertado en la base la materia: "+materia);
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la materia: "+nombre);
		Materia m=new Materia();
		m.setNombre(nombre);
		return m;
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la materia: "+materia);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la materia: "+nombre);
	}

}