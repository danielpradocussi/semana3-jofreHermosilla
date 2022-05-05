package nttdata.bootcamp.microservicios.cargar.creditos.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
@Document(collection = "charge-credit-account")
public class ChargeCreditAccount {
	@Id
	private String id;
	
    	//si 
	private String naturalPersonId;
	
	private String legalPersonId;
	
	private String creditCardClientId;
	
	private String PersonalAccountId;
	
	private String LegallAccountId;
	
    
	
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
}
