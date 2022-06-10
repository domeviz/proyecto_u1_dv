package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private LocalDateTime fecha;
	private String idRetiro;
	private String numeroCuentaDestino;
	private BigDecimal monto;
	
	@Override
	public String toString() {
		return "Retiro [fecha=" + fecha + ", idRetiro=" + idRetiro + ", numeroCuentaDestino=" + numeroCuentaDestino
				+ ", monto=" + monto + "]";
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getIdRetiro() {
		return idRetiro;
	}
	public void setIdRetiro(String idRetiro) {
		this.idRetiro = idRetiro;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
}
