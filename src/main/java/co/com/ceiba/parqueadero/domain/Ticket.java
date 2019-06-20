package co.com.ceiba.parqueadero.domain;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ticket {

	
	private long id  ;
	private Vehiculo vehiculo ;
	private Date fechaini;
	private Date fechafin  ;
	private double precio  ;
}
