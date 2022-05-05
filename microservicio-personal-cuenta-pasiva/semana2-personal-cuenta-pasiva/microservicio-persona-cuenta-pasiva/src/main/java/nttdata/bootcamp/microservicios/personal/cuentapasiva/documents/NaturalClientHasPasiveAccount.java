package nttdata.bootcamp.microservicios.personal.cuentapasiva.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "naturalperson-has-passive-account")
public class NaturalClientHasPasiveAccount {

	/*
	 * ENUNCIADO 1 Un cliente personal solo puede tener un máximo de una cuenta de
	 * ahorro, una cuenta corriente o cuentas a plazo fijo.
	 * 
	 * Interpreto que se respeta el codigo de Personal Asset y se elige solo uno y
	 * los demas null o [no elegido]
	 */

	@Id
	private String id;

	private String naturalClientId;

	private String passiveSavingAccountId;

	private String currentPassiveAccountId;

	private String fixedTermPassiveAccountId;

	private String personalAssetId;

	private Double currentAccountStatement;

	private int currentMovements;

	private String transactionname;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;

}
