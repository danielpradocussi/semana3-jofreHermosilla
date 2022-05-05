package nttdata.bootcamp.microservicios.usar.cuentas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioUsarCuentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioUsarCuentasApplication.class, args);
	}

}
