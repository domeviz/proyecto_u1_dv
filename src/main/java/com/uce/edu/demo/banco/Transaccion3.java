package com.uce.edu.demo.banco;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

//IoC Service
@Service
public class Transaccion3 {

	private LocalDateTime fechaTransaccion;

	// DI por metodos SET

	private Cajero cajero; // @Autowired en el metodo SET
	private Cliente cliente; // @Autowired en el metodo SET

	public String transaccion(LocalDateTime fechaTransaccion, Integer idCajero, String ciudad, String nombre,
			String apellido, Integer cuenta) {

		this.fechaTransaccion = fechaTransaccion;

		this.cajero.setIdCajero(idCajero);
		this.cajero.setCiudad(ciudad);

		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCuenta(cuenta);

		// Transaccion agregada a la base de datos
		return "Transaccion 3 exitosa";
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

	@Autowired
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Autowired
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
