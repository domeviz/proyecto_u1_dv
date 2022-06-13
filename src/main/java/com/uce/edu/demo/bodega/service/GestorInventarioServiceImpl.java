package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {
	
	@Autowired
	private IInventarioService iInventarioService;

	@Override
	public BigDecimal precioVenta(Producto p) {
		// TODO Auto-generated method stub
		BigDecimal precioC=p.getPrecioCompra();
		BigDecimal ganancia=precioC.multiply(new BigDecimal(10)).divide(new BigDecimal(100));
		BigDecimal iva=precioC.multiply(new BigDecimal(12)).divide(new BigDecimal(100));
		BigDecimal precioV=precioC.add(ganancia).add(iva);
		
		return precioV;
	}

	@Override
	public List<Producto> consultar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		List<Producto> listaI=this.iInventarioService.buscarProductos();
		List<Producto> lista=new ArrayList<>();
		for(Producto p:listaI) {
			if(p.getFechaIngreso().compareTo(fecha)>0) {
				p.setPrecioVenta(this.precioVenta(p));
				lista.add(p);
				System.out.println(p.getNombre()+" - "+ p.getCantidad()+" - $"+p.getPrecioVenta()
									+ " - "+ p.getFechaIngreso());
			}
		}
		return lista;
	}

}