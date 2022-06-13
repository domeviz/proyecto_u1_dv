package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el inventario en la base de datos: \n"+inventario);
	}

	@Override
	public List<Producto> buscarProductos() {
		// TODO Auto-generated method stub
		Producto p=new Producto();
		p.setNombre("Coca Cola");
		p.setCantidad(100);
		p.setPrecioCompra(new BigDecimal(1));
		p.setFechaIngreso(LocalDateTime.of(2022, 05, 01, 23, 03, 05));
		
		Producto p2=new Producto();
		p2.setNombre("Huevos");
		p2.setCantidad(300);
		p2.setPrecioCompra(new BigDecimal(3));
		p2.setFechaIngreso(LocalDateTime.of(2022, 06, 01, 23, 03, 05));
		
		Producto p3=new Producto();
		p3.setNombre("Agua");
		p3.setCantidad(400);
		p3.setPrecioCompra(new BigDecimal(1));
		p3.setFechaIngreso(LocalDateTime.of(2021, 02, 01, 12, 10, 23));
		
		Producto p4=new Producto();
		p4.setNombre("Jugo");
		p4.setCantidad(120);
		p4.setPrecioCompra(new BigDecimal(2));
		p4.setFechaIngreso(LocalDateTime.of(2021, 05, 11, 12, 10, 11));
		
		Producto p5=new Producto();
		p5.setNombre("Avena");
		p5.setCantidad(80);
		p5.setPrecioCompra(new BigDecimal(3));
		p5.setFechaIngreso(LocalDateTime.of(2021, 07, 10, 12, 10, 15));
		
		List<Producto> pro=new ArrayList<Producto>();
		pro.add(p);
		pro.add(p2);
		pro.add(p3);
		pro.add(p4);
		pro.add(p5);
		return pro;
	}
}
