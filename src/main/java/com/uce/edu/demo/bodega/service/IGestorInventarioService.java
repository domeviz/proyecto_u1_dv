package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IGestorInventarioService {

	public BigDecimal precioVenta(Producto p);
	
	public List<Producto> consultar(LocalDateTime fecha);
	
	
}
