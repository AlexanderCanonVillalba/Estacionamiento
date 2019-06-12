package co.com.ceiba.parqueadero.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Ticket {

	
	private long id  ;
	private long vehiculo ;
	private Date fechaini;
	private Date fechafin  ;
	private double precio  ;
}
