package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia: "+t);
	}

	@Override
	public Transferencia buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la transferencia con cuenta de origen: "+numeroCuentaOrigen);
		Transferencia t=new Transferencia();
		t.setNumeroCuentaOrigen(numeroCuentaOrigen);
		return t;
	}

	@Override
	public void actualizar(LocalDateTime fechaTransferencia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la transferencia con fecha: "+fechaTransferencia);
	}

	@Override
	public void eliminar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la transferencia con cuenta de destino: "+numeroCuentaDestino);
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//Aqui deberia estar el SQL
		List<Transferencia> listaConsultada=new ArrayList<>();
		Transferencia trans1=new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("12567");
		listaConsultada.add(trans1);
		return listaConsultada;
	}

}
