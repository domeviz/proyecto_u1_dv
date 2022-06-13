package com.uce.edu.demo.bodega.modelo;

import java.util.List;

public class Inventario {

	private String bodega;
	private List<Producto> producto;
	
	@Override
	public String toString() {
		return "Inventario [bodega=" + bodega + ", producto=" + producto + "]";
	}
	
	public String getBodega() {
		return bodega;
	}
	public void setBodega(String bodega) {
		this.bodega = bodega;
	}
	public List<Producto> getProducto() {
		return producto;
	}
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
}