package mx.conacyt.cgtic.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomSpringBootApplication {

	public static void main(String[] args) {
	    System.out.println("hola mundo 1"); 
        System.out.println("hola mundo 2"); 
        System.out.println("hola mundo 3"); 
		SpringApplication.run(CustomSpringBootApplication.class, args);
	}
}
