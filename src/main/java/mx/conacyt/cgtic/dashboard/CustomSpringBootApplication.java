package mx.conacyt.cgtic.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomSpringBootApplication {

	public static void main(String[] args) {
	    System.out.println("hola mundo"); 
		SpringApplication.run(CustomSpringBootApplication.class, args);
	}
}
