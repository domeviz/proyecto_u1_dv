package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.banco.Transaccion1;
import com.uce.edu.demo.banco.Transaccion2;
import com.uce.edu.demo.banco.Transaccion3;

@SpringBootApplication
public class ProyectoU1DvApplication implements CommandLineRunner {

	// Taller
	// 1) DI por atributo
//	@Autowired
//	private CitaMedica cita;

//	@Autowired
//	private CitaMedica2 cita2;

	// Tarea 5
	@Autowired
	private Transaccion1 transaccion1;

	@Autowired
	private Transaccion2 transaccion2;

	@Autowired
	private Transaccion3 transaccion3;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Mi primer proyecto con Spring Framework");
//		Taller 5
//		String respuesta =this.cita2.agendar(LocalDateTime.now(),"Javier","Teran",32,"Quito","Pepito",19);
//		System.out.println(respuesta);

		System.out.println("Tarea 5");

		System.out.println("1) DI por atributos ");
		String transaccion1 = this.transaccion1.transaccion(LocalDateTime.now(), 1234566, "Quito", "Domenica",
				"Vizcarra", 3839130);
		System.out.println(transaccion1);

		System.out.println("2) DI por constructor ");
		String transaccion2 = this.transaccion2.transaccion(LocalDateTime.now(), 1234566, "Quito", "Domenica",
				"Vizcarra", 3839130);
		System.out.println(transaccion2);

		System.out.println("3) DI por metodos SET ");
		String transaccion3 = this.transaccion3.transaccion(LocalDateTime.now(), 1234566, "Quito", "Domenica",
				"Vizcarra", 3839130);
		System.out.println(transaccion3);

	}

}