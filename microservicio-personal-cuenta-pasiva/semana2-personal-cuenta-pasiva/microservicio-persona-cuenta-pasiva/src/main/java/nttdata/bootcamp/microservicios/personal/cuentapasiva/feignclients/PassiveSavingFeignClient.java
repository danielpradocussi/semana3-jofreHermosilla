package nttdata.bootcamp.microservicios.personal.cuentapasiva.feignclients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "microservicio-pasivo-ahorro")
public interface PassiveSavingFeignClient {

}
