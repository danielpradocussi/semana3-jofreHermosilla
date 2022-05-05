package nttdata.bootcamp.microservicios.cargar.creditos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioCargarCreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioCargarCreditoApplication.class, args);
	}

}
