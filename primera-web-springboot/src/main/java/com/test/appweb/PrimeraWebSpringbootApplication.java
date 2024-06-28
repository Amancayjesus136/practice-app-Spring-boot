package com.test.appweb;

import com.test.appweb.entities.Persona;
import com.test.appweb.repository.PersonaRepository;
import com.test.appweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication {

	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);

	}

	/*@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(6L,"Valera",21));
		personaService.crearPersona(new Persona(7L,"Brigithe",21));
		personaService.crearPersona(new Persona(8L,"Anny",20));
		personaService.crearPersona(new Persona(9L,"Yilian",17));
		personaService.crearPersona(new Persona(10L,"Nayeli",19));

		System.out.println("Número de personas de la tabla : " + personaService.contarPersonas());

		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.print("Nombre de la personas : " + p.getNombre()));
	}*/
}
