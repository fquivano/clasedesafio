package com.clasealuracursos.clasesdesafio;

import com.clasealuracursos.clasesdesafio.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClasesdesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClasesdesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
