package com.uce.edu.demo.bodega.service;

import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {

	public void insertar(Inventario inventario);
	
	public List<Producto> buscarProductos();
}
