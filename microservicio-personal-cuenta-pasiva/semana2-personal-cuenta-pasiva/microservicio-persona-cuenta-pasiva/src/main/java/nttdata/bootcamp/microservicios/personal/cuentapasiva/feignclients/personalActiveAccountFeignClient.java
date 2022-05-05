package nttdata.bootcamp.microservicios.personal.cuentapasiva.feignclients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "microservicio-activo-personal")
public interface personalActiveAccountFeignClient {

}
