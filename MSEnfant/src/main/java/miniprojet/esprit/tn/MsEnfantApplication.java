package miniprojet.esprit.tn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;





@SpringBootApplication
@EnableEurekaClient
public class MsEnfantApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEnfantApplication.class, args);
	}

}
