package nttdata.bootcamp.microservicios.pagos.creditos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioPagosCreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioPagosCreditoApplication.class, args);
	}

}
