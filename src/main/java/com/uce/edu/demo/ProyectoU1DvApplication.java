package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1DvApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e=new Estudiante();
		e.setNombre("Domenica");
		e.setApellido("Vizcarra");
		e.setCedula("123456789");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1=new Estudiante();
		e1.setNombre("Carmen");
		e1.setApellido("Mendez");
		e1.setCedula("987654321");
		this.estudianteService.ingresarEstudiante(e1);
		
		//Usar los 3 restantes
		e.setCedula("123456879");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.buscarPorApellido("Vizcarra");
		this.estudianteService.eliminarEstudiante("987654321");
	}

}