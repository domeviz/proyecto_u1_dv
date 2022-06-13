package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.service.IInventarioService;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication
public class ProyectoU1DvApplication implements CommandLineRunner {
	
	@Autowired
	private IProductoService iProductoService;
	
	@Autowired
	private IInventarioService iInventarioService;
	
	@Autowired
	private IGestorInventarioService iGestorInventarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Producto p=new Producto();
		p.setNombre("Coca Cola");
		p.setCantidad(100);
		p.setPrecioCompra(new BigDecimal(1));
		p.setPrecioVenta(this.iGestorInventarioService.precioVenta(p));
		p.setFechaIngreso(LocalDateTime.of(2022, 05, 01, 23, 03, 05));
		
		this.iProductoService.insertarProducto(p);
		
		Producto p2=new Producto();
		p2.setNombre("Huevos");
		p2.setCantidad(300);
		p2.setPrecioCompra(new BigDecimal(3));
		p2.setPrecioVenta(this.iGestorInventarioService.precioVenta(p2));
		p2.setFechaIngreso(LocalDateTime.of(2022, 06, 01, 23, 03, 05));
		
		this.iProductoService.insertarProducto(p2);
		
		Producto p3=new Producto();
		p3.setNombre("Agua");
		p3.setCantidad(400);
		p3.setPrecioCompra(new BigDecimal(1));
		p3.setPrecioVenta(this.iGestorInventarioService.precioVenta(p3));
		p3.setFechaIngreso(LocalDateTime.of(2021, 02, 01, 12, 10, 23));
		
		this.iProductoService.insertarProducto(p3);
		
		Producto p4=new Producto();
		p4.setNombre("Jugo");
		p4.setCantidad(120);
		p4.setPrecioCompra(new BigDecimal(2));
		p4.setPrecioVenta(this.iGestorInventarioService.precioVenta(p4));
		p4.setFechaIngreso(LocalDateTime.of(2021, 05, 11, 12, 10, 11));
		
		this.iProductoService.insertarProducto(p4);
		
		Producto p5=new Producto();
		p5.setNombre("Avena");
		p5.setCantidad(80);
		p5.setPrecioCompra(new BigDecimal(3));
		p5.setPrecioVenta(this.iGestorInventarioService.precioVenta(p5));
		p5.setFechaIngreso(LocalDateTime.of(2021, 07, 10, 12, 10, 15));
		
		this.iProductoService.insertarProducto(p5);
		
		List<Producto> pro=new ArrayList<Producto>();
		pro.add(p);
		pro.add(p2);
		pro.add(p3);
		pro.add(p4);
		pro.add(p5);
		
		Inventario i=new Inventario();
		i.setBodega("123");
		i.setProducto(pro);
		
		this.iInventarioService.insertar(i);
		
		System.out.println("\n    MEGA SANTA MARIA ");
		System.out.println("\n  Reporte de Inventario ");
		
		System.out.println("\n Fecha 1: "+ LocalDateTime.of(2020, 2, 1, 12, 9, 21));
		this.iGestorInventarioService.consultar(LocalDateTime.of(2020, 2, 1, 12, 10, 11));
		
		System.out.println("\n Fecha 2: "+ LocalDateTime.of(2022, 1, 1, 12, 10, 11));
		this.iGestorInventarioService.consultar(LocalDateTime.of(2022, 1, 1, 12, 10, 11));
	}

}