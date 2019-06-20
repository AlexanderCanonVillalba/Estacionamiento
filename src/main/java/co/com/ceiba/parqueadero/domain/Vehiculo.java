package co.com.ceiba.parqueadero.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;


@Data
public class Vehiculo {

	private long id ;
	private String placa ;
	private String tipovehiculo ;
	private Date fechaini ;
	private String horaini;
	private Date fechafin ;
	private  BigDecimal  precio;
	
	
	
}
