package nttdata.bootcamp.microservicios.pasivo.ahorro.controller;

import java.util.Date;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nttdata.bootcamp.microservicios.pasivo.ahorro.documents.PassiveSavingAccount;
import nttdata.bootcamp.microservicios.pasivo.ahorro.services.PassiveSavingAccountService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PassiveSavingAccountController {
	private static final Logger LOGGER = LoggerFactory.getLogger(PassiveSavingAccountController.class);

	@Autowired
	private PassiveSavingAccountService service;

	@GetMapping("/all")
	public Flux<PassiveSavingAccount> searchAll() {
		Flux<PassiveSavingAccount> passivesaving = service.findAlls();
		LOGGER.info("PASSIVE SAVING ACCOUNT registered: " + passivesaving);
		return passivesaving;
	}

	@GetMapping("/id/{id}")
	public Mono<PassiveSavingAccount> searchById(@PathVariable String id) {
		LOGGER.info("Passive Saving Account id: " + service.findById(id) + " code : " + id);
		return service.findById(id);
	}

	@PostMapping("/create-passive-saving-account")
	public Mono<PassiveSavingAccount> passiveSavingAccount(
			@Valid @RequestBody PassiveSavingAccount passiveSavingAccount) {
		LOGGER.info("PASSIVE SAVING ACCOUNT create: " + service.saves(passiveSavingAccount));
		return service.saves(passiveSavingAccount);
	}
	
	
	@PostMapping("/create-passive-account")
	public Mono<PassiveSavingAccount> createpassiveAccount(@Valid @RequestBody PassiveSavingAccount creditCardAccount) {
	LOGGER.info("Credit Card account create: " + service.saves(creditCardAccount));
	return service.saves(creditCardAccount);
	}
	
	@PutMapping("/update-pasive-account/{id}")
	public ResponseEntity<Mono<?>> updatePassiveAccount(@PathVariable String id,
			@Valid @RequestBody PassiveSavingAccount passiveaccount) {
		Mono.just(passiveaccount).doOnNext(t -> {
			passiveaccount.setId(id);
			t.setCreateAt(new Date());
		
		}).onErrorReturn(passiveaccount).onErrorResume(e -> Mono.just(passiveaccount))
			.onErrorMap(f -> new InterruptedException(f.getMessage())).subscribe(x -> LOGGER.info(x.toString()));
		
		Mono<PassiveSavingAccount> newpassiveaccount = service.saves(passiveaccount);
		
		if (newpassiveaccount != null) {
		return new ResponseEntity<>(newpassiveaccount, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(Mono.just(new PassiveSavingAccount()), HttpStatus.I_AM_A_TEAPOT);
	}
	
	@DeleteMapping("/eliminar-passive-account/{id}")
	public ResponseEntity<Mono<Void>> deletePassiveAccount(@PathVariable String id) {
	PassiveSavingAccount passiveaccount = new PassiveSavingAccount();
	passiveaccount .setId(id);
	Mono<PassiveSavingAccount> newPassiveSavingAccount = service.findById(id);
	newPassiveSavingAccount.subscribe();
	Mono<Void> test = service.delete(passiveaccount );
	test.subscribe();
	return ResponseEntity.noContent().build();
	}
}
