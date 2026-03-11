package in.Nayeli.literalura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LiteraluraApplication {

	public static void main(String[] args) {

		SpringApplication.run(LiteraluraApplication.class, args);
		System.out.println("Proyecto Literalura iniciado correctamente");
		System.out.println("Preparado para consumir la API de libros");

	}

}
