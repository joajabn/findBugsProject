package pl.paniodprogramowania.findBugsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@ConfigurationPropertiesScan("pl.paniodprogramowania")
@ComponentScan(
		basePackages = {
				"org.bitbucket.tek.nik.simplifiedswagger",
				"pl.paniodprogramowania"
		})
@SpringBootApplication
public class FindBugsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindBugsProjectApplication.class, args);
	}

}
