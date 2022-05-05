package nttdata.bootcamp.microservicios.personal.cuentapasiva.services;

import nttdata.bootcamp.microservicios.personal.cuentapasiva.documents.NaturalClientHasPasiveAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NaturalClientHasPassiveAccountService {

	public Mono<NaturalClientHasPasiveAccount> findById(String id);

	public Flux<NaturalClientHasPasiveAccount> findAlls();

	public Mono<NaturalClientHasPasiveAccount> saves(NaturalClientHasPasiveAccount document);

	public Mono<Void> delete(NaturalClientHasPasiveAccount document);

}
