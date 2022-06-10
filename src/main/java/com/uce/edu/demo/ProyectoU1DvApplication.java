package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1DvApplication implements CommandLineRunner {
	
	@Autowired
	private ICuentaBancariaService iCuentaBancariaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private IRetiroService iRetiroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\n Cuenta Bancaria \n");
		
		CuentaBancaria cb=new CuentaBancaria();
		cb.setNumero("123");
		cb.setSaldo(new BigDecimal(200));
		
		this.iCuentaBancariaService.insertarCuenta(cb);
		
		this.iCuentaBancariaService.buscarCuenta("123");
		
		cb.setNumero("132");
		this.iCuentaBancariaService.actualizarCuenta(cb);
		
		this.iCuentaBancariaService.borrarCuenta("132");
		
		System.out.println("\n Transferencia \n");
		
		this.iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		
		this.iTransferenciaService.buscar("12");
		
		this.iTransferenciaService.actualizar(LocalDateTime.of(2022, 2, 16, 21, 10));
		
		this.iTransferenciaService.eliminar("13");
		
		System.out.println("\n Deposito \n");
		
		this.depositoService.realizarDeposito("14", new BigDecimal(50));
		
		this.depositoService.buscarDeposito("14");
		
		this.depositoService.actualizarFechaDeposito(LocalDateTime.now());
		
		this.depositoService.eliminarDeposito("14");
		
		System.out.println("\n Retiro \n");
		
		this.iRetiroService.realizarRetiro("1234","23", new BigDecimal(100));
		
		this.iRetiroService.buscarPorId("1234");
		
		this.iRetiroService.actualizarCuentaRetiro("21");
		
		this.iRetiroService.eliminarRetiroDeFecha(LocalDateTime.of(2022, 4, 12, 16, 40));
	}

}