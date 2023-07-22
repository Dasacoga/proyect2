package page.med.Proyect_2springbootJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Proyect2springbootJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyect2springbootJavaApplication.class, args);
	}

}
