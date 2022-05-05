package nttdata.bootcamp.microservicios.retiros.cuentas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioRetirosCuentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioRetirosCuentasApplication.class, args);
	}

}
