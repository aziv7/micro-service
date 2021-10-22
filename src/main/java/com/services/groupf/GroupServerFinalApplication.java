package com.services.groupf;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class GroupServerFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupServerFinalApplication.class, args);
	}
	
	@Autowired
	private GroupRepository Grouprepository;
	//private List<Activities> activities = new ArrayList<Activities>();
	@Bean
	ApplicationRunner init() {
		/*Activities activ = new Activities(1);
		this.activities.add(activ);
		this.activities.add(activ);
		this.activities.add(activ);
		this.activities.add(activ);*/
		return (args) -> {
		
			// save
			//Grouprepository.save(new Group("test group", "test group"));
			// fetch
			Grouprepository.findAll().forEach(System.out::println);

		};
	}

}
