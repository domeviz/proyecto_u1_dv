package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl implements ITransaccionService {

	//Gestiona la transaccion
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IDepositoService iDepositoService;
	
	@Autowired
	private IRetiroService iRetiroService;
	
	@Autowired
	private ITransferenciaRepository iTransdeITransferenciaRepository;
	
	@Autowired
	private IDepositoRepository iDepositoRepository;
	
	@Autowired
	private IRetiroRepository iRetiroRepository;
	
	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iDepositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iRetiroService.realizarRetiro(ctaRetiro, ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		
		List<Transferencia> listaTrans = this.iTransdeITransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDep = this.iDepositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaRet = this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);
		//Vamos a unir todas las listas
		List<TransaccionTo> listaFinal=new ArrayList<>();
		
		for(Transferencia t:listaTrans) {
			TransaccionTo transaccionTo= this.transformar(t);
			listaFinal.add(transaccionTo);
		}
		
		for(Deposito d:listaDep) {
			TransaccionTo transaccionTo= this.transformar(d);
			listaFinal.add(transaccionTo);
		}
		
		for(Retiro r:listaRet) {
			TransaccionTo transaccionTo= this.transformar(r);
			listaFinal.add(transaccionTo);
		}
		
		return listaFinal;
	}
	
	private TransaccionTo transformar(Transferencia transferencia) {
		TransaccionTo  transTo=new TransaccionTo();
		transTo.setFecha(transferencia.getFechaTransferencia());
		transTo.setMonto(transferencia.getMontoTransferir());
		transTo.setTipo("T");
		return transTo;
	}

	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo  transTo=new TransaccionTo();
		transTo.setFecha(deposito.getFecha());
		transTo.setMonto(deposito.getMonto());
		transTo.setTipo("D");
		return transTo;
	}
	
	private TransaccionTo transformar(Retiro retiro) {
		TransaccionTo  transTo=new TransaccionTo();
		transTo.setFecha(retiro.getFecha());
		transTo.setMonto(retiro.getMonto());
		transTo.setTipo("R");
		return transTo;
	}

}
