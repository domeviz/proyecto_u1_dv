package com.uce.edu.demo.banco;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

//IoC Service
@Service
public class Transaccion2 {

	private LocalDateTime fechaTransaccion;

	// DI por constructor

	private Cajero cajero;
	private Cliente cliente;

	public Transaccion2(Cajero cajero, Cliente cliente) {
		this.cajero = cajero;
		this.cliente = cliente;
	}

	public String transaccion(LocalDateTime fechaTransaccion, Integer idCajero, String ciudad, String nombre,
			String apellido, Integer cuenta) {

		this.fechaTransaccion = fechaTransaccion;

		this.cajero.setIdCajero(idCajero);
		this.cajero.setCiudad(ciudad);

		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCuenta(cuenta);

		// Transaccion agregada a la base de datos
		return "Transaccion 2 exitosa";
	}

	// SET Y GET
	public LocalDateTime getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(LocalDateTime fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
