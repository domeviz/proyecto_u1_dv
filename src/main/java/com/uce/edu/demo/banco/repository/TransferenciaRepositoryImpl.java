package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

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

}
