package tn.esprit.spring;

import java.awt.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class EnseignantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnseignantServiceApplication.class, args);
	}

	@Autowired
	IEnseignantRepo repo;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repo.save(new Enseignant("khalil", "sayhi","khalil.sayhi@esprit.tn", 1));
			repo.save(new Enseignant("ali", "brigui","khalil.sayhi@esprit.tn", 2));
			repo.save(new Enseignant("ala", "kaddour","khalil.sayhi@esprit.tn", 3));
			// fetch
			repo.findAll().forEach(System.out::println);

		};
	}
	
}
