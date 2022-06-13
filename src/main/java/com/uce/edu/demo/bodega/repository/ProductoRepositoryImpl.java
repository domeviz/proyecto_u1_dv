package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado el producto a la Base de datos: "+producto);
	}
	
}
