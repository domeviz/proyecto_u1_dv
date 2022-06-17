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
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;
import com.uce.edu.demo.tienda.modelo.Empleado;
import com.uce.edu.demo.tienda.modelo.Encargado;
import com.uce.edu.demo.tienda.modelo.Propietario;
import com.uce.edu.demo.tienda.modelo.Sucursal;
import com.uce.edu.demo.tienda.modelo.Tienda;
import com.uce.edu.demo.tienda.service.ITiendaService;

@SpringBootApplication
public class ProyectoU1DvApplication implements CommandLineRunner {
	
	@Autowired
	private Encargado encargado;
	
	@Autowired
	private Encargado encargado1;
	
	@Autowired
	private Empleado empleado;
	
	@Autowired
	private Empleado empleado1;
	
	@Autowired
	private ITiendaService iTiendaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("EJEMPLO SINGLETON");
		this.encargado.setNombre("Domenica");
		this.encargado.setApellido("Vizcarra");
		System.out.println("Encargado  : "+this.encargado);
		System.out.println("Encargado 1: "+this.encargado1);
		
		System.out.println("Modificando el apellido:");
		this.encargado1.setApellido("Vasconez");
		System.out.println("Encargado  : "+this.encargado);
		System.out.println("Encargado 1: "+this.encargado1);
		
		System.out.println("EJEMPLO PROTOTYPE");
		this.empleado.setNombre("Karina");
		this.empleado.setApellido("Rea");
		System.out.println("Empleado  : "+this.empleado);
		System.out.println("Empleado 1: "+this.empleado1);
		
		System.out.println("Modificando el apellido:");
		this.empleado1.setApellido("Caceres");
		System.out.println("Empleado  : "+this.empleado);
		System.out.println("Empleado 1: "+this.empleado1);
		
		Propietario p=new Propietario();
		p.setNombre("Alison");
		p.setApellido("Cabrera");
		p.setCedula("124578");
		
		Sucursal s=new Sucursal();
		s.setCiudad("Quito");
		s.setDireccion("Villaflora N25-33");
		s.setNombre("Sucursal Villaflora");
		
		Sucursal s2=new Sucursal();
		s2.setCiudad("Quito");
		s2.setDireccion("Cotocollao Oe36-22");
		s2.setNombre("Sucursal Cotocollao");
		
		List<Sucursal> listaS=new ArrayList<>();
		listaS.add(s);
		listaS.add(s2);
		
		System.out.println("\n Ejemplo Tienda");
		
		Tienda tienda=new Tienda();
		tienda.setNumero("1234");
		tienda.setPropietario(p);
		tienda.setSucursal(listaS);
		this.iTiendaService.ingresar(tienda);
	}

}