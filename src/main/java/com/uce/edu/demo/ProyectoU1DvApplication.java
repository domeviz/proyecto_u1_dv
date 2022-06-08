package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1DvApplication implements CommandLineRunner {
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		
		this.depositoService.realizarDeposito("14", new BigDecimal(50));
		
	}

}