package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1DvApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\n Tarea 6 \n");
		
		System.out.println("\n Estudiante \n");
		
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
		
		e.setCedula("123456879");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.buscarPorApellido("Vizcarra");
		this.estudianteService.eliminarEstudiante("987654321");
		
		System.out.println("\n Materia \n");
		
		Materia m=new Materia();
		m.setNombre("Programacion Avanzada");
		m.setSemestre("Quinto");
		
		Materia m2=new Materia();
		m2.setNombre("Base de Datos");
		m2.setSemestre("Quinto");
		
		Materia m3=new Materia();
		m3.setNombre("Patrones");
		m3.setSemestre("Quinto");
		
		Materia m4=new Materia();
		m4.setNombre("Inteligencia Artificial");
		m4.setSemestre("Sexto");
		
		this.materiaService.ingresar(m);
		this.materiaService.ingresar(m2);
		this.materiaService.ingresar(m3);
		this.materiaService.ingresar(m4);
		this.materiaService.buscar("Programacion Avanzada");
		m.setSemestre("Sexto");
		this.materiaService.actualizar(m);
		this.materiaService.eliminar("Patrones");
		
		System.out.println("\n Matricula \n");
		
		Matricula mt=new Matricula();
		mt.setEstudiante(e);
		mt.setNumero("111222");
		List<Materia> aula=new ArrayList<Materia>();
		aula.add(m);
		aula.add(m2);
		mt.setMateria((List<Materia>) aula);
		
		Matricula mt2=new Matricula();
		mt2.setEstudiante(e);
		mt2.setNumero("111333");
		List<Materia> aula2=new ArrayList<Materia>();
		aula2.add(m4);
		mt2.setMateria((List<Materia>) aula2);
		
		this.matriculaService.ingresar(mt);
		this.matriculaService.ingresar(mt2);
		this.matriculaService.buscar("111222");
		mt2.setNumero("111444");
		this.matriculaService.actualizar(mt2);
		this.matriculaService.eliminar("111444");
		
	}

}