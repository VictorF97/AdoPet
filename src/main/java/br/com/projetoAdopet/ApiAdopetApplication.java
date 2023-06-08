package br.com.projetoAdopet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

							//CLASSE PRINCIPAL 

public class ApiAdopetApplication implements CommandLineRunner {
	//Para criar uma instancia da nossa interface Repository
	@Autowired
	
	public static void main(String[] args) {
		SpringApplication.run(ApiAdopetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		
	}

}
